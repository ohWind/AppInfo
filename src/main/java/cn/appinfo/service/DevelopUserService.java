package cn.appinfo.service;

import cn.appinfo.pojo.DevelopUser;

public interface DevelopUserService {

    public DevelopUser selectByCodePwd(String devCode,String devPwd);

}
