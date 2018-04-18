package com.example.demo;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
@FeignClient( "spring-cloud-producer")//远程调用生产者的接口啊
@Component
public interface HelloRemote {
    @RequestMapping(value = "/hello/{name}",method = RequestMethod.GET)
     String hello(@PathVariable("name") String name) ;//接口中的抽象方法是不用修饰词，因为是抽象方法，默认是抽象的
}

