package com.jia.ren.oa.service.impl;

import com.jia.ren.oa.mapper.UserLogMapper;
import com.jia.ren.oa.pojo.UserLog;
import com.jia.ren.oa.service.UserLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLogServiceImpl implements UserLogService {

    @Autowired
    private UserLogMapper userLogMapper;

    @Override
    public int insert(UserLog userLog) {
        int row = userLogMapper.insert(userLog);
        return row;
    }
}
