package stu.lwhao.springbootdemo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
/**
 * @author : Luowenhao221
 * @date : 2024/6/23 下午8:36
 * @Project : springbootdemo
 */

@TableName("user")
public class User {
    private int id;
    private String name;
    private String username;
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
