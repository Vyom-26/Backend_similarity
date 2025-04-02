package com.backend.similarity.repository;

import com.backend.similarity.model.Question;
import com.backend.similarity.model.Results;
import com.backend.similarity.model.ResultsId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResultsRepository extends JpaRepository<Results, ResultsId> {

    List<Results> findByQuestionQuestionId(Integer questionId);

    List<Results> findByContestId(String contestId);

    // Find all results for a specific question where either submission1 or submission2 matches the username
    @Query("SELECT r FROM Results r WHERE r.question.questionId = :questionId AND (r.username1 = :username OR r.username2 = :username)")
    List<Results> findByQuestionAndUsername(@Param("questionId") Integer questionId, @Param("username") String username);

    // Get unique usernames for a specific question
    @Query("SELECT DISTINCT r.username1 FROM Results r WHERE r.question.questionId = :questionId " +
            "UNION " +
            "SELECT DISTINCT r.username2 FROM Results r WHERE r.question.questionId = :questionId")
    List<String> findUniqueUsernamesByQuestionId(@Param("questionId") Integer questionId);

    // Get submission data for a specific question
    @Query("SELECT r.username1 as username, r.rank1 as rank, r.language as language, r.submission1Time as submissionTime " +
            "FROM Results r WHERE r.question.questionId = :questionId " +
            "UNION " +
            "SELECT r.username2 as username, r.rank2 as rank, r.language as language, r.submission2Time as submissionTime " +
            "FROM Results r WHERE r.question.questionId = :questionId")
    List<Object[]> findSubmissionDataByQuestionId(@Param("questionId") Integer questionId);
}

