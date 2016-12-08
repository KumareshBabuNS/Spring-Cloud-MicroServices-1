package com.github.izhangzhihao.MovieService;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

/**
 * 电影搜索服务
 */
@SuppressWarnings("SpringAutowiredFieldsWarningInspection")
@RestController
public class SearchServiceController {
    private final Logger logger = Logger.getLogger(getClass());

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/search/pattern/{pattern}", method = RequestMethod.GET)
    public String search(@PathVariable String pattern) {
        ServiceInstance instance = client.getLocalServiceInstance();
        String r = "搜索：" + pattern;
        logger.info("/search/pattern/" + pattern + ", host:" + instance.getHost() + ", service_id:" + instance.getServiceId() + ", result:" + r);
        return r;
    }
}
