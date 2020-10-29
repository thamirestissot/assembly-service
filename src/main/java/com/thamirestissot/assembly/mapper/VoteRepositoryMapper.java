package com.thamirestissot.assembly.mapper;

import com.thamirestissot.assembly.model.Vote;
import com.thamirestissot.assembly.repository.entity.VoteEntity;

public class VoteRepositoryMapper {

    public static VoteEntity from(Vote vote) {
        VoteEntity voteEntity = new VoteEntity();
        voteEntity.setOption(vote.getOption());
        voteEntity.setUserId(vote.getUserId());
        voteEntity.setVotingSessionId(vote.getVotingSessionId());

        return voteEntity;
    }
}
