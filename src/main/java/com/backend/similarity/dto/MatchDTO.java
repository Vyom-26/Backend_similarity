package com.backend.similarity.dto;

import java.time.LocalDateTime;

public class MatchDTO {
    private String submissionId1;
    private String submissionId2;
    private String username1;
    private String username2;
    private float similarity;
    private String language;
    private Integer rank1;
    private Integer rank2;
    private LocalDateTime submission1Time;
    private LocalDateTime submission2Time;

    // Constructors
    public MatchDTO() {}

    public MatchDTO(String submissionId1, String submissionId2, String username1, String username2,
                    float similarity, String language, Integer rank1, Integer rank2,
                    LocalDateTime submission1Time, LocalDateTime submission2Time) {
        this.submissionId1 = submissionId1;
        this.submissionId2 = submissionId2;
        this.username1 = username1;
        this.username2 = username2;
        this.similarity = similarity;
        this.language = language;
        this.rank1 = rank1;
        this.rank2 = rank2;
        this.submission1Time = submission1Time;
        this.submission2Time = submission2Time;
    }

    // Getters and Setters
    public String getSubmissionId1() {
        return submissionId1;
    }

    public void setSubmissionId1(String submissionId1) {
        this.submissionId1 = submissionId1;
    }

    public String getSubmissionId2() {
        return submissionId2;
    }

    public void setSubmissionId2(String submissionId2) {
        this.submissionId2 = submissionId2;
    }

    public String getUsername1() {
        return username1;
    }

    public void setUsername1(String username1) {
        this.username1 = username1;
    }

    public String getUsername2() {
        return username2;
    }

    public void setUsername2(String username2) {
        this.username2 = username2;
    }

    public float getSimilarity() {
        return similarity;
    }

    public void setSimilarity(float similarity) {
        this.similarity = similarity;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Integer getRank1() {
        return rank1;
    }

    public void setRank1(Integer rank1) {
        this.rank1 = rank1;
    }

    public Integer getRank2() {
        return rank2;
    }

    public void setRank2(Integer rank2) {
        this.rank2 = rank2;
    }

    public LocalDateTime getSubmission1Time() {
        return submission1Time;
    }

    public void setSubmission1Time(LocalDateTime submission1Time) {
        this.submission1Time = submission1Time;
    }

    public LocalDateTime getSubmission2Time() {
        return submission2Time;
    }

    public void setSubmission2Time(LocalDateTime submission2Time) {
        this.submission2Time = submission2Time;
    }
}
