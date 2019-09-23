package com.ics.demo.services;

import com.ics.demo.models.Room;

import java.util.List;

public interface RoomService {
    List<Room> findAll();

    Room createRoom(Room room);

    void delete(long id);

    Room update(Room room);

    Room findById(long id);
}
