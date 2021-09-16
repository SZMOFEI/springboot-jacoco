package cn.com.myykj.rental.api;

import cn.com.myykj.rental.entity.User;

import java.util.List;

public interface UserApi {
    List<User> list();

    User getUserById(Long id);

    void deleteUser(Long id);
}
