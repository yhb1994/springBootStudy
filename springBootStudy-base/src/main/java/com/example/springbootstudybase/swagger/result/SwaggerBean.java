package com.example.springbootstudybase.swagger.result;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 请求入参实体类验证
 * Created by yhb on 2022-02-11
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("swagger测试类")
public class SwaggerBean {

    @ApiModelProperty(value = "名称")
    private String name;

    @ApiModelProperty(value = "年龄")
    private String age;
}
