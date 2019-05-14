package com.jia.ren.oa.mapper;

import com.jia.ren.oa.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginMapper {

    public User login(String username, String password);
}
