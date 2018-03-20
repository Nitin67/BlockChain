package org.rj.repo;

import javax.validation.constraints.NotNull;
import org.rj.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface UserRepo extends MongoRepository<User, String> {
  public User findByUserId(@NotNull String userId);
}
