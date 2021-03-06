package com.example.springbootstudybase.mybatis.result;

import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 人物信息
 * Created by yhb on 2022-02-09
 */
@Data
@TableName("person")
public class Person {

    private String id;

    private String name;

    private Integer age;

    /**
     * 标记逻辑删除字段(0:未删除 -1:已删除)
     */
    @TableLogic
    private Integer sign = 0;
}
