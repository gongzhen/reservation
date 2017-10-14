package com.zhengong.reservation.landon.data.repository;

import com.zhengong.reservation.landon.data.entity.Guest;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends PagingAndSortingRepository<Guest, Long>{



}
