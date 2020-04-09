package com.three.lonely.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: lonely
 * @author: Josiah
 * @create: 2020-04-09 20:31
 **/
@Api(tags = "用户管理")
@RestController
@RequestMapping("/test")
public class Test {
    @ApiOperation("列表查询")
    @GetMapping(name = "/me",value = "{Id}")
    public String hello(@ApiParam(name = "用户ID", required = true, example = "100") @PathVariable("Id") String id){
        return "Hello World"+id;
    }
}
