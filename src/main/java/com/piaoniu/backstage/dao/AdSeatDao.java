package com.piaoniu.backstage.dao;


import com.piaoniu.backstage.pojo.Seat;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdSeatDao {
    int insertseat(Seat seat);  //添加座位信息
    List<Seat> selectseat(Integer hall_id);    //查看座位
    int updateseat(Seat seat); //修改座位
    int delseat(Seat seat);  //删除座位
}
