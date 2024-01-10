package com.plan.dream.service.impl;

import com.plan.dream.dao.LoginDao;
import com.plan.dream.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @version 1.0
 * @Author qianmingchao
 * @Date 2023/10/23 20:45
 * @Description:
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginDao loginDao;

    @Override
    public void insert(){
        loginDao.insert();
    }

}
