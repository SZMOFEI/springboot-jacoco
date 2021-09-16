package cn.com.myykj.rental.controller;

import cn.com.myykj.rental.api.UserApi;
import cn.com.myykj.rental.entity.User;
import cn.com.myykj.rental.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author mof01
 * @date 2021/9/16 21:10
 */
@RestController
@RequestMapping("/user")
public class UserController implements UserApi {

    @Autowired
    private UserService userService;
    @GetMapping
    @Override
    public List<User> list() {
        return userService.list();
    }

    @GetMapping("/{id}")
    @Override
    public User getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @DeleteMapping("/{id}")
    @Override
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }
}