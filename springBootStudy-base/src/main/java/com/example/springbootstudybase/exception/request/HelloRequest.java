package com.example.springbootstudybase.exception.request;

import com.example.springbootstudybase.exception.annotation.MyAnnotation;
import com.example.springbootstudybase.exception.inter.CreateOperation;
import com.example.springbootstudybase.exception.inter.UpdateOperation;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.groups.Default;

/**
 * Created by yhb on 2022-01-25
 */
@Data
public class HelloRequest {

    @NotBlank(message = "名称不能为空")
    private String name;

    @MyAnnotation(message = "招呼不可为空")
    @MyAnnotation.List({@MyAnnotation(groups = CreateOperation.class, message = "招呼必须为create"),
            @MyAnnotation(groups = UpdateOperation.class, message = "招呼必须为update")})
    private String hello;

    @NotBlank(message = "不可为空", groups = {CreateOperation.class, Default.class})
    private String message;

    @Length(min = 18, max = 18, message = "China身份编号只能是18位的。", groups = {CreateOperation.class, Default.class})
    @Length(min = 12, max = 12, message = "USA身份编号只能是12位的。", groups = {UpdateOperation.class})
    /* @Length.List({@Length(min = 18, max = 18, message = "China身份编号只能是18位的。", groups = {CreateOperation.class, Default.class}),
     @Length(min = 12, max = 12, message = "USA身份编号只能是12位的。", groups = {UpdateOperation.class})})*/
    private String id;

    @MyAnnotation.List({@MyAnnotation(groups = CreateOperation.class, message = "招呼必须为create", value = "create"),
            @MyAnnotation(groups = UpdateOperation.class, message = "招呼必须为update", value = "update")})
    private String ids;
}
