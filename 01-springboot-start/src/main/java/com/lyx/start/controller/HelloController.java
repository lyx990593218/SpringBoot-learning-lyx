package com.lyx.start.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

/**
 * @ClassName HelloController
 * @Descrition TODO(Controller)
 * @Author LYX
 * @Date 2018-10-04 21:48
 * @Version 1.0
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(@PathParam("name")String name) {
        return "Hello SpringBoot! I`m " + name;
    }
}
