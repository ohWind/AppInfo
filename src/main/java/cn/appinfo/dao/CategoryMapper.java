package cn.appinfo.dao;

import cn.appinfo.pojo.Category;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CategoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Category record);

    int insertSelective(Category record);

    Category selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Category record);

    int updateByPrimaryKey(Category record);

    /**
     * parentId=0时查所有category信息
     * parentId为null时查所有一级信息
     * @param id
     * @param parentId
     * @return
     */
    public List<Category> selectByIdParentId(@Param("id") Long id, @Param("parentId") Long parentId);

}