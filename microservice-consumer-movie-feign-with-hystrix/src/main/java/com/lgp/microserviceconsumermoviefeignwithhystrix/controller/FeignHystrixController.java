package com.lgp.microserviceconsumermoviefeignwithhystrix.controller;

import com.lgp.microserviceconsumermoviefeignwithhystrix.domain.User;
import com.lgp.microserviceconsumermoviefeignwithhystrix.feign.UserFeignHystrixClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @AUTHOR lgp
 * @DATE 2018/2/27 16:56
 * @DESCRIPTION
 **/
@RestController
public class FeignHystrixController {
    @Autowired
    private UserFeignHystrixClient userFeignHystrixClient;

    @GetMapping("feign/{id}")
    public User findByIdFeign(@PathVariable Long id) {
        User user = this.userFeignHystrixClient.findByIdFeign(id);
        return user;
    }
}
