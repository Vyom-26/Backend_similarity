package com.backend.similarity.model;

import java.io.Serializable;
import java.util.Objects;

public class ResultsId implements Serializable {
    private String submissionId1;
    private String submissionId2;

    // Default constructor
    public ResultsId() {}

    public ResultsId(String submissionId1, String submissionId2) {
        this.submissionId1 = submissionId1;
        this.submissionId2 = submissionId2;
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

    // Override equals() and hashCode() for proper primary key comparison
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResultsId that = (ResultsId) o;
        return Objects.equals(submissionId1, that.submissionId1) &&
                Objects.equals(submissionId2, that.submissionId2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(submissionId1, submissionId2);
    }
}
