package com.lgp.microserviceconsumermoviefeignwithhystrix.feign;

import com.lgp.microserviceconsumermoviefeignwithhystrix.domain.User;
import com.lgp.microserviceconsumermoviefeignwithhystrix.feign.UserFeignHystrixClient.HystrixClientFallback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * 使用@FeignClient注解的fallback属性，指定fallback类
 *
 *
 * 指定fallback类 import com.lgp.microserviceconsumermoviefeignwithhystrix.feign.UserFeignHystrixClient.HystrixClientFallback;
 * 这一句不能缺，必须手写导入才能识别得到，不能this.XXXXXXX
 * @AUTHOR lgp
 * @DATE 2018/2/27 16:57
 * @DESCRIPTION
 **/
@FeignClient(name = "microservice-provider-user", fallback = HystrixClientFallback.class)
public interface UserFeignHystrixClient {
    @RequestMapping("/{id}")
    public User findByIdFeign(@RequestParam("id") Long id);

    /**
     * 这边采取了和Spring Cloud官方文档相同的做法，将fallback类作为内部类放入Feign的接口中，当然也可以单独写一个fallback类。
     *
     * @AUTHOR lgp
     * @DATE 2018/2/27 16:57
     * @DESCRIPTION
     */
    @Component
    static class HystrixClientFallback implements UserFeignHystrixClient {
        private static final Logger LOGGER = LoggerFactory.getLogger(HystrixClientFallback.class);

        /**
         * hystrix fallback方法
         * @param id
         * @return 默认的用户
         */
        @Override
        public User findByIdFeign(Long id) {
            HystrixClientFallback.LOGGER.info("异常发生，进入fallback方法，接收的参数：id = {}", id);
            User user = new User();
            user.setId(-1L);
            user.setUsername("default username");
            user.setAge(0);
            return user;
        }
    }
}
