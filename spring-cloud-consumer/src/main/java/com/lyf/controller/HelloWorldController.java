package com.lyf.controller;

import com.lyf.model.Item;
import com.lyf.service.ItemService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Api(tags = "hello")
public class HelloWorldController {

    @Autowired
    private ItemService itemService;

    @Value("${hello}")
    private String hello;

    @GetMapping("/hello")
    @ApiOperation("打招呼")
    public String hello(@ApiParam("名称") @RequestParam String name){
        System.out.println(hello);
        return "hello,"+name;
    }

    @GetMapping("/list")
    @ApiOperation("查询列表")
    public Object getItems(){
        return itemService.queryPage(new Item());
    }
}
