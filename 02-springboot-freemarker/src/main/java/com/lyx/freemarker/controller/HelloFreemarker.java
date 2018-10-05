package com.lyx.freemarker.controller;

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName HelloFreemarker
 * @Descrition TODO(HelloFreemarker)
 * @Author LYX
 * @Date 2018-10-05 19:55
 * @Version 1.0
 */
@Controller
public class HelloFreemarker {

    @RequestMapping("/hello")
    public String helloFremarker(Model model) {
        model.addAttribute("name", "LYX");
        return "hello";
    }
}
