package com.ics.demo.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Rooms")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull(groups = Update.class)
    @Column(name = "id")
    private long id;

    @NotNull(groups = Create.class)
    @Column(name = "room_name")
    private String roomName;

    @NotNull(groups = Create.class)
    @Column(name = "location")
    private String location;

    //empty contructor
    public Room() {}

    public Room(@NotNull(groups = Create.class) String roomName, @NotNull(groups = Create.class) String location) {
        this.roomName = roomName;
        this.location = location;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    //update and create interface
    public interface Create{}
    public interface Update{}

}
