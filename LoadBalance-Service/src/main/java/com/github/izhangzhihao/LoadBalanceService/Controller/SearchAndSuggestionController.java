package com.github.izhangzhihao.LoadBalanceService.Controller;

import com.github.izhangzhihao.LoadBalanceService.Client.SearchMovie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 提供搜索功能，附加搜索建议
 */
@SuppressWarnings("SpringAutowiredFieldsWarningInspection")
@RestController
public class SearchAndSuggestionController {
    @Autowired
    private SearchMovie searchMovie;

    @RequestMapping(value = "/search/", method = RequestMethod.GET)
    public String search(@RequestParam(value = "pattern") String pattern) {
        return searchMovie.search(pattern);
    }
}
