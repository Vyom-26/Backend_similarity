package com.backend.similarity.controller;

import com.backend.similarity.dto.QuestionDTO;
import com.backend.similarity.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping()
@CrossOrigin()
public class QuestionController {

    private final QuestionService questionService;

    @Autowired
    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping()
    public ResponseEntity<List<QuestionDTO>> getQuestionsByContestId(@PathVariable String contestId) {
        List<QuestionDTO> questions = questionService.getQuestionsByContestId(contestId);
        return ResponseEntity.ok(questions);
    }

    @GetMapping()
    public ResponseEntity<QuestionDTO> getQuestionById(@PathVariable Integer questionId) {
        QuestionDTO question = questionService.getQuestionById(questionId);
        if (question != null) {
            return ResponseEntity.ok(question);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}