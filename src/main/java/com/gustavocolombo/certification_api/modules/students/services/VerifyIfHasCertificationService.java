package com.gustavocolombo.certification_api.modules.students.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gustavocolombo.certification_api.modules.students.dtos.VerifyIfHasCertificationDTO;
import com.gustavocolombo.certification_api.modules.students.repositories.CertificationStudentRepository;

@Service
public class VerifyIfHasCertificationService {

  @Autowired
  private CertificationStudentRepository certificationStudentRepository;

  public boolean execute(VerifyIfHasCertificationDTO dto) {
    var result = this.certificationStudentRepository.findByEmailAndCertification(dto.getEmail(), dto.getTechnology());
    if(!result.isEmpty()) {
      return true;
    }
    return false;
  }
}
