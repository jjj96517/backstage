package com.piaoniu.backstage.service;

import com.piaoniu.backstage.pojo.ShowType;

import java.util.List;

public interface AdminService {
    int addshowType(ShowType showType);
    List<ShowType> select();
    int updateshowType(ShowType showType);
    int delshowType(ShowType showType);
}
