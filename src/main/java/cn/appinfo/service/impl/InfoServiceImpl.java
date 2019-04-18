package cn.appinfo.service.impl;

import cn.appinfo.dao.InfoMapper;
import cn.appinfo.dto.InfoPage;
import cn.appinfo.pojo.Info;
import cn.appinfo.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InfoServiceImpl implements InfoService {
    @Autowired
    private InfoMapper infoMapper;

    @Override
    public List<Info> selectByInfoPage(Info info, Integer pageNow, Integer pageSize) {
        InfoPage infoPage = new InfoPage();
        infoPage.setPageSize(pageSize);
        infoPage.setStart((pageNow-1)*pageSize);
        if(info != null) {
            infoPage.setCategoryLevel1(info.getCategoryLevel1());
            infoPage.setCategoryLevel2(info.getCategoryLevel2());
            infoPage.setCategoryLevel3(info.getCategoryLevel3());
            infoPage.setFlatformId(info.getFlatformId());
            if (info.getSoftwareName() != null && info.getSoftwareName() != "")
                infoPage.setSoftwareName("%" + info.getSoftwareName() + "%");
        }
        return infoMapper.selectByInfoPageSelective(infoPage);
    }

    @Override
    public int SelectCountByInfo(Info info) {
        return this.selectByInfoPage(info,0,0).size();
    }
}
