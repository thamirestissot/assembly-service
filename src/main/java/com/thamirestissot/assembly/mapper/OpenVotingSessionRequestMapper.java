package com.thamirestissot.assembly.mapper;

import com.thamirestissot.assembly.api.request.VotingSessionRequest;
import com.thamirestissot.assembly.model.VotingSession;

public class OpenVotingSessionRequestMapper {
    public static VotingSession from(VotingSessionRequest request) {
        VotingSession votingSession = new VotingSession();
        votingSession.setAgendaId(request.getAgendaId());
        votingSession.setDueDate(request.getDueDate());
        return votingSession;
    }
}
