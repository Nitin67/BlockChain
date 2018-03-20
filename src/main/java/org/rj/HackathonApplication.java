package org.rj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class HackathonApplication {

  public static void main(String[] args) {
    SpringApplication.run(HackathonApplication.class, args);
  }
}
