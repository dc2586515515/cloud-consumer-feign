package com.dc.cloud.cloudconsumerfeign.controller;

import com.dc.cloud.cloudconsumerfeign.service.UserFeignClient;
import com.dc.cloud.cloudconsumerfeign.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author DC
 * @Date 2019-11-05
 */
@RestController
public class FeginController {
    @Autowired
    private UserFeignClient userFeignClient;

    @GetMapping("/feign/{id}")
    public User getUserById(@PathVariable Long id){
        return userFeignClient.findByIdFeign(id);
    }
}
