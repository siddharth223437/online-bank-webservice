package com.sb.micro.login.controller;

import com.sb.micro.login.service.UserService;
import com.sb.micro.login.vo.AddressVO;
import com.sb.micro.login.vo.UsersVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("home")
public class HomeController {

    @Autowired
    private UserService userService;

    @GetMapping("/hello")
    public String hello(){
        return "Hello Bank!!!!";
    }

    @PostMapping("/saveuser")
    public Map<String,String> saveUser(@RequestBody UsersVO usersVO){
        Map<String,String> responseMap = new HashMap<>();
        if(usersVO.getUserId() != 0){
            System.out.println(usersVO);
            userService.saveUser(usersVO);
            responseMap.put("register","User registered successfully");
        }else{
            responseMap.put("register","Error in saving user!!!!");
        }
        return responseMap;
    }

}
