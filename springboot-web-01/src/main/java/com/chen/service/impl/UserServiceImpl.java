package com.chen.service.impl;

import com.chen.dao.UserDao;
import com.chen.dao.impl.UserDaoImpl;
import com.chen.pojo.User;
import com.chen.service.UserService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class UserServiceImpl implements UserService {


    private UserDao UserDao = new UserDaoImpl();

    @Override
    public List<User> findAll(){
        //1.从Dao中获取数据
        List<String> lines = UserDao.findAll();

        //2.对获取的数据进行拆分处理
        List<User> userList = lines.stream().map(line->{
            String[] parts= line.split(",");
            Integer id=Integer.parseInt(parts[0]);
            String username=parts[1];
            String password=parts[2];
            String name=parts[3];
            Integer age=Integer.parseInt(parts[4]);
            LocalDateTime updateTime= LocalDateTime.parse(parts[5], DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            return new User(id,username,password,name,age,updateTime);
        }).toList();
        return userList;
    }
}
