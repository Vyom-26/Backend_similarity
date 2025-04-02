package com.backend.similarity.dto;

import java.time.LocalDateTime;

public class ContestDTO {
    private String contestId;
    private String title;
    private LocalDateTime startDate;
    private Integer participantCount;

    // Constructors
    public ContestDTO() {}

    public ContestDTO(String contestId, String title, LocalDateTime startDate, Integer participantCount) {
        this.contestId = contestId;
        this.title = title;
        this.startDate = startDate;
        this.participantCount = participantCount;
    }

    // Getters and Setters
    public String getContestId() {
        return contestId;
    }

    public void setContestId(String contestId) {
        this.contestId = contestId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public Integer getParticipantCount() {
        return participantCount;
    }

    public void setParticipantCount(Integer participantCount) {
        this.participantCount = participantCount;
    }
}