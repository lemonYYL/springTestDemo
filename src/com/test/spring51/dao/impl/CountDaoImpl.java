package com.test.spring51.dao.impl;

import com.test.spring51.dao.CountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CountDaoImpl implements CountDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void reduceMoney() {
        String sql ="update count set money = money-? where name=?";
        jdbcTemplate.update(sql,100,"zt");
    }

    @Override
    public void addMoney() {
        String sql = "update count set money = money+? where name=?";
        jdbcTemplate.update(sql,100,"wzb");
    }
}
