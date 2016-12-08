package com.github.izhangzhihao.LoadBalanceService.Client;

import com.github.izhangzhihao.LoadBalanceService.Hystrix.SearchClientHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(value = "Search-Service",fallback = SearchClientHystrix.class)
public interface SearchClient {
    @RequestMapping(method = RequestMethod.GET, value = "/search/")
    String search(@RequestParam(value = "pattern") String pattern);
}
