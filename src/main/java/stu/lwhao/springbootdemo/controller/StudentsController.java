package stu.lwhao.springbootdemo.controller;

/**
 * @author : Luowenhao221
 * @date : 2024/6/13 上午12:08
 * @Project : springbootdemo
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import stu.lwhao.springbootdemo.entity.User;
import stu.lwhao.springbootdemo.service.UserService;

import java.util.List;

@RestController
public class StudentsController {
    @Autowired
    private UserService userService;

    @GetMapping("/students")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("/add")
    public User createUser(@RequestBody User user) {
        userService.saveUser(user);
        return user;
    }
}
