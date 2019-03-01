package com.piaoniu.backstage.service;

import com.piaoniu.backstage.pojo.Show;

import java.util.List;

public interface AdShowService {
    List<Show> selectshow();
    int insertshow(Show show);
    int updateshow(Show show);
    int delshow(Show show);
}
