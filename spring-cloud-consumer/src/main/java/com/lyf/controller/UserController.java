package com.lyf.controller;

import com.lyf.model.Item;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@Api(tags = "user")
public class UserController {

    @PostMapping("/item")
    @ApiOperation("查询详情")
    public Item getItem(@RequestBody Item item){
        return item;
    }
}
