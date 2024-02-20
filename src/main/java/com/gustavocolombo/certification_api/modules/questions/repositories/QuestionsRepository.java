package com.gustavocolombo.certification_api.modules.questions.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavocolombo.certification_api.modules.questions.entities.QuestionsEntity;

public interface QuestionsRepository extends JpaRepository<QuestionsEntity, UUID> {
  
  List<QuestionsEntity> findByTechnology(String technology);
}
