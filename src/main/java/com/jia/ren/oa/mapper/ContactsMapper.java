package com.jia.ren.oa.mapper;

import com.jia.ren.oa.pojo.Contacts;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ContactsMapper {
    List<Contacts> findAllContacts(Integer id);

    int insert(Contacts contacts);

    int delete(int c_id);

    int update(Contacts contacts);
}
