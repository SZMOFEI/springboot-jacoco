package cn.com.myykj.rental.service;

import cn.com.myykj.rental.controller.UserController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author mof01
 * @date 2021/9/16 21:15
 */
@SpringBootTest
public class UserServiceTest {
    @Autowired
    private UserController userController;

    @Test
    void name() {
        Assertions.assertNotNull(userController);
    }
}