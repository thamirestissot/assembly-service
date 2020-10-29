package com.thamirestissot.assembly.mapper;

import com.thamirestissot.assembly.model.Agenda;
import com.thamirestissot.assembly.repository.entity.AgendaEntity;

public class CreateAgendaRepositoryMapper {

    public static AgendaEntity from(Agenda agenda) {
        AgendaEntity agendaEntity = new AgendaEntity(agenda.getSubject());
        agendaEntity.setSubject(agenda.getSubject());
        return agendaEntity;
    }
}