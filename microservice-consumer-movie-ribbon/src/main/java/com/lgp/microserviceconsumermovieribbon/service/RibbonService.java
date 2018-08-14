package com.lgp.microserviceconsumermovieribbon.service;

import com.lgp.microserviceconsumermovieribbon.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @AUTHOR lgp
 * @DATE 2018/2/27 15:25
 * @DESCRIPTION
 **/
@Service
public class RibbonService {
    @Autowired
    private RestTemplate restTemplate;

    public User findById(Long id) {
        // http://服务提供者的serviceId/url
        return this.restTemplate.getForObject("http://microservice-provider-user/" + id, User.class);
    }
}
