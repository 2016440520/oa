package com.jia.ren.oa.service;

import com.jia.ren.oa.pojo.UserLog;
import org.apache.ibatis.annotations.Mapper;

public interface UserLogService {

    int insert(UserLog userLog);
}
