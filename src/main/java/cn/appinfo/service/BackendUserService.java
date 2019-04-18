package cn.appinfo.service;

import cn.appinfo.pojo.BackendUser;

public interface BackendUserService {

    public BackendUser selectByCodePwd(String userCode, String userPassword);

}
