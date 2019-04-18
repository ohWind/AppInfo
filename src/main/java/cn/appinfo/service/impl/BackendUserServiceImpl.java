package cn.appinfo.service.impl;

import cn.appinfo.dao.BackendUserMapper;
import cn.appinfo.pojo.BackendUser;
import cn.appinfo.service.BackendUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BackendUserServiceImpl implements BackendUserService {

    @Autowired
    public BackendUserMapper backendUserMapper;

    @Override
    public BackendUser selectByCodePwd(String userCode, String userPassword) {

        return backendUserMapper.selectByCodePwd(userCode,userPassword);
    }
}
