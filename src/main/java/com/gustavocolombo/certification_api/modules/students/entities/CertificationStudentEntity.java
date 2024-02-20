package com.gustavocolombo.certification_api.modules.students.entities;

import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "certifications")
public class CertificationStudentEntity {
  
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;

  @Column(length = 100)
  private String technology;

  @Column(length = 10)
  private int grade;

  @Column(name = "student_id")
  private UUID studentID;

  @ManyToOne
  @JoinColumn(name = "student_id", insertable = false, updatable = false)
  private StudentsEntity studentsEntity;

  @OneToMany
  @JoinColumn(name = "answer_certification_id")
  private List<AnswersCertificationEntity> answersCertificationEntity;

  @CreationTimestamp
  @Column(name = "created_at")
  private LocalDateTime createdAt;
}
