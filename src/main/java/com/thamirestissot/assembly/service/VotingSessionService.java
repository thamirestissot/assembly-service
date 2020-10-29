package com.thamirestissot.assembly.service;

import com.thamirestissot.assembly.exception.InvalidDateException;
import com.thamirestissot.assembly.mapper.OpenVotingSessionRepositoryMapper;
import com.thamirestissot.assembly.model.VotingSession;
import com.thamirestissot.assembly.repository.VotingSessionRepository;
import com.thamirestissot.assembly.repository.entity.VotingSessionEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class VotingSessionService {

    private static final long DEFAULT_DURATION = 1;

    @Autowired
    private final VotingSessionRepository votingSessionRepository;
    private Logger logger = LoggerFactory.getLogger(VotingSessionService.class);

    public VotingSessionService(VotingSessionRepository votingSessionRepository) {
        this.votingSessionRepository = votingSessionRepository;
    }

    public Optional<VotingSessionEntity> getVotingSession(Integer id) {
        return votingSessionRepository.findById(id);
    }

    public List<VotingSessionEntity> getAll() {
        return votingSessionRepository.findAll();
    }

    public Integer open(VotingSession votingSession) {

        return votingSessionRepository.save(
                OpenVotingSessionRepositoryMapper.from(
                        votingSession,
                        calculateDueDate(votingSession)
                )
        )
                .getId();
    }

    private LocalDateTime calculateDueDate(VotingSession votingSession) {
        LocalDateTime dueDate;

        try {
            validDateVerify(votingSession.getDueDate());
            dueDate = votingSession.getDueDate();

        } catch (Exception e) {
            logger.info(votingSession.toString(), e);
            dueDate = LocalDateTime.now().plusMinutes(DEFAULT_DURATION);

        }
        return dueDate;
    }

    private void validDateVerify(LocalDateTime dueDate) throws InvalidDateException {

        if (dueDate.isBefore(LocalDateTime.now().plusMinutes(DEFAULT_DURATION)))
            throw new InvalidDateException();
    }
}
