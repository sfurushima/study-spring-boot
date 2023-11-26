package com.example.its.domain.issue;

import lombok.AllArgsConstructor;
import lombok.Data;

// Contructorを自動生成してくれるアノテーション(lombok)
@AllArgsConstructor
// setter, getterを自動生成してくれるアノテーション(lombok)
@Data
public class IssueEntity {
    // ID
    private long id;
    // 概要
    private String summary;
    // 説明
    private String description;
}
