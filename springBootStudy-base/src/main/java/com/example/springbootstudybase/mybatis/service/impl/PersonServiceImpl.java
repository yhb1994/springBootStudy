package com.example.springbootstudybase.mybatis.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springbootstudybase.mybatis.dao.PersonDao;
import com.example.springbootstudybase.mybatis.result.Person;
import com.example.springbootstudybase.mybatis.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yhb on 2022-02-09
 */
@Service
@RequiredArgsConstructor
public class PersonServiceImpl extends ServiceImpl<PersonDao, Person> implements PersonService {

    private final PersonDao personDao;

    /**
     * 简单的分页(会过滤调逻辑删除的数据)
     *
     * @return IPage<Person>
     */
    @Override
    public IPage<Person> getPagePerson() {
        return personDao.selectPage(new Page<>(1, 10), new QueryWrapper<Person>().eq("name", "yhb"));
    }

    @Override
    public List<Person> getPersons() {
        return personDao.getPerson();
    }

    @Override
    public void insertPerson(Person person) {
        this.save(person);
    }

    @Override
    public void deletePerson(String id) {
        this.removeById(id);
    }
}
