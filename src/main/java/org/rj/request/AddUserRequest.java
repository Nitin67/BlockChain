package org.rj.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class AddUserRequest {

  private String name;

  private String userId;

  private String password;
}
