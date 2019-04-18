package cn.appinfo.dao;

import cn.appinfo.pojo.BackendUser;
import org.apache.ibatis.annotations.Param;

public interface BackendUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BackendUser record);

    int insertSelective(BackendUser record);

    BackendUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BackendUser record);

    int updateByPrimaryKey(BackendUser record);

    /**
     * 根据用户编码和密码获得后端用户信息
     * @param userCode
     * @param userPassword
     * @return
     */
    public BackendUser selectByCodePwd(@Param("userCode") String userCode, @Param("userPassword") String userPassword);

}