package kylinno.legalwise.controller;

import org.springframework.stereotype.Controller;
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

    @RequestMapping(method = RequestMethod.POST)
    public String createMovie() {
        return null;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String testMovie() {
        return "Hello world! I'm movie.";
    }
}
