package com.github.izhangzhihao.LoadBalanceService.Controller;

import com.github.izhangzhihao.LoadBalanceService.Client.SearchClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 提供搜索功能
 */
@SuppressWarnings("SpringAutowiredFieldsWarningInspection")
@RestController
public class SearchController {
    @Autowired
    //@Qualifier("searchClient")
    private SearchClient searchClient;

    @RequestMapping(value = "/search/", method = RequestMethod.GET)
    public String search(@RequestParam(value = "pattern") String pattern) {
        return searchClient.search(pattern);
    }
}
