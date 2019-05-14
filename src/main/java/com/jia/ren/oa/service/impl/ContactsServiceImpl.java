package com.jia.ren.oa.service.impl;

import com.jia.ren.oa.mapper.ContactsMapper;
import com.jia.ren.oa.pojo.Contacts;
import com.jia.ren.oa.service.ContactsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.nio.cs.CharsetMapping;

import java.util.List;

@Service
public class ContactsServiceImpl implements ContactsService {

    @Autowired
    private ContactsMapper contactsMapper;

    @Override
    public int save(Contacts contacts) {
        return contactsMapper.insert(contacts);
    }

    @Override
    public int updateContacts(Contacts contacts) {
        return contactsMapper.update(contacts);
    }

    @Override
    public int deleteContactsByid(Integer c_id) {
        return contactsMapper.delete(c_id);
    }


    @Override
    public List<Contacts> queryAll(Integer id) {

        return contactsMapper.findAllContacts(id);
    }
}
