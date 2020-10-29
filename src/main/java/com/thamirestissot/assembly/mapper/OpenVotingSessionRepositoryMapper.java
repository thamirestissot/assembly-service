package com.thamirestissot.assembly.mapper;

import com.thamirestissot.assembly.model.VotingSession;
import com.thamirestissot.assembly.repository.entity.VotingSessionEntity;

import java.time.LocalDateTime;

public class OpenVotingSessionRepositoryMapper {
    public static VotingSessionEntity from(VotingSession votingSession, LocalDateTime localDateTime) {
        VotingSessionEntity votingSessionEntity = new VotingSessionEntity();
        votingSessionEntity.setAgendaId(votingSession.getAgendaId());
        votingSessionEntity.setDueDate(votingSession.getDueDate());
        return votingSessionEntity;
    }
}
