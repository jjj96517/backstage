package com.piaoniu.backstage.service.impl;


import com.piaoniu.backstage.dao.Ht_UserDao;
import com.piaoniu.backstage.pojo.User;
import com.piaoniu.backstage.service.HtUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class HtUserServiceImpl implements HtUserService {

    @Resource
    private Ht_UserDao ht_userDao;

    @Override
    public List<User> findAllUserInfo() {
        return ht_userDao.findAllUserInfo();
    }
}
