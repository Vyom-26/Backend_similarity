package com.backend.similarity.service;

import com.backend.similarity.dto.ContestDTO;
import com.backend.similarity.model.Contest;
import com.backend.similarity.repository.ContestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ContestService {

    private final ContestRepository contestRepository;

    @Autowired
    public ContestService(ContestRepository contestRepository) {
        this.contestRepository = contestRepository;
    }

    public List<ContestDTO> getAllContests() {
        return contestRepository.findAll().stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    public ContestDTO getContestById(String contestId) {
        Optional<Contest> contest = contestRepository.findById(contestId);
        return contest.map(this::convertToDTO).orElse(null);
    }

    private ContestDTO convertToDTO(Contest contest) {
        return new ContestDTO(
                contest.getContestId(),
                contest.getTitle(),
                contest.getStartDate(),
                contest.getParticipantCount()
        );
    }
}