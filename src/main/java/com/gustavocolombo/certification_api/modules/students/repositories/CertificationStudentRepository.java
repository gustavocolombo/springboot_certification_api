package com.gustavocolombo.certification_api.modules.students.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.gustavocolombo.certification_api.modules.students.entities.CertificationStudentEntity;

@Repository
public interface CertificationStudentRepository extends JpaRepository<CertificationStudentEntity, UUID> {
  
  @Query("SELECT c FROM certifications c INNER JOIN c.studentsEntity stds WHERE stds.email = :email AND c.technology = :technology")
  List<CertificationStudentEntity> findByEmailAndCertification(String email, String technology);
} 
