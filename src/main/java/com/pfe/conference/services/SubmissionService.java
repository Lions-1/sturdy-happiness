package com.pfe.conference.services;

import com.pfe.conference.entities.Submission;
import com.pfe.conference.repositories.SubmissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubmissionService {

    private final SubmissionRepository submissionRepository;

    @Autowired
    public SubmissionService(SubmissionRepository submissionRepository) {
        this.submissionRepository = submissionRepository;
    }

    public List<Submission> findAll() {
        return submissionRepository.findAll();
    }

    public Submission findById(Long id) {
        Optional<Submission> submissionOptional = submissionRepository.findById(id);
        return submissionOptional.orElse(null);
    }

    public Submission save(Submission submission) {
        return submissionRepository.save(submission);
    }

    public Submission update(Long id, Submission submission) {
        if (submissionRepository.existsById(id)) {
            submission.setId(id);
            return submissionRepository.save(submission);
        }
        return null;
    }

    public void deleteById(Long id) {
        submissionRepository.deleteById(id);
    }
}
