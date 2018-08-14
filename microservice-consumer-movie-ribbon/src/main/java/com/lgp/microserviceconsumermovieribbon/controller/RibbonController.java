package com.lgp.microserviceconsumermovieribbon.controller;

import com.lgp.microserviceconsumermovieribbon.domain.User;
import com.lgp.microserviceconsumermovieribbon.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @AUTHOR lgp
 * @DATE 2018/2/27 15:28
 * @DESCRIPTION
 **/
@RestController
public class RibbonController {
    @Autowired
    private RibbonService ribbonService;

    @GetMapping("/ribbon/{id}")
    public User findById(@PathVariable Long id) {
        return this.ribbonService.findById(id);
    }
}
