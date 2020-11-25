package com.hrms.mapper;


import com.hrms.bean.Admin;
import org.apache.ibatis.annotations.*;

import java.util.List;

public  interface AdminMapper {

    /**
     * 查询admin
     */
    @Select("SELECT * FROM admin where aName=#{aName} and aPasswd=#{aPasswd}")
    List<Admin> selectByPasswdAndName(@Param("aName") String aName,@Param("aPasswd") String aPasswd);

}
