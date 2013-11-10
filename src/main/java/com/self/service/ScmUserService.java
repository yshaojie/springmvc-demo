package com.self.service;

import com.self.dao.ScmUserDao;
import com.self.entity.ScmUser;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * User: shaojieyue
 * Date: 10/21/13
 * Time: 6:33 PM
 */
@Service("scmUserService")
public class ScmUserService {

    @Resource
    private ScmUserDao scmUserDao;

    public List<ScmUser> getAll(){
        return scmUserDao.getAll();
    }

}
