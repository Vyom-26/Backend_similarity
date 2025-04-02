package com.backend.similarity.service;

import com.backend.similarity.dto.CodeDTO;
import com.backend.similarity.model.Codes;
import com.backend.similarity.repository.CodesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CodesService {

    private final CodesRepository codesRepository;

    @Autowired
    public CodesService(CodesRepository codesRepository) {
        this.codesRepository = codesRepository;
    }

    public CodeDTO getCodeBySubmissionId(String submissionId) {
        Optional<Codes> code = codesRepository.findById(submissionId);

        if (code.isPresent()) {
            Codes retrievedCode = code.get();
            System.out.println("Fetched Code: " + retrievedCode.getSubmittedCode());
            return convertToDTO(retrievedCode);
        } else {
            System.out.println("Code not found for Submission ID: " + submissionId);
            return null;
        }
    }


    private CodeDTO convertToDTO(Codes codes) {
        return new CodeDTO(
                codes.getSubmissionId(),
                codes.getSubmittedCode()
        );
    }
}
