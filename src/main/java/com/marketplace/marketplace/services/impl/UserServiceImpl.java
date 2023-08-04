package com.marketplace.marketplace.services.impl;
import com.marketplace.marketplace.models.UserEntity;
import com.marketplace.marketplace.repositories.UserRepository;
import com.marketplace.marketplace.services.UserService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Transactional
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserEntity createUser(UserEntity userEntity) {
        return userRepository.save(userEntity);
    }
}
