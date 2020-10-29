package com.thamirestissot.assembly.api.request;

import java.time.LocalDateTime;

public class VotingSessionRequest {
    private Integer agendaId;
    private Integer minutesLong;
    private LocalDateTime dueDate;

    public Integer getAgendaId() {
        return agendaId;
    }

    public void setAgendaId(Integer agendaId) {
        this.agendaId = agendaId;
    }

    public Integer getMinutesLong() {
        return minutesLong;
    }

    public void setMinutesLong(Integer minutesLong) {
        this.minutesLong = minutesLong;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }
}
