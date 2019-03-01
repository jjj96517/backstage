package com.piaoniu.backstage.service.impl;


import com.piaoniu.backstage.dao.SysUserDao;
import com.piaoniu.backstage.pojo.SysUser;
import com.piaoniu.backstage.service.SysUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Resource
    private SysUserDao sysUserDao;

    @Override
    public SysUser findByUserName(String username) {
        return sysUserDao.findByUserName(username);
    }

    @Override
    public int add(SysUser sysUser) {
        return sysUserDao.add(sysUser);
    }

    @Override
    public int delete(int uid) {
        return sysUserDao.delete(uid);
    }
}
