package com.backend.similarity.dto;

public class CodeDTO {
    private String submissionId;
    private String submittedCode;

    // Constructors
    public CodeDTO() {}

    public CodeDTO(String submissionId, String submittedCode) {
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