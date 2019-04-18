package cn.appinfo.controller;

import cn.appinfo.pojo.DevelopUser;
import cn.appinfo.pojo.Info;
import cn.appinfo.service.DevelopUserService;
import cn.appinfo.tools.Constants;
import cn.appinfo.tools.PageBean;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/dev")
public class DevelopController {

    private Logger logger = Logger.getLogger(this.getClass());
    @Autowired
    private DevelopUserService developUserService;


    @RequestMapping("/login")
    public String devLogin(){

        return "devlogin";
    }

    @RequestMapping("/dologin")
    public String devDoLogin(DevelopUser user, Model model, HttpSession session){
        if(user!=null){
            user = developUserService.selectByCodePwd(user.getDevCode(),user.getDevPassword());
        }
        if(user==null){
            model.addAttribute("error","用户名或密码错误！");
            return "devlogin";
        } else {
            session.setAttribute(Constants.DEV_USER_SESSION,user);
            return "developer/main";
        }
    }

    @RequestMapping("/logout")
    public String backLogout(HttpSession session){
        session.removeAttribute(Constants.DEV_USER_SESSION);
        return "redirect:login";
    }

    @RequestMapping("/list")
    public String devList(Integer pageNow,Model model){
        List<Info> list = null;

        PageBean<DevelopUser> pb = new PageBean<DevelopUser>();
        if (pageNow != null) {
            pb.setPageNow(pageNow);
        }



        return "appinfolist";
    }



}
