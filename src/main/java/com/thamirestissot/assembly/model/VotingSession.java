package com.thamirestissot.assembly.model;

import java.time.LocalDateTime;

public class VotingSession {
    private Integer id;
    private Integer agendaId;
    private LocalDateTime dueDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAgendaId() {
        return agendaId;
    }

    public void setAgendaId(Integer agendaId) {
        this.agendaId = agendaId;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return "VotingSession{" +
                "id=" + id +
                ", agendaId=" + agendaId +
                ", dueDate=" + dueDate +
                '}';
    }
}