package com.thamirestissot.assembly.api;

import com.thamirestissot.assembly.api.request.AgendaRequest;
import com.thamirestissot.assembly.mapper.CreateAgendaRequestMapper;
import com.thamirestissot.assembly.service.AgendaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/agenda")
public class AgendaApi {
    @Autowired
    private AgendaService agendaService;
    private Logger logger = LoggerFactory.getLogger(AgendaApi.class);

    @PostMapping("/create")
    public ResponseEntity create(@RequestBody AgendaRequest request) {
        logger.info("Agenda creation request was received.");

        return ResponseEntity.ok(
                agendaService.create(
                        CreateAgendaRequestMapper.from(request)
                )
        );
    }

    @GetMapping("/getAll")
    public ResponseEntity getAll() {
        logger.info("All agenda request was received.");

        return ResponseEntity.ok(
                agendaService.getAll()
        );
    }
}