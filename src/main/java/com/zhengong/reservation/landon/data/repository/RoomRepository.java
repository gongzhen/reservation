package com.zhengong.reservation.landon.data.repository;

import org.springframework.data.repository.CrudRepository;
import com.zhengong.reservation.landon.data.entity.Room;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long>{

    Room findByNumber(String number);
}
