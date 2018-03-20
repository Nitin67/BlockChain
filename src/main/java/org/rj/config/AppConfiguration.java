package org.rj.config;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.stereotype.Component;
import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;

@Configuration
@Component
@EnableAutoConfiguration
public class AppConfiguration {

  // DB Connection Configuration
  @Value("#{'${db.connectionURL}'.split(',')}")
  private List<String> databaseURL;

  @Value("${db.name}")
  private String databaseName;

  @Bean
  public MongoDbFactory mongoDbFactory() {
    List<ServerAddress> seeds = new ArrayList<>();
    for (String dbUrl : databaseURL) {
      seeds.add(new ServerAddress(dbUrl));
    }
    return new SimpleMongoDbFactory(new MongoClient(seeds), databaseName);
  }

  @Bean
  public MongoTemplate mongoTemplate() {
    MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory());
    return mongoTemplate;
  }

}
