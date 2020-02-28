package com.itheima.sercive.impl;

import com.itheima.dao.IAccountDao;
import com.itheima.dao.impl.AccointDaoImpl;
import com.itheima.factory.BeanFactory;
import com.itheima.sercive.IAccountService;

/**
 * 账户的业务层实现类
 */
public class AccountServiceImpl implements IAccountService {
    //private IAccountDao accountDao = new AccointDaoImpl();
    private IAccountDao accountDao = (IAccountDao) BeanFactory.getBean("accountDao");
    public void saveAccount(){
        accountDao.saveAccount();
    }
}
