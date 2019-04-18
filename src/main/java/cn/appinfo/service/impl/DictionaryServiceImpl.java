package cn.appinfo.service.impl;

import cn.appinfo.dao.DictionaryMapper;
import cn.appinfo.pojo.Dictionary;
import cn.appinfo.service.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DictionaryServiceImpl implements DictionaryService {
    @Autowired
    private DictionaryMapper dictionaryMapper;

    @Override
    public List<Dictionary> selectByTypeCode(String typeCode) {
        return dictionaryMapper.selectByTypeCode(typeCode);
    }
}
