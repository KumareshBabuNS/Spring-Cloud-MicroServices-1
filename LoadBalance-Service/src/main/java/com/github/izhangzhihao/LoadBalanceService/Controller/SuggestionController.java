package com.github.izhangzhihao.LoadBalanceService.Controller;

import com.github.izhangzhihao.LoadBalanceService.Client.SuggestionClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 广告，附加搜索建议
 */
@SuppressWarnings("SpringAutowiredFieldsWarningInspection")
@RestController
public class SuggestionController {
    @Autowired
    private SuggestionClient client;

    @RequestMapping(value = "/suggest/", method = RequestMethod.GET)
    public String suggest(@RequestParam(value = "pattern") String pattern) {
        return client.suggest(pattern);
    }
}
