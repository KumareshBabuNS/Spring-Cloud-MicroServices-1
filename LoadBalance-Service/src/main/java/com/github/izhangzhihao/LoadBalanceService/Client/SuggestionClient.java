package com.github.izhangzhihao.LoadBalanceService.Client;


import com.github.izhangzhihao.LoadBalanceService.Hystrix.SuggestionClientHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(value = "Suggestion-Service", fallback = SuggestionClientHystrix.class)
public interface SuggestionClient {
    @RequestMapping(method = RequestMethod.GET, value = "/suggest/")
    String suggest(@RequestParam(value = "pattern") String pattern);
}
