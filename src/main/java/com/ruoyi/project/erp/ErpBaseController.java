package com.ruoyi.project.erp;

import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.project.system.dict.domain.DictData;
import com.ruoyi.project.system.dict.service.IDictDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;

import java.util.List;

/**
 * @ClassName ErpBaseController
 * @Description TODO
 * @Author konny
 * @Date 2023/3/12 18:16
 **/
public class ErpBaseController extends BaseController
{
    @Autowired
    private IDictDataService dictDataService;

    /**增加字典值**/
    protected void addDicts(String[] dictArr,ModelMap mmap){
        for (int i = 0; i < dictArr.length; i=i+2) {
            String key = dictArr[i];
            DictData dictData = new DictData();
            dictData.setDictType(key);
            List<DictData> list = dictDataService.selectDictDataList(dictData);
            System.out.println("key="+dictArr[i]+",list="+list);
            mmap.put(dictArr[i+1],list);
        }
    }
}
