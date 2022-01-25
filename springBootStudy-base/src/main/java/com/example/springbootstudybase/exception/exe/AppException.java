package com.example.springbootstudybase.exception.exe;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by yhb on 2022-01-25
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class AppException extends RuntimeException {

    private String code;

}
