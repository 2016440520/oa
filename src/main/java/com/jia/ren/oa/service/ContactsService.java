package com.jia.ren.oa.service;

import com.jia.ren.oa.pojo.Contacts;

import java.util.List;

public interface ContactsService {
    List<Contacts> queryAll(Integer id);

    int save(Contacts contacts);

    int deleteContactsByid(Integer c_id);

    int updateContacts(Contacts contacts);
}
