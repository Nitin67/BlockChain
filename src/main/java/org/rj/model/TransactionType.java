package org.rj.model;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public enum TransactionType {

  DEBIT("debit"), CREDIT("credit"), WITHDRAWAL("withdrawal");

  String transactionType;

  private TransactionType(String transactionType) {
    this.transactionType = transactionType;
  }

}
