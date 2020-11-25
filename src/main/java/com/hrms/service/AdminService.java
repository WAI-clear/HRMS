package com.hrms.service;

import com.hrms.bean.Admin;
import com.hrms.mapper.AdminMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class AdminService {
    @Autowired
    AdminMapper adminMapper;
    public List<Admin> selectByPasswdAndName(String aName, String aPasswd){

        return adminMapper.selectByPasswdAndName(aName,aPasswd);
    }

}
