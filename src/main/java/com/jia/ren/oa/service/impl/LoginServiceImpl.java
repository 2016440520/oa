package com.jia.ren.oa.service.impl;

import com.jia.ren.oa.mapper.LoginMapper;
import com.jia.ren.oa.pojo.User;
import com.jia.ren.oa.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LoginServiceImpl implements LoginService{

    @Autowired
    private LoginMapper loginMapper;

    @Override
    public User login(String username, String password) {
        return loginMapper.login(username,password);
    }
}
