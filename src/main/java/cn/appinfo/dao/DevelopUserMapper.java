package cn.appinfo.dao;

import cn.appinfo.pojo.DevelopUser;
import org.apache.ibatis.annotations.Param;

public interface DevelopUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DevelopUser record);

    int insertSelective(DevelopUser record);

    DevelopUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DevelopUser record);

    int updateByPrimaryKey(DevelopUser record);

    public DevelopUser selectByCodePwd(@Param("devCode") String devCode,@Param("devPassword") String devPassword);

}