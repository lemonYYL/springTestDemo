package com.test.spring51.dao.impl;

import com.test.spring51.bean.DbStu;
import com.test.spring51.dao.DbStuDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;


@Repository
public class DbStuImpl implements DbStuDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void insert(DbStu dbStu) {
        String sql = "insert into user values(?,?,?,?)";
        int update = jdbcTemplate.update(sql, dbStu.getId(), dbStu.getName(), dbStu.getAge(), dbStu.getGender());
        System.out.println(update);
    }

    @Override
    public void delone(int id) {
        String sql = "delete from user where id=?";
        int update = jdbcTemplate.update(sql, id);
        System.out.println(update);
    }

    @Override
    public void update(DbStu dbStu, int id) {
        String sql = "update user set name=?,age=? where id=?";
        int update = jdbcTemplate.update(sql, dbStu.getName(), dbStu.getAge(), dbStu.getId());
        System.out.println(update);
    }

    @Override
    public String queryName(int id) {
        String sql = "select name from user where id=?";
        String name = jdbcTemplate.queryForObject(sql,String.class,id);
        return name;
    }

    @Override
    public DbStu queryStu(int id) {
        String sql = "select * from user where id=?";
        DbStu stu = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(DbStu.class), id);
        return stu;
    }

    @Override
    public List<DbStu> queryAllL() {
        String sql = "select * from user";
        List<DbStu> list = jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(DbStu.class));
        return list;
    }

    @Override
    public void updateOneMore(List<Object[]> args) {
        String sql = "insert into user values(?,?,?,?)";
        int[] ints = jdbcTemplate.batchUpdate(sql, args);
        System.out.println(Arrays.toString(ints));
    }


}
