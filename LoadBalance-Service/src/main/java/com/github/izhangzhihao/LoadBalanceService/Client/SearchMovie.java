package com.github.izhangzhihao.LoadBalanceService.Client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Component
@FeignClient("Movie-Service")
public interface SearchMovie {
    @RequestMapping(method = RequestMethod.GET, value = "/search/pattern/{pattern}")
    String search(@PathVariable String pattern);
}
