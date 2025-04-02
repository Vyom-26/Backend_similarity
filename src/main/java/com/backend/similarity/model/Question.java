package com.backend.similarity.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "questions")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SequenceGenerator(name = "question_seq", sequenceName = "question_seq", allocationSize = 1)
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "question_seq")
    @Column(name = "question_id", nullable = false)
    private Integer questionId;  // ✅ Matches INT PRIMARY KEY

    @ManyToOne
    @JoinColumn(name = "contest_id", referencedColumnName = "contest_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Contest contest;  // ✅ Maps to contest_id VARCHAR(100) FK

    @Column(name = "question_number", nullable = false)
    private Integer questionNumber;  // ✅ Matches INT

    @Column(name="points")
    private Integer point;

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public Contest getContest() {
        return contest;
    }

    public void setContest(Contest contest) {
        this.contest = contest;
    }

    public Integer getQuestionNumber() {
        return questionNumber;
    }

    public void setQuestionNumber(Integer questionNumber) {
        this.questionNumber = questionNumber;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    public Integer getTotalSubmissions() {
        return totalSubmissions;
    }

    public void setTotalSubmissions(Integer totalSubmissions) {
        this.totalSubmissions = totalSubmissions;
    }

    public Integer getTotalAccepted() {
        return totalAccepted;
    }

    public void setTotalAccepted(Integer totalAccepted) {
        this.totalAccepted = totalAccepted;
    }

    public Integer getUsersAccepted() {
        return usersAccepted;
    }

    public void setUsersAccepted(Integer usersAccepted) {
        this.usersAccepted = usersAccepted;
    }

    @Column(name = "title", length = 255, nullable = false)
    private String title;  // ✅ Matches VARCHAR(255)

    @Enumerated(EnumType.STRING)
    @Column(name = "difficulty", nullable = false)
    private Difficulty difficulty;  // ✅ Enum type

    @Column(name = "total_submissions")
    private Integer totalSubmissions;  // ✅ Matches INT

    @Column(name = "total_accepted")
    private Integer totalAccepted;  // ✅ Matches INT

    @Column(name = "users_accepted")
    private Integer usersAccepted;  // ✅ Matches INT
}

