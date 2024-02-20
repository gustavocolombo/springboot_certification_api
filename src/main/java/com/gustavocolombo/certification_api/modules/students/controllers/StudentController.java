package com.gustavocolombo.certification_api.modules.students.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gustavocolombo.certification_api.modules.students.dtos.VerifyIfHasCertificationDTO;
import com.gustavocolombo.certification_api.modules.students.services.VerifyIfHasCertificationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/students")
public class StudentController {

  @Autowired
  VerifyIfHasCertificationService verifyIfHasCertificationService;
  
  @PostMapping("/verifyIfHasCertification")
  public String verifyIfHasCertification(@RequestBody VerifyIfHasCertificationDTO verifyIfHasCertification) {
      var verifyUser = verifyIfHasCertificationService.execute(verifyIfHasCertification);
      
      if(verifyUser) {
        return "O usuário já fez a prova";
      }
      
      return "Usuário pode fazer a prova";
  }
  
}
