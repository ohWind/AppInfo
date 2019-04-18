package cn.appinfo.dao;

import cn.appinfo.dto.InfoPage;
import cn.appinfo.pojo.Info;

import java.util.List;

public interface InfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Info record);

    int insertSelective(Info record);

    Info selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Info record);

    int updateByPrimaryKey(Info record);

    public List<Info> selectByInfoPageSelective(InfoPage infoPage);

}