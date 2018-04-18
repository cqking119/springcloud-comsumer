package com.example.demo.controller;
import com.example.demo.springbootinterface.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestaController {
    @Autowired
    HelloRemote helloRemote;
    @RequestMapping(value = "/hello/{name}",method = RequestMethod.GET)
    public String index(@PathVariable("name") String name) {
        return helloRemote.hello(name);
    }
//    @RequestMapping(value = "/hello/{name}",method = RequestMethod.GET)
//    public String index(@PathVariable("name") String name) {
//        return  name;
//    }
}
