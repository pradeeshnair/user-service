package tech.tm7.service;

import tech.tm7.domain.User;

/**
 * UserService
 */
public interface UserService {

    User save(User user);

    User find(String userId);
}