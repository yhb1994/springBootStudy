package com.example.springbootstudybase.mybatis.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.springbootstudybase.mybatis.result.Person;

import java.util.List;
import java.util.Map;

/**
 * Created by yhb on 2022-02-09
 */
public interface PersonService {
    IPage<Person> getPagePersonList(Map<String, Object> map);

    IPage<Person> getPagePerson();

    List<Person> getPersons();

    void insertPerson(Person person);

    void deletePerson(String id);
}
