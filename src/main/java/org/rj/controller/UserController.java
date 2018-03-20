package org.rj.controller;

import org.rj.model.User;
import org.rj.repo.UserRepo;
import org.rj.request.AddUserRequest;
import org.rj.request.ValidateUserRequest;
import org.rj.util.EncodeDecodeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/bank-user")
public class UserController {

  @Autowired
  UserRepo userRepo;

  @RequestMapping(value = "/users", method = RequestMethod.POST)
  public void addUser(@RequestBody AddUserRequest addUserRequest) {
    addUserRequest.setPassword(EncodeDecodeUtil.encodePassword(addUserRequest.getPassword()));
    userRepo.save(new User(addUserRequest));
  }

  @RequestMapping(value = "/user", method = RequestMethod.POST)
  public void validateUser(@RequestBody ValidateUserRequest validateUserRequest) {
    User user = userRepo.findOne(validateUserRequest.getUserId());
    if (user == null) {
      throw new IllegalArgumentException("Invalid UserName");
    }
    if (!EncodeDecodeUtil.decodePassword(user.getPassword())
        .equals(validateUserRequest.getPassword())) {
      throw new IllegalArgumentException("Invalid password");
    }
  }

}
