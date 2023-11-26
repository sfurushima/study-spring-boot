package com.example.its.domain.issue;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IssueService {

    public List<issueEntity> findAll() {
        return List.of(
            new issueEntity(1, "概要1", "説明1"),
            new issueEntity(2, "概要2", "説明2"),
            new issueEntity(3, "概要3", "説明3")
        );
    }
}
