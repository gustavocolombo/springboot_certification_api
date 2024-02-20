package com.gustavocolombo.certification_api.modules.questions.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gustavocolombo.certification_api.modules.questions.dtos.AlternativeResultDTO;
import com.gustavocolombo.certification_api.modules.questions.dtos.QuestionResultDTO;
import com.gustavocolombo.certification_api.modules.questions.entities.AlternativesEntity;
import com.gustavocolombo.certification_api.modules.questions.entities.QuestionsEntity;
import com.gustavocolombo.certification_api.modules.questions.repositories.QuestionsRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/questions")
public class QuestionsController {
  
  @Autowired
  private QuestionsRepository questionsRepository;

  @GetMapping("/technology/{technology}")
  public List<QuestionResultDTO> findByTechnology(@PathVariable String technology) {
    
    var result =  this.questionsRepository.findByTechnology(technology);

    var toMap = result.stream().map(question -> mapQuestionToDTO(question)).collect(Collectors.toList());
    
    return toMap;
  }
  
  static QuestionResultDTO mapQuestionToDTO(QuestionsEntity question) {
    var questionResultDTO = QuestionResultDTO.builder()
    .description(question.getDescription())
    .id(question.getId())
    .technology(question.getTechnology())
    .build();

    List<AlternativeResultDTO> alternativeResultDTO = question.getAlternatives()
    .stream()
    .map(alternative -> mapAlternativeToDTO(alternative))
    .collect(Collectors.toList());

    questionResultDTO.setAlternativeResultDTO(alternativeResultDTO);
    return questionResultDTO;
  }

  static AlternativeResultDTO mapAlternativeToDTO(AlternativesEntity alternativeResultDTO) {
    return AlternativeResultDTO.builder()
    .description(alternativeResultDTO.getDescription())
    .id(alternativeResultDTO.getId())
    .build();
  }
}
