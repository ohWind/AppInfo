package cn.appinfo.service;

import cn.appinfo.pojo.Dictionary;

import java.util.List;

public interface DictionaryService {

    public List<Dictionary> selectByTypeCode(String typeCode);



}
