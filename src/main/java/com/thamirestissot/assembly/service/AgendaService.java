package com.thamirestissot.assembly.service;

import com.thamirestissot.assembly.mapper.CreateAgendaRepositoryMapper;
import com.thamirestissot.assembly.model.Agenda;
import com.thamirestissot.assembly.repository.AgendaRepository;
import com.thamirestissot.assembly.repository.entity.AgendaEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgendaService {

    @Autowired
    private final AgendaRepository agendaRepository;

    public AgendaService(AgendaRepository agendaRepository) {
        this.agendaRepository = agendaRepository;
    }

    public Integer create(Agenda agenda) {
        return agendaRepository
                .save(
                        CreateAgendaRepositoryMapper.from(agenda)
                )
                .getId();
    }

    public Iterable<AgendaEntity> getAll() {
        return agendaRepository.findAll();
    }
}