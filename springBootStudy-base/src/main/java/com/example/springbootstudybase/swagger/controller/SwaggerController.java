package com.example.springbootstudybase.swagger.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.springbootstudybase.BusinessResult;
import com.example.springbootstudybase.mybatis.result.Person;
import com.example.springbootstudybase.mybatis.service.PersonService;
import com.example.springbootstudybase.swagger.result.SwaggerBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

import static com.google.common.collect.Lists.newArrayList;

/**
 * Created by yhb on 2022-02-11
 */
@RestController
@RequestMapping("/swagger")
@Api(tags = "swagger测试")
public class SwaggerController {

    @Resource
    private PersonService personService;

    @GetMapping("/test1") //定义具体的请求方式
    @ApiOperation("获取数据")
    public IPage<Person> pageList() {
        return personService.getPagePerson();
    }

    @GetMapping("/test2") //定义具体的请求方式
    @ApiOperation("GET获取数据") //返回类型必须要指定对应的泛型才行
    public BusinessResult<SwaggerBean> test2(
            @ApiParam(value = "名称")
            @RequestParam(required = false) String name,
            @ApiParam(value = "年龄")
            @RequestParam(required = false) String age) {
        return BusinessResult.success(newArrayList(new SwaggerBean(name, age)));
    }

    @PostMapping("/test3") //定义具体的请求方式
    @ApiOperation("POST获取数据")
    public BusinessResult<SwaggerBean> test3(@RequestBody SwaggerBean swaggerBean) {
        return BusinessResult.success(newArrayList(swaggerBean));
    }
}
