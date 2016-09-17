package com.github.izhangzhihao.SpringCloud.RibbonLoadBalance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
//    @Autowired
//    RestTemplate restTemplate;

    @Autowired
    private ComputeService computeService;

    @GetMapping("/add")
    public String add() {
        //return restTemplate.getForEntity("http://COMPUTE-SERVICE/add?a=10&b=20", String.class).getBody();
        return computeService.addService();
    }
}
