package com.piaoniu.backstage.service.impl;


import com.piaoniu.backstage.dao.SysRoleDao;
import com.piaoniu.backstage.pojo.SysRole;
import com.piaoniu.backstage.service.SysRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SysRoleServiceImpl implements SysRoleService {

    @Resource
    private SysRoleDao roleDao;

    @Override
    public List<SysRole> findRoleByUid(Integer id) {
        return roleDao.findRoleByUid(id);
    }

    @Override
    public int add(SysRole sysRole) {
        return roleDao.add(sysRole);
    }

    @Override
    public int delete(Integer id) {
        return roleDao.delete(id);
    }
}
