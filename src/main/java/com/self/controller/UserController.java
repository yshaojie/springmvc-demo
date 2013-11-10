package com.self.controller;

import com.self.base.BaseController;
import com.self.entity.ScmUser;
import com.self.service.ScmUserService;
import net.minidev.json.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * User: shaojieyue
 * Date: 10/21/13
 * Time: 6:39 PM
 */
@Controller
@RequestMapping("/self/user")
public class UserController extends BaseController {

    @Resource
    private ScmUserService scmUserService;

    @RequestMapping("getAll.do")
    @ResponseBody
    public String commitUrlDetection(@RequestParam("url")String url ){
        logger.debug("hello request");
        List<ScmUser> list = scmUserService.getAll();
        if(list == null){
            list = new ArrayList<ScmUser>(0);
        }
        JSONArray array = new JSONArray();
        array.addAll(list);
        return array.toJSONString();
    }

}
