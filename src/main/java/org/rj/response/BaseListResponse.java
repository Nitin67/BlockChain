package org.rj.response;

import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BaseListResponse<T> extends BaseResponse {

  private List<T> data;

  public BaseListResponse(List<T> data) {
    this.data = data;
  }

}
