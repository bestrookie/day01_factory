package com.itheima.ui;

import com.itheima.dao.IAccountDao;
import com.itheima.factory.BeanFactory;
import com.itheima.sercive.IAccountService;
import com.itheima.sercive.impl.AccountServiceImpl;

/**
 * 模拟表现层调用业务层
 */
public class Client {
    public static void main(String[] args) {
        //IAccountService as = new AccountServiceImpl();
        IAccountService as = (IAccountService) BeanFactory.getBean("accountSrecive");
        as.saveAccount();
    }
}
