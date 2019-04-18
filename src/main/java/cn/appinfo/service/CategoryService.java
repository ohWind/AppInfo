package cn.appinfo.service;

import cn.appinfo.pojo.Category;

import java.util.List;

public interface CategoryService {


    public List<Category> selectCategoryLevel1List();

    public List<Category> selectCategoryLevel2List(Long categoryLevel1);

}
