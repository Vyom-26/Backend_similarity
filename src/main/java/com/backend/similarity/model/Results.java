package com.backend.similarity.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@IdClass(ResultsId.class)
@Table(name = "results")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Results {

    @Id
    @Column(name = "submission_id1", nullable = false, length = 255)
    private String submissionId1;

    @Id
    @Column(name = "submission_id2", nullable = false, length = 255)
    private String submissionId2;

    @Column(name = "average_similarity")
    private float averageSimilarity;  // ✅ Matches DOUBLE PRECISION

    @Column(name = "contest_id", length = 255)
    private String contestId;  // ✅ Matches VARCHAR(255)

    @ManyToOne
    @JoinColumn(name = "question_id", referencedColumnName = "question_id")
    private Question question;  // ✅ References question_id from questions table

    @Column(name = "language", length = 255)
    private String language;  // ✅ Matches VARCHAR(255)

    @Column(name = "rank1")
    private Integer rank1;  // ✅ Matches INT

    @Column(name = "rank2")
    private Integer rank2;  // ✅ Matches INT

    @Column(name = "username1", length = 255)
    private String username1;  // ✅ Matches VARCHAR(255)

    @Column(name = "username2", length = 255)
    private String username2;  // ✅ Matches VARCHAR(255)

    @Column(name = "submission1_time")
    private LocalDateTime submission1Time;

    @Column(name = "submission2_time")
    private LocalDateTime submission2Time;

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

    public float getAverageSimilarity() {
        return averageSimilarity;
    }

    public void setAverageSimilarity(float averageSimilarity) {
        this.averageSimilarity = averageSimilarity;
    }

    public String getContestId() {
        return contestId;
    }

    public void setContestId(String contestId) {
        this.contestId = contestId;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
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
