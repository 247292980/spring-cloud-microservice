package com.lgp.microserviceconsumermoviefeignwithhystrixstream.controller;

import com.lgp.microserviceconsumermoviefeignwithhystrixstream.domain.User;
import com.lgp.microserviceconsumermoviefeignwithhystrixstream.feign.UserFeignHystrixClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @AUTHOR lgp
 * @DATE 2018/2/28 9:45
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
