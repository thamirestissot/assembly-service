package com.thamirestissot.assembly.api.request;

import com.thamirestissot.assembly.type.VoteOption;

public class VoteRequest {
    private Integer idUser;
    private Integer idVotingSession;
    private VoteOption voteOption;

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public Integer getIdVotingSession() {
        return idVotingSession;
    }

    public void setIdVotingSession(Integer idVotingSession) {
        this.idVotingSession = idVotingSession;
    }

    public VoteOption getVoteOption() {
        return voteOption;
    }

    public void setVoteOption(VoteOption voteOption) {
        this.voteOption = voteOption;
    }
}
