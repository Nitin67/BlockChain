package org.rj.model;

import java.util.Date;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public abstract class BaseModel {

  // @DateTimeFormat(iso = ISO.DATE_TIME)
  @CreatedDate
  private Date createdAt;

  @LastModifiedDate
  private Date updatedAt;
}
