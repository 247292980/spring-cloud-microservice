package com.lgp.microserviceconsumermovieribbonwithhystrix.controller;

import com.lgp.microserviceconsumermovieribbonwithhystrix.domain.User;
import com.lgp.microserviceconsumermovieribbonwithhystrix.service.RibbonHystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @AUTHOR lgp
 * @DATE 2018/2/27 16:27
 * @DESCRIPTION
 **/
@RestController
public class RibbonHystrixController {
    @Autowired
    private RibbonHystrixService ribbonHystrixService;
    @GetMapping("/ribbon/{id}")
    public User findById(@PathVariable Long id) {
        return ribbonHystrixService.findById(id);
    }
}
