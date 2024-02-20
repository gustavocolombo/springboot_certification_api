package com.gustavocolombo.certification_api.modules.questions.dtos;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AlternativeResultDTO {
  private UUID id;
  private String description;
}
