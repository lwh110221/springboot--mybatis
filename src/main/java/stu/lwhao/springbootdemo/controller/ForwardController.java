package stu.lwhao.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @author : Luowenhao221
 * @date : 2024/6/24 下午3:29
 * @Project : springbootdemo
 */
@Controller
public class ForwardController {

    @RequestMapping(value = { "/", "/home", "/add"})
    public String forward() {
        return "forward:/index.html";
    }
}
