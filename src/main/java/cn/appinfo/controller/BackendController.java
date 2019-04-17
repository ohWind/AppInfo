package cn.appinfo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/manager")
public class BackendController {

    @RequestMapping("/login")
    public String manageLogin(){
        return "backendlogin";
    }

}
