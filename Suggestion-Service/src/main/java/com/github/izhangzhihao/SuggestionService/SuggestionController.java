package com.github.izhangzhihao.SuggestionService;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 推荐服务(广告)
 */
@SuppressWarnings("SpringAutowiredFieldsWarningInspection")
@RestController
public class SuggestionController {
    private final Logger logger = Logger.getLogger(getClass());

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/suggest/", method = RequestMethod.GET)
    public String search(@RequestParam(value = "pattern") String pattern) {
        ServiceInstance instance = client.getLocalServiceInstance();
        String r = "建议：" + pattern;
        logger.info("/search/pattern/" + pattern + ", host:" + instance.getHost() + ", service_id:" + instance.getServiceId() + ", result:" + r);
        return r;
    }
}
