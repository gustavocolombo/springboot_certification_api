package com.gustavocolombo.certification_api.modules.students.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "answer_certifications")
public class AnswersCertificationEntity {
  
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;

  @Column(name = "certification_id")
  private UUID certificationId;

  @ManyToOne
  @JoinColumn(name = "certification_id", insertable = false, updatable = false)
  private CertificationStudentEntity certificationStudentEntity;

  @Column(name = "student_id")
  private UUID studentId;

  @ManyToOne
  @JoinColumn(name = "student_id", insertable = false, updatable = false)
  private StudentsEntity studentsEntity;

  @Column(name = "question_id")
  private UUID questionId;

  @Column(name = "answer_id")
  private UUID answerId;

  @Column(name = "is_correct")
  private boolean isCorrect;

  @CreationTimestamp
  @Column(name = "created_at")
  private LocalDateTime createdAt;
}
