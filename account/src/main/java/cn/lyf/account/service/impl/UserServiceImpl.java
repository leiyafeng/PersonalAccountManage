package cn.lyf.account.service.impl;

import cn.lyf.account.bean.User;
import cn.lyf.account.dao.UserDao;
import cn.lyf.account.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    /**
     * 根据账号密码查询用户
     * @param userAccount
     * @param password
     * @return
     */
    @Override
    public User getUserByUserAccountAndPassword(String userAccount, String password) {
        User user = userDao.getUserByUserAccountAndPassword(userAccount,password);
        return user;
    }
}