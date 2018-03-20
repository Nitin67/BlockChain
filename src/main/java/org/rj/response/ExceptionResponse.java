package org.rj.response;

import org.springframework.stereotype.Component;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Component
public class ExceptionResponse extends BaseResponse {
  private String errorCode;
  private String errorMessage;
}
