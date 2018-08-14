package com.lgp.microserviceconsumermoviefeign.controller;

import com.lgp.microserviceconsumermoviefeign.domain.User;
import com.lgp.microserviceconsumermoviefeign.feign.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @AUTHOR lgp
 * @DATE 2018/2/27 15:49
 * @DESCRIPTION
 **/
@RestController
public class FeignController {
    @Autowired
    private UserFeignClient userFeignClient;

    @GetMapping("feign/{id}")
    public User findNyIdFeign(@PathVariable Long id) {
        User user = this.userFeignClient.findByIdFeign(id);
        return user;
    }
}
