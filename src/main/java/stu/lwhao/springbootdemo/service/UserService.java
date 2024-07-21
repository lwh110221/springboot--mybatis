package stu.lwhao.springbootdemo.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import stu.lwhao.springbootdemo.entity.User;
import stu.lwhao.springbootdemo.mapper.UserMapper;

import java.util.List;
/**
 * @author : Luowenhao221
 * @date : 2024/6/23 下午8:38
 * @Project : springbootdemo
 */

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    //查询所有用户
    public List<User> getAllUsers() {
        return userMapper.selectList(null);
    }

    //登录验证
    public User validateUser(String username, String password) {
        User user = userMapper.selectOne(new QueryWrapper<User>().eq("username", username));
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }
    //添加记录
    public void saveUser(User user) {
        userMapper.insert(user);
    }

    // 模糊查询方法
    public List<User> searchUsersByName(String name) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("name", name);
        return userMapper.selectList(queryWrapper);
    }

    // 根据ID删除用户
    public void deleteUserById(int id) {
        userMapper.deleteById(id);
    }



}
