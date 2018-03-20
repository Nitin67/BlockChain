package org.rj.controller;

import org.rj.response.ExceptionResponse;
import org.rj.response.ServiceResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlingController {

  @Autowired
  ExceptionResponse response;

  @ExceptionHandler(IllegalArgumentException.class)
  public ServiceResponse<ExceptionResponse> illegalArgument(IllegalArgumentException ex) {
    response.setErrorCode("Illegal Argument");
    response.setErrorMessage(ex.getMessage());
    return new ServiceResponse<>(response, HttpStatus.FORBIDDEN);
  }

}
