package com.zhengong.reservation.landon.data.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "RESERVATION")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "RESERVATION_ID")
    private long id;

    @Column(name = "ROOM_ID")
    private long roomId;

    @Column(name = "GUEST_ID")
    private long guestId;

    @Column(name = "RES_DATE")
    private Date date;

    public long getId() {
        return id;
    }

    public long getRoomId() {
        return roomId;
    }

    public long getGuestId() {
        return guestId;
    }

    public Date getDate() {
        return date;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setRoomId(long roomId) {
        this.roomId = roomId;
    }

    public void setGuestId(long guestId) {
        this.guestId = guestId;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
