package tech.tm7.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import tech.tm7.domain.User;

/**
 * UserRepository
 */
@Repository
public interface UserRepository extends MongoRepository<User, String> {
    List<User> findBy_id(String _id);
}