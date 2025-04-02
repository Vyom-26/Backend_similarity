package com.backend.similarity.service;

import com.backend.similarity.dto.QuestionDTO;
import com.backend.similarity.model.Contest;
import com.backend.similarity.model.Question;
import com.backend.similarity.repository.ContestRepository;
import com.backend.similarity.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class QuestionService {

    private final QuestionRepository questionRepository;
    private final ContestRepository contestRepository;

    @Autowired
    public QuestionService(QuestionRepository questionRepository, ContestRepository contestRepository) {
        this.questionRepository = questionRepository;
        this.contestRepository = contestRepository;
    }

    public List<QuestionDTO> getQuestionsByContestId(String contestId) {
        return questionRepository.findByContestContestId(contestId)
                .stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    public QuestionDTO getQuestionById(Integer questionId) {
        Optional<Question> question = questionRepository.findById(questionId);
        return question.map(this::convertToDTO).orElse(null);
    }

    private QuestionDTO convertToDTO(Question question) {
        return new QuestionDTO(
                question.getQuestionId(),
                question.getContest().getContestId(),
                question.getQuestionNumber(),
                question.getTitle(),
                question.getDifficulty(),
                question.getTotalSubmissions(),
                question.getTotalAccepted(),
                question.getUsersAccepted(),
                question.getPoint()
        );
    }
}