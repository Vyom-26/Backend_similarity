package com.backend.similarity.controller;

import com.backend.similarity.dto.ContestDTO;
import com.backend.similarity.service.ContestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping()
@CrossOrigin()
public class ContestController {

    private final ContestService contestService;

    @Autowired
    public ContestController(ContestService contestService) {
        this.contestService = contestService;
    }

    @GetMapping
    public ResponseEntity<List<ContestDTO>> getAllContests() {
        List<ContestDTO> contests = contestService.getAllContests();
        return ResponseEntity.ok(contests);
    }

    @GetMapping()
    public ResponseEntity<ContestDTO> getContestById(@PathVariable String contestId) {
        ContestDTO contest = contestService.getContestById(contestId);
        if (contest != null) {
            return ResponseEntity.ok(contest);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
