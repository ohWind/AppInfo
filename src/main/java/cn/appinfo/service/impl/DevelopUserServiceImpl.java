package cn.appinfo.service.impl;

import cn.appinfo.dao.DevelopUserMapper;
import cn.appinfo.pojo.DevelopUser;
import cn.appinfo.service.DevelopUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DevelopUserServiceImpl implements DevelopUserService {

    @Autowired
    public DevelopUserMapper developUserMapper;

    @Override
    public DevelopUser selectByCodePwd(String devCode, String devPassword) {

        return developUserMapper.selectByCodePwd(devCode,devPassword);
    }
}
