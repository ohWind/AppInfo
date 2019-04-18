package cn.appinfo.service.impl;

import cn.appinfo.dao.CategoryMapper;
import cn.appinfo.pojo.Category;
import cn.appinfo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public List<Category> selectCategoryLevel1List() {
        return categoryMapper.selectByIdParentId(null,null);
    }

    @Override
    public List<Category> selectCategoryLevel2List(Long categoryLevel1) {
        return categoryMapper.selectByIdParentId(null,categoryLevel1);
    }
}
