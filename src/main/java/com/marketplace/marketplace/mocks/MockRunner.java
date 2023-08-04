package com.marketplace.marketplace.mocks;

import com.marketplace.marketplace.models.Product;
import com.marketplace.marketplace.models.UserEntity;
import com.marketplace.marketplace.repositories.UserRepository;
import com.marketplace.marketplace.services.ProductService;
import com.marketplace.marketplace.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MockRunner implements CommandLineRunner {

    @Autowired
    private UserService userService;


    @Override
    public void run(String... args) throws Exception {
        userService.createUser(UserEntity.userMock());
    }
}
