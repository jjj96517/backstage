package com.piaoniu.backstage.service;



import com.piaoniu.backstage.pojo.Order;

import java.util.List;

public interface HtOrderService {
    List<Order> SelectOrderInfoByCondition(Order order);
    List<Order> findAllOrderInfo();
}
