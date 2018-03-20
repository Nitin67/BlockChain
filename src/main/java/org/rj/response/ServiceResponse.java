package org.rj.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ServiceResponse<T extends BaseResponse> extends ResponseEntity<T> {

  public ServiceResponse(T response, HttpStatus httpStatus) {
    super(response, httpStatus);
  }
}
