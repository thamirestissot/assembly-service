package com.thamirestissot.assembly.api;

import com.thamirestissot.assembly.api.request.VoteRequest;
import com.thamirestissot.assembly.mapper.CreateVoteRequestMapper;
import com.thamirestissot.assembly.service.VoteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vote")
public class VoteApi {
    @Autowired
    private VoteService voteService;
    private Logger logger = LoggerFactory.getLogger(VoteApi.class);

    @PostMapping("/new")
    public ResponseEntity create(@RequestBody VoteRequest request) {
        logger.info("New vote request was received.");

        voteService.create(
                CreateVoteRequestMapper.from(request)
        );
        return (ResponseEntity) ResponseEntity.ok();
    }
}
