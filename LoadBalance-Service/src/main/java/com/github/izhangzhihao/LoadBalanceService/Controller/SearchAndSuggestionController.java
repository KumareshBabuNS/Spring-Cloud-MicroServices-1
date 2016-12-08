package com.github.izhangzhihao.LoadBalanceService.Controller;

import com.github.izhangzhihao.LoadBalanceService.Client.SearchMovie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 提供搜索功能，附加搜索建议
 */
@SuppressWarnings("SpringAutowiredFieldsWarningInspection")
@RestController
public class SearchAndSuggestionController {
    @Autowired
    private SearchMovie searchMovie;

    @RequestMapping(value = "/add/pattern/{pattern}", method = RequestMethod.GET)
    public String search(@PathVariable String pattern) {
        return searchMovie.search(pattern);
    }
}
