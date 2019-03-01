package com.piaoniu.backstage.dao;

import com.piaoniu.backstage.model.IndexModel;
import com.piaoniu.backstage.pojo.Hall;
import com.piaoniu.backstage.pojo.Seat;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TicketDao {
    List<IndexModel> SelectCCBySid(String show_name);
    List<Hall> SelectZTBySid(int show_id);
    List<Seat> SelectSeatByHall(int hall_id);
    int UpdateSeatStatus(int seat_id);
    List<Seat> SelectSeatByMoneyAndSid(Seat seat);
}
