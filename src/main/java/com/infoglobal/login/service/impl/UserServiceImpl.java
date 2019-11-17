package com.infoglobal.login.service.impl;

import com.infoglobal.login.dao.UserDao;
import com.infoglobal.login.entity.IGUser;
import com.infoglobal.login.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public IGUser create(IGUser user) {
        return userDao.save(user);
    }

}
