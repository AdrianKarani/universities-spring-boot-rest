package com.ics.demo.controller;

import com.ics.demo.models.Room;
import com.ics.demo.services.RoomService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "rooms")
public class RoomController {
    private final RoomService roomService;

    public RoomController(RoomService roomService){
        this.roomService = roomService;
    }

    //get all
    @GetMapping
    public List<Room> findAll(){
        return roomService.findAll();
    }

    //get single room
    @GetMapping(value = "{id}")
    Room findById(@PathVariable long id){
        return roomService.findById(id);
    }

    //create
    @PostMapping
    Room createRoom(
            @Validated(Room.Create.class)
            @RequestBody Room room)
    {
        return roomService.createRoom(room);
    }

    //delete room
    @DeleteMapping(value = "{id}")
    public void deleteRoom(@PathVariable long id){
        roomService.delete(id);
    }

    //update room
    @PatchMapping
    public Room updateRoom(
            @Validated(Room.Update.class)
            @RequestBody Room room)
    {
        return roomService.update(room);
    }


}
