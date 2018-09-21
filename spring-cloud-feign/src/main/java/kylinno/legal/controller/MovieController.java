package kylinno.legal.controller;

import kylinno.legal.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * MovieController.java
 * <p/>
 * Copyright 2018 北京律智通科技有限公司
 * <p/>
 * <p/>
 * 下一代律所管理SaaS系统
 *
 * @author shuf@kylinno.com
 * @date 19/09/18.
 */
@RestController
@RequestMapping("/v1/movie")
public class MovieController {

    @Autowired
    private MovieService service;

    @RequestMapping(method = RequestMethod.GET)
    public String testMovie() {
        return service.testHello();
    }
}
