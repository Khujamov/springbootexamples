package com.example.springboot.springbootprofile.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <pre>
 *
 * </pre>
 *
 * @author nicky
 * <pre>
 * 修改记录
 *    修改后版本:     修改人：  修改日期: 2019年11月09日  修改内容:
 * </pre>
 */
@RestController
public class HelloController {

    @GetMapping(value = "/hello")
    public String sayHello(){
        return "hello world!";
    }
}
