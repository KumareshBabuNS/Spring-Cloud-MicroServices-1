package com.github.izhangzhihao.LoadBalanceService.Controller;

import com.github.izhangzhihao.LoadBalanceService.Client.SearchClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 提供搜索功能
 */
@SuppressWarnings("SpringAutowiredFieldsWarningInspection")
@RestController
public class SearchController {
    @Autowired
    private SearchClient searchMovie;

    @RequestMapping(value = "/search/", method = RequestMethod.GET)
    public String search(@RequestParam(value = "pattern") String pattern) {
        return searchMovie.search(pattern);
    }
}
