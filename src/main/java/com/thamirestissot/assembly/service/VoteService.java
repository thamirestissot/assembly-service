package com.thamirestissot.assembly.service;

import com.thamirestissot.assembly.exception.UserAlreadyVotedException;
import com.thamirestissot.assembly.mapper.VoteRepositoryMapper;
import com.thamirestissot.assembly.model.Vote;
import com.thamirestissot.assembly.model.VotingSession;
import com.thamirestissot.assembly.repository.VoteRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VoteService {
    @Autowired
    private final VoteRepository votinRepository;
    private Logger logger = LoggerFactory.getLogger(VotingSession.class);

    public VoteService(VoteRepository votinRepository) {
        this.votinRepository = votinRepository;
    }

    public void create(Vote vote) {
        alreadyVotedVerify(vote.getUserId());
        votinRepository.save(
                VoteRepositoryMapper.from(vote)
        );
    }

    private void alreadyVotedVerify(Integer userId) {
        if (votinRepository.findAll().stream().anyMatch(voteEntity -> voteEntity.getUserId() == userId))
            throw new UserAlreadyVotedException();
    }

}
