package com.example.springbootstudybase.mybatis.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springbootstudybase.mybatis.dao.PersonDao;
import com.example.springbootstudybase.mybatis.result.Person;
import com.example.springbootstudybase.mybatis.service.PersonService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yhb on 2022-02-09
 */
@Service
public class PersonServiceImpl extends ServiceImpl<PersonDao, Person> implements PersonService {

    @Override
    public List<Person> getPersons() {
        return this.list();
    }

    @Override
    public void insertPerson(Person person) {
        this.save(person);
    }
}
