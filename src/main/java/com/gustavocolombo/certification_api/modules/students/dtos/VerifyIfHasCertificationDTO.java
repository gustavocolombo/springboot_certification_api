package com.gustavocolombo.certification_api.modules.students.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VerifyIfHasCertificationDTO {
  
  private String email;
  private String technology;
}
