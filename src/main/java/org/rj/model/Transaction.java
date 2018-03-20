package org.rj.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Document(collection = "transaction")
public class Transaction extends BaseModel {

  @Id
  @Indexed
  private String transactionId;

  private String from;

  private Double amount;

  private TransactionType transactionType;

}
