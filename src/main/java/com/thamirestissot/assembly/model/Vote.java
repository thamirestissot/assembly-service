package com.thamirestissot.assembly.model;

import com.thamirestissot.assembly.type.VoteOption;

public class Vote {
    private Integer id;
    private Integer votingSessionId;
    private Integer userId;
    private VoteOption option;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVotingSessionId() {
        return votingSessionId;
    }

    public void setVotingSessionId(Integer votingSessionId) {
        this.votingSessionId = votingSessionId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public VoteOption getOption() {
        return option;
    }

    public void setOption(VoteOption option) {
        this.option = option;
    }
}
