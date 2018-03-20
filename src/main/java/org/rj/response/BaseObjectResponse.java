package org.rj.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BaseObjectResponse<T> extends BaseResponse {

  private T data;

  public BaseObjectResponse(T data) {
    super();
    this.data = data;
  }

  public BaseObjectResponse(String errorMessage, T data) {
    this.data = data;
  }

}
