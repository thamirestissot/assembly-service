package com.thamirestissot.assembly.mapper;

import com.thamirestissot.assembly.api.request.AgendaRequest;
import com.thamirestissot.assembly.model.Agenda;

public class CreateAgendaRequestMapper {

    public static Agenda from(AgendaRequest request) {
        return new Agenda().setSubject(request.getSubject());
    }

}