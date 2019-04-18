package cn.appinfo.service;

import cn.appinfo.pojo.Info;

import java.util.List;

public interface InfoService {

    public List<Info> selectByInfoPage(Info info,Integer pageNow,Integer pageSize);

    public int SelectCountByInfo(Info info);

}
