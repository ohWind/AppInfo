package cn.appinfo.service.impl;

import cn.appinfo.pojo.DevelopUser;
import cn.appinfo.service.DevelopUserService;
import org.springframework.stereotype.Service;

@Service
public class DevelopUserServiceImpl implements DevelopUserService {


    @Override
    public DevelopUser selectByCodePwd(String devCode, String devPwd) {
        return null;
    }
}
