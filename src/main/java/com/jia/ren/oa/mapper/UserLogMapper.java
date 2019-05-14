package com.jia.ren.oa.mapper;

import com.jia.ren.oa.pojo.UserLog;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserLogMapper {
    int insert(UserLog userLog);
}
