package cn.appinfo.controller.backend;

import cn.appinfo.pojo.Category;
import cn.appinfo.pojo.Dictionary;
import cn.appinfo.pojo.Info;
import cn.appinfo.service.CategoryService;
import cn.appinfo.service.DictionaryService;
import cn.appinfo.service.InfoService;
import cn.appinfo.tools.Constants;
import cn.appinfo.tools.PageBean;
import com.alibaba.fastjson.JSON;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/manager/check")
public class BdCheckController {
    private Logger logger = Logger.getLogger(this.getClass());
    @Autowired
    private InfoService infoService;
    @Autowired
    private DictionaryService dictionaryService;
    @Autowired
    private CategoryService categoryService;

    @RequestMapping("/list")
    public String bdCheckList(Info info,Integer pageIndex,Model model) {

        PageBean<Info> pb = new PageBean<Info>();
        if(pageIndex!=null)
            pb.setPageNow(pageIndex);
        pb.setCount(infoService.SelectCountByInfo(info));
        pb.setList(infoService.selectByInfoPage(info,pb.getPageNow(),pb.getPageSize()));

        List<Dictionary> flatFormList = dictionaryService.selectByTypeCode(Constants.APP_FLATFORM);

        List<Category> categoryLevel1List = categoryService.selectCategoryLevel1List();

        model.addAttribute("info",info);
        model.addAttribute("categoryLevel1List",categoryLevel1List);
        model.addAttribute("flatFormList",flatFormList);
        model.addAttribute("pageBean",pb);
        return "backend/applist";
    }

    @RequestMapping(value = "/categoryLevel2",produces = "application/json;charset=utf-8")
    @ResponseBody
    public String getCategoryLevel2List(Long categoryLevel1,Model model){

        List<Category> categoryLevel2List = categoryService.selectCategoryLevel2List(categoryLevel1);

        String messJSON = JSON.toJSONString(categoryLevel2List);
        return messJSON;
    }

}
