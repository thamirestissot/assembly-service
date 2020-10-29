package com.thamirestissot.assembly.api;

import com.thamirestissot.assembly.api.request.VotingSessionRequest;
import com.thamirestissot.assembly.mapper.OpenVotingSessionRequestMapper;
import com.thamirestissot.assembly.service.VotingSessionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/voting-session")
public class VotingSessionApi {

    @Autowired
    private VotingSessionService VotingSessionService;
    private Logger logger = LoggerFactory.getLogger(VotingSessionApi.class);

    @PostMapping("/open")
    public ResponseEntity open(@RequestBody VotingSessionRequest request) {
        logger.info("request for the creation of the voting session received.");

        return ResponseEntity.ok(
                VotingSessionService.open(
                        OpenVotingSessionRequestMapper.from(request)
                )
        );
    }

    @GetMapping("/getAll")
    public ResponseEntity getAll() {
        logger.info("All voting session request received.");

        return ResponseEntity.ok(
                VotingSessionService.getAll()
        );
    }

    @GetMapping("/getById")
    public ResponseEntity get(@RequestBody VotingSessionRequest request) {
        logger.info("Voting session request received.");

        return ResponseEntity.ok(
                VotingSessionService.open(
                        OpenVotingSessionRequestMapper.from(request)
                )
        );
    }
}
