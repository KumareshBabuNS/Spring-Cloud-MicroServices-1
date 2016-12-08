package com.github.izhangzhihao.LoadBalanceService.Hystrix;

import com.github.izhangzhihao.LoadBalanceService.Client.SearchClient;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 搜索服务错误处理
 */
public class SearchClientHystrix implements SearchClient {
    @Override
    public String search(@RequestParam(value = "pattern") String pattern) {
        return "搜索服务挂了，但是返回的固定结果是" + pattern;
    }
}
