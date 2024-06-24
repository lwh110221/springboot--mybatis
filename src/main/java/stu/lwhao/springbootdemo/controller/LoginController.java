package stu.lwhao.springbootdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import stu.lwhao.springbootdemo.entity.User;
import stu.lwhao.springbootdemo.service.UserService;

/**
 * @author : Luowenhao221
 * @date : 2024/6/23 下午9:13
 * @Project : springbootdemo
 */

@RestController
public class LoginController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public ResponseEntity<User> login(@RequestBody User requestUser) {
        User user = userService.validateUser(requestUser.getUsername(), requestUser.getPassword());
        if (user != null) {
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.status(401).body(null);
        }
    }
}
