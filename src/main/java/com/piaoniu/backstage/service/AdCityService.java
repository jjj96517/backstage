package com.piaoniu.backstage.service;

import com.piaoniu.backstage.pojo.City;
import com.piaoniu.backstage.pojo.Hall;
import com.piaoniu.backstage.pojo.ShowPlace;
import java.util.List;

public interface AdCityService {
    List<City> selectcity();  //查看全部城市
    int insertcity(City city); //添加城市
    int delcity(City city);    //删除城市

    List<ShowPlace> selectbycity(Integer city_id);
    int insertshowplace(ShowPlace showPlace);
    int delshowplace(ShowPlace showPlace);


    List<Hall> selecthall(Integer hall_id);
    int inserthall(Hall hall);
    int updatehall(Hall hall);
    int delhall(Hall hall);
}
