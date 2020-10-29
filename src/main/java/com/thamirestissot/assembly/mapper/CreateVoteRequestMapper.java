package com.thamirestissot.assembly.mapper;

import com.thamirestissot.assembly.api.request.VoteRequest;
import com.thamirestissot.assembly.model.Vote;

public class CreateVoteRequestMapper {

    public static Vote from(VoteRequest request) {
        Vote vote = new Vote();
        vote.setVotingSessionId(request.getIdVotingSession());
        vote.setUserId(request.getIdUser());
        vote.setOption(request.getVoteOption());
        return vote;
    }
}
