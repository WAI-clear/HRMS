package com.hrms.controller;

import com.hrms.bean.Admin;


import com.hrms.service.AdminService;
import com.hrms.util.JsonMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author GenshenWang.nomico
 * @date 2018/3/9.
 */
@Controller
@RequestMapping(value = "/hrms")
public class LoginController {
    @Autowired
    AdminService adminService;

    /**
     * 登录：跳转到登录页面
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(){
        return "login";
    }

    /**
     * 对登录页面输入的用户名和密码做简单的判断
     * @param request
     * @return
     */
    @RequestMapping(value = "/dologin", method = RequestMethod.POST)
    //@ResponseBody
    public String dologin(HttpServletRequest request){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println(username + password);
        if (!"admin1234".equals(username + password)){

        }
        return "main";
    }
    @RequestMapping(value = "/adminLogin", method = RequestMethod.GET)
    //@ResponseBody
    public String adminLogin(){
        return "admin";
    }
    @RequestMapping(value = "/admin",method = RequestMethod.POST)
    //@ResponseBody
    public String adminDoLogin(HttpServletRequest request){
        String aName = request.getParameter("username");
        String aPasswd = request.getParameter("password");
        System.out.println(aName + aPasswd);
        List<Admin> rs= adminService.selectByPasswdAndName(aName,aPasswd);
        if(rs.size() !=0){
            return "main";
        }
        return "admin";

    }

    /**
     * 跳转到主页面
     * @return
     */
    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public String main(){

        return "main";
    }

    /**
     * 退出登录：从主页面跳转到登录页面
     * @return
     */
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(){

        System.out.println("logout");
        return "login";
    }






}
