package com.piaoniu.backstage.service.impl;

import com.piaoniu.backstage.dao.AdCityDao;
import com.piaoniu.backstage.pojo.City;
import com.piaoniu.backstage.pojo.Hall;
import com.piaoniu.backstage.pojo.ShowPlace;
import com.piaoniu.backstage.service.AdCityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AdCityServiceImpl implements AdCityService {
    @Resource
    private AdCityDao adCityDao;

    @Override
    public List<City> selectcity() {
        return adCityDao.selectcity();
    }

    @Override
    public int insertcity(City city) {
        return adCityDao.insertcity(city);
    }

    @Override
    public int delcity(City city) {
        return adCityDao.delcity(city);
    }

    @Override
    public List<ShowPlace> selectbycity(Integer city_id) {
        return adCityDao.selectbycity(city_id);
    }

    @Override
    public int insertshowplace(ShowPlace showPlace) {
        return adCityDao.insertshowplace(showPlace);
    }

    @Override
    public int delshowplace(ShowPlace showPlace) {
        return adCityDao.delshowplace(showPlace);
    }

    @Override
    public List<Hall> selecthall(Integer hall_id) {
        return adCityDao.selecthall(hall_id);
    }

    @Override
    public int inserthall(Hall hall) {
        return adCityDao.inserthall(hall);
    }

    @Override
    public int updatehall(Hall hall) {
        return adCityDao.updatehall(hall);
    }

    @Override
    public int delhall(Hall hall) {
        return adCityDao.delhall(hall);
    }
}
