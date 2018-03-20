package org.rj.model;

import org.rj.request.AddUserRequest;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Document(collection = "user")
@Component
public class User extends BaseModel {

  @Id
  @Indexed
  private String userId;

  private String userName;

  private String password;

  public User() {}

  public User(AddUserRequest addUserRequest) {
    this.userId = addUserRequest.getUserId();
    this.userName = addUserRequest.getName();
    this.password = addUserRequest.getPassword();
  }
}
