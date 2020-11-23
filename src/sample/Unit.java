package com.company;

import java.util.UUID;

/*
 * This class is responsible for keeping
 * track of the name and id of buildings,
 * sensors and actuators
 */

public class Unit {
    private String name;
    private UUID id;

    public Unit(String name){
        this.id = UUID.randomUUID();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public UUID getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
