package tech.tm7.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.tm7.domain.User;
import tech.tm7.repository.UserRepository;
import tech.tm7.service.UserService;

/**
 * UserServiceImpl
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User save(User user) {
        user = userRepository.save(user);
        return user;
    }

    @Override
    public User find(String userId) {
        Optional<User> user = userRepository.findById(userId);
        if (user.isPresent()) {
            return user.get();
        }
        return null;
    }

}