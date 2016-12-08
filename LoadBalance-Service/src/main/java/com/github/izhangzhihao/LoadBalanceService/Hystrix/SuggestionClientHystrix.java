package com.github.izhangzhihao.LoadBalanceService.Hystrix;

import com.github.izhangzhihao.LoadBalanceService.Client.SuggestionClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 建议服务出错处理
 */
@Component
public class SuggestionClientHystrix implements SuggestionClient {
    @Override
    public String suggest(@RequestParam(value = "pattern") String pattern) {
        return "建议服务挂了，返回的固定结果是" + pattern;
    }
}
