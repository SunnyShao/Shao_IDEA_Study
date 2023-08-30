package com.shao.test00;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Shao
 * @date 2023/8/30 19:20
 * @description
 */

@RestController
public class UserController {
    @RequestMapping("/test")
    public String getNameById(String id){
        System.out.println("测试接口入参，id="+id);
        return "lili";
    }
}