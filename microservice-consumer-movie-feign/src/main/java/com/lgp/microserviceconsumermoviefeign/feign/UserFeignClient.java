package com.lgp.microserviceconsumermoviefeign.feign;

import com.lgp.microserviceconsumermoviefeign.domain.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @AUTHOR lgp
 * @DATE 2018/2/27 15:45
 * @DESCRIPTION 使⽤@FeignClient("microservice-provider-user")
 * 注解绑定microservice-provider-user服务，还可以使⽤url参数指定⼀个URL。
 **/
@FeignClient(name = "microservice-provider-user")
public interface UserFeignClient {
    @RequestMapping("/{id}")
    User findByIdFeign(@RequestParam("id") Long id);
}
