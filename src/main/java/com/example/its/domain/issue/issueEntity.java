package com.example.its.domain.issue;

public class issueEntity {
    // ID
    private long id;
    // äTóv
    private String summary;
    // è⁄ç◊
    private String description;

    public issueEntity(long id, String summary, String description) {
        this.id = id;
        this.summary = summary;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public String getSummary() {
        return summary;
    }

    public String getDescription() {
        return description;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
