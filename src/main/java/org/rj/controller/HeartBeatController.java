package org.rj.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/v1/bank")
public class HeartBeatController {

  @RequestMapping("/index")
  public String index() {
    return "Greeting from spring boot";
  }
}
