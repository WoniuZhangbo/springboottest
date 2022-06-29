package com.zb.example.springboothelloworld.controller;


import com.zb.example.springboothelloworld.entity.Test;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(value = "接口说明", tags = "接口说明")
public class TestController {

    @ApiOperation(value = "方法描述", notes = "提示内容")
    @PostMapping(value = "/testPost")
    public String testPost(@RequestBody Test t) {
        return "ok";
    }

    // 方法描述示例
    @ApiOperation(value = "方法描述", notes = "提示内容")
    @GetMapping(value = "/testGet")
    public String testGet(@PathVariable @ApiParam(name = "参数名", value = "参数说明", required = true) Integer i) {
        return "fail";
    }

}