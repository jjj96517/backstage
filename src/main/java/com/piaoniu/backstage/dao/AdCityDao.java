package com.piaoniu.backstage.dao;

import com.piaoniu.backstage.pojo.City;
import com.piaoniu.backstage.pojo.Hall;
import com.piaoniu.backstage.pojo.ShowPlace;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdCityDao {

    List<City> selectcity();  //查看全部城市
    int insertcity(City city); //添加城市
    int delcity(City city);    //删除城市


    //场馆的管理
    List<ShowPlace> selectbycity(Integer city_id);
    int insertshowplace(ShowPlace showPlace);
    int delshowplace(ShowPlace showPlace);

    //演厅的管理
    List<Hall> selecthall(Integer hall_id);
    int inserthall(Hall hall);
    int updatehall(Hall hall);
    int delhall(Hall hall);

}
