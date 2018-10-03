package com.ljd.blog.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//Controller的识别注解
@RestController
public class DemoController {

    /**
     * springMVC接口
     * 接口三要素
     * 1.接口地址     @GetMapping(value = "/demo")
     * 2.参数列表     @RequestParam("str") String str
     * 3.返回值       return "hello " + str;
     *
     * @param str
     * @return
     */
    @GetMapping(value = "/demo")
    public String demo(@RequestParam("str") String str) {
        return "hello " + str;
    }


}
