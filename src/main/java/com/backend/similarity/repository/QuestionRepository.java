package com.backend.similarity.repository;


import com.backend.similarity.model.Contest;
import com.backend.similarity.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer> {
    List<Question> findByContest(Contest contest);
    List<Question> findByContestContestId(String contestId);
}