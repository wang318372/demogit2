package com.wx.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController3 {

    @RequestMapping("info")
    public String info() {
        return "wx:   HelloStringBoot Info HahaHa        144";
    }
}
