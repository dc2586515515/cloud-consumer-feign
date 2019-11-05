package com.dc.cloud.cloudconsumerfeign.service;

import com.dc.cloud.cloudconsumerfeign.vo.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description  FeignClient 测试类
 *      @FeignClient 注解 name对应需要消费得 "服务" 名称
 * @Author DC
 * @Date 2019-11-05
 */
@FeignClient(name = "microservice-provider-user")
public interface UserFeignClient {
    /*  这里 RequestMapping 中的URL 对应指定服务的URL，
    *   这里指对应 microservice-provider-user 服务提供者中
    *   controller 中得 RequestMapping
    */
    @RequestMapping("/{id}")
    public User findByIdFeign(@RequestParam(value = "id") Long id);
}
