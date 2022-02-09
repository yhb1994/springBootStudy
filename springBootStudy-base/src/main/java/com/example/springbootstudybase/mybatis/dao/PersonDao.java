package com.example.springbootstudybase.mybatis.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springbootstudybase.mybatis.result.Person;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by yhb on 2022-02-09
 */
@Mapper
public interface PersonDao extends BaseMapper<Person> {

    List<Person> getPerson();
}
