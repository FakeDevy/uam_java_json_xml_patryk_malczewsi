package com.brainboost.brainboost.course.module.lesson.courseelement.elements.markdowntext;

import java.util.UUID;

import com.brainboost.brainboost.course.module.lesson.courseelement.CourseElementEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "element_markdown_text")
@Getter
@Setter
public class MarkdownTextElementEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    private String content;

    @OneToOne
    @JoinColumn(name = "element_id")
    private CourseElementEntity courseElement;    
}
