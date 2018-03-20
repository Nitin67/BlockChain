package org.rj.exceptions;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ResourceNotFoundException extends RuntimeException {
  private static final long serialVersionUID = -1145194641387001320L;

  private final String resourceId;

  public ResourceNotFoundException(String resourceId, String message) {
    super(message);
    this.resourceId = resourceId;
  }
}
