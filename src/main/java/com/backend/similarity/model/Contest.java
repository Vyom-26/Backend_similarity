package com.backend.similarity.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "contests")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Contest {

    @Id
    @Column(name = "contest_id", length = 100, nullable = false, unique = true)
    private String contestId;  // ✅ Matches VARCHAR(100) PRIMARY KEY

    @Column(name = "title", length = 255)
    private String title;  // ✅ Matches VARCHAR(255)

    @Column(name = "start_date", columnDefinition = "TIMESTAMP")
    private LocalDateTime startDate;  // ✅ Matches TIMESTAMP (Renamed from startTime)

    @Column(name = "participant_count")
    private Integer participantCount;  // ✅ Matches INTEGER

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

