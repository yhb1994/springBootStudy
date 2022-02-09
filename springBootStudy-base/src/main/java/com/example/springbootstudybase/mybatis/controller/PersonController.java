package com.example.springbootstudybase.mybatis.controller;

import com.example.springbootstudybase.mybatis.result.Person;
import com.example.springbootstudybase.mybatis.service.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by yhb on 2022-02-09
 */
@Slf4j
@RestController
@RequestMapping("/mybatis")
public class PersonController {

    @Resource
    private PersonService personService;

    @RequestMapping("/list")
    public List<Person> getPersons() {
        return personService.getPersons();
    }

    @RequestMapping("/save")
    public void savePerson(@RequestBody Person person) {
         personService.insertPerson(person);
    }
}
