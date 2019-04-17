package cn.appinfo.controller;

import cn.appinfo.pojo.DevelopUser;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dev")
public class DevelopController {

    private Logger logger = Logger.getLogger(this.getClass());


    @RequestMapping("/login")
    public String devLogin(){

        return "devlogin";
    }

    @RequestMapping("/dologin")
    public String devDoLogin(DevelopUser user){
        if(user!=null){

        }


        return "forward:list";
    }

    @RequestMapping("/list")
    public String devList(){


        return "appinfolist";
    }



}
