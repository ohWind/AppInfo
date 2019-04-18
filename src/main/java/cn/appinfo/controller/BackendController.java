package cn.appinfo.controller;

import cn.appinfo.pojo.BackendUser;
import cn.appinfo.service.BackendUserService;
import cn.appinfo.tools.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/manager")
public class BackendController {
    @Autowired
    private BackendUserService backendUserService;

    @RequestMapping("/login")
    public String manageLogin(){
        return "backendlogin";
    }

    @RequestMapping("/dologin")
    public String devDoLogin(BackendUser user, Model model, HttpSession session){
        if(user!=null){
            user = backendUserService.selectByCodePwd(user.getUserCode(),user.getUserPassword());
        }
        if(user==null){
            model.addAttribute("error","用户名或密码错误！");
            return "backendlogin";
        } else {
            session.setAttribute(Constants.BACK_USER_SESSION,user);
            return "backend/main";
        }
    }

    @RequestMapping("/logout")
    public String backLogout(HttpSession session){
        session.removeAttribute(Constants.BACK_USER_SESSION);
        return "redirect:login";
    }

}
