package com.github.izhangzhihao.FeignLoadBalance;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//绑定该接口对应compute-service服务
@FeignClient("compute-service")
public interface ComputeClient {
    //@GetMapping("/add")这样会报错
    @RequestMapping(value = "/add",method = RequestMethod.GET)
    Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);
}
