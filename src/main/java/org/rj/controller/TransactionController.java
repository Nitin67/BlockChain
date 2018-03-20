package org.rj.controller;

import java.util.List;
import org.rj.model.Transaction;
import org.rj.model.User;
import org.rj.model.UserTransaction;
import org.rj.repo.UserRepo;
import org.rj.repo.UserTransactionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/v1/bank-transaction")
@RestController
public class TransactionController {

  @Autowired
  UserTransactionRepo userTransactionRepo;

  @Autowired
  UserRepo userRepo;

  @RequestMapping(value = "/user/{user_id}/transaction", method = RequestMethod.POST)
  public void addUserTransaction(@PathVariable("user_id") String userId,
      @RequestBody Transaction transaction) {
    User user = userRepo.findOne(userId);
    if (user == null) {
      throw new IllegalArgumentException("Invalid UserName");
    }

    // RemoteCall<Greeter> greeter = Greeter.deploy(web3j, credentials, gasPrice, gasLimit,
    // _greeting);
    // greeter.send();
    UserTransaction userTransaction = userTransactionRepo.findOne(userId);
    if (userTransaction == null) {
      userTransaction = new UserTransaction();
      userTransaction.setUserId(user.getUserId());
    }
    userTransaction.getTransactions().add(transaction);
    userTransactionRepo.save(userTransaction);

  }

  @RequestMapping(value = "/user/{user_id}/transactions", method = RequestMethod.POST)
  public void addUserTransactions(@PathVariable("user_id") String userId,
      @RequestBody List<Transaction> transaction) {
    User user = userRepo.findOne(userId);
    if (user == null) {
      throw new IllegalArgumentException("Invalid UserName");
    }

    UserTransaction userTransaction = userTransactionRepo.findOne(userId);
    if (userTransaction == null) {
      userTransaction = new UserTransaction();
      userTransaction.setUserId(user.getUserId());
    }
    userTransaction.getTransactions().addAll(transaction);
    userTransactionRepo.save(userTransaction);

  }

  @RequestMapping(value = "/user/{user_id}/transactions", method = RequestMethod.GET)
  public UserTransaction getTransactionByUserId(@PathVariable("user_id") String userId) {
    return userTransactionRepo.findByUserId(userId);
  }
}
