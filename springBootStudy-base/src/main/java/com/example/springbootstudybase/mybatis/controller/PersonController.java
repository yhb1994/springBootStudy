package com.example.springbootstudybase.mybatis.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.springbootstudybase.mybatis.result.Person;
import com.example.springbootstudybase.mybatis.service.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
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

    @RequestMapping("/pageList")
    public IPage<Person> pageList() {
        return personService.getPagePerson();
    }

    @RequestMapping("/save")
    public void savePerson(@RequestBody Person person) {
        personService.insertPerson(person);
    }

    @RequestMapping("/delete/{id}")
    public void deletePerson(@PathVariable String id) {
        personService.deletePerson(id);
    }
}
