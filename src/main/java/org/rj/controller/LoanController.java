package org.rj.controller;

import org.rj.repo.UserRepo;
import org.rj.repo.UserTransactionRepo;
import org.rj.response.BaseObjectResponse;
import org.rj.response.ServiceResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping(value = "/v1/bank-loan")
@RestController
public class LoanController {

  @Autowired
  UserTransactionRepo userTransactionRepo;

  @Autowired
  UserRepo userRepo;

  @RequestMapping(value = "/user/{user_id}/loan/{loan_amount}", method = RequestMethod.POST)
  public ServiceResponse<BaseObjectResponse<String>> issueLoan(
      @PathVariable("user_id") String userId, @PathVariable("loan_amount") int loanAmount) {

    return null;
  }

}
