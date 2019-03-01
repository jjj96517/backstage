package com.piaoniu.backstage.dao;

import com.piaoniu.backstage.pojo.ShowType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdminDao {

    int addshowType(ShowType showType);  //添加演出类型
    List<ShowType> select();    //查看演出类型
    int updateshowType(ShowType showType); //修改演出类型
    int delshowType(ShowType showType);  //删除演出类型

}
