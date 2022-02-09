package com.example.springbootstudybase.mybatis.service;

import com.example.springbootstudybase.mybatis.result.Person;

import java.util.List;

/**
 * Created by yhb on 2022-02-09
 */
public interface PersonService {
    List<Person> getPersons();

    void insertPerson(Person person);
}
