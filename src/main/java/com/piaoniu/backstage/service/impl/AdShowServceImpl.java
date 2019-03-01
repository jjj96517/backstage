package com.piaoniu.backstage.service.impl;

import com.piaoniu.backstage.dao.AdShowDao;
import com.piaoniu.backstage.pojo.Show;
import com.piaoniu.backstage.service.AdShowService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AdShowServceImpl implements AdShowService {

    @Resource
    private AdShowDao adShowDao;
    @Override
    public List<Show> selectshow() {
        return adShowDao.selectshow();
    }

    @Override
    public int insertshow(Show show) {
        return adShowDao.insertshow(show);
    }

    @Override
    public int updateshow(Show show) {
        return adShowDao.updateshow(show);
    }

    @Override
    public int delshow(Show show) {
        return adShowDao.delshow(show);
    }
}
