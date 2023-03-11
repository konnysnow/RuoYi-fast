package com.ruoyi.project.erp.mini.controller;

import com.alibaba.fastjson.JSONArray;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.erp.homework.domain.Homework;
import com.ruoyi.project.erp.homework.service.IHomeworkService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ClassName MiniApiController
 * @Description TODO
 * @Author konny
 * @Date 2023/2/25 10:23
 **/
@Controller
@RequestMapping("/erp/miniapi")
public class MiniApiController extends BaseController
{
    private String prefix = "erp/miniapi";

    @Autowired
    private IHomeworkService homeworkService;
    /**
     * 查询作业列表
     */
//    @RequiresPermissions("erp:homework:view")
    @PostMapping("/home")
    @ResponseBody
    public TableDataInfo list(Homework homework)
    {
        startPage();
        List<Homework> list = homeworkService.selectHomeworkList(homework);
        return getDataTable(list);
    }
    @PostMapping("/home2")
    @ResponseBody
    public String list2(Homework homework)
    {
        return "getDataTable(list)";
    }
    /*轮播图接口*/
    @PostMapping("/swiperList")
    @ResponseBody
    public JSONArray genSwiperImageList(Homework homework)
    {
        System.out.println("1111\n\n");
        JSONArray arr=new JSONArray();
        for(int i=1;i<=5;i++){
            String str="http://qiniu.konny.space/erp/tutu.konny.space/banner"+i+".jpg";
            arr.add(str);
            System.out.println(str+"\n\n");
        }
        System.out.println("22222\n\n");
        return arr;
    }
}
