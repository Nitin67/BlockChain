package org.rj.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ValidateUserRequest {

  private String userId;

  private String password;
}
