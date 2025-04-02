package com.backend.similarity.dto;

import java.time.LocalDateTime;

public class SubmissionDTO {
    private String username;
    private Integer rank;
    private String language;
    private LocalDateTime submissionTime;

    // Constructors
    public SubmissionDTO() {}

    public SubmissionDTO(String username, Integer rank, String language, LocalDateTime submissionTime) {
        this.username = username;
        this.rank = rank;
        this.language = language;
        this.submissionTime = submissionTime;
    }

    // Getters and Setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public LocalDateTime getSubmissionTime() {
        return submissionTime;
    }

    public void setSubmissionTime(LocalDateTime submissionTime) {
        this.submissionTime = submissionTime;
    }
}