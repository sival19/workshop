package com.company;

import java.util.ArrayList;
import java.util.UUID;

/*
 * This class is responsible for keeping
 * track of the ?????
 */

public class BuildingAdministrationSystem {
    private ArrayList<Building> buildings;

    public ArrayList<Building> getBuildings() {
        return buildings;
    }

    public UUID addBuilding(Building building){
        buildings.add(building);
        return building.getId();
    }

    public void removeBuilding(UUID id){
        for (int i = 0; i < buildings.size(); i++) {
            Building building = buildings.get(i);
            if (building.getId() == id) {
                buildings.remove(building);
            }
        }
    }
}
