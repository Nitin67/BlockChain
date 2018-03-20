package org.rj.repo;

import javax.validation.constraints.NotNull;
import org.rj.model.UserTransaction;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface UserTransactionRepo extends MongoRepository<UserTransaction, String> {

  public UserTransaction findByUserId(@NotNull String userId);
}
