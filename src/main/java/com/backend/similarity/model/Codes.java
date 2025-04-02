package com.backend.similarity.model;

import jakarta.persistence.*;

@Entity
@Table(name = "codes")
public class Codes {

    @Id
    @Column(name = "submission_id", nullable = false, length = 255)
    private String submissionId;

    @Basic(fetch = FetchType.LAZY)
    @Column(name = "submitted_code", nullable = false, columnDefinition = "TEXT")
    private String submittedCode;

    public Codes() {}

    public Codes(String submissionId, String submittedCode) {
        this.submissionId = submissionId;
        this.submittedCode = submittedCode;
    }

    // Getters and Setters
    public String getSubmissionId() {
        return submissionId;
    }

    public void setSubmissionId(String submissionId) {
        this.submissionId = submissionId;
    }

    public String getSubmittedCode() {
        return submittedCode;
    }

    public void setSubmittedCode(String submittedCode) {
        this.submittedCode = submittedCode;
    }
}
