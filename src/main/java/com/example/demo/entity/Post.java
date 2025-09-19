package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO_INCREMENT
    private Long id;

    private String title;

    @Column(columnDefinition = "TEXT")
    private String content;

    public Post() {} // JPA 기본 생성자

    public Post(String title, String content) {
        this.title = title;
        this.content = content;
    }

    // Getter & Setter
    public Long getId() { return id; }
    public String getTitle() { return title; }
    public String getContent() { return content; }
    public void setTitle(String title) { this.title = title; }
    public void setContent(String content) { this.content = content; }
}
