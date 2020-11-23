package Program;

import java.util.ArrayList;
import java.util.UUID;

/*
 * This class is responsible for keeping
 * track of the building and its associated
 * sensors and actuators
 */

public class Building extends Unit {
    private ArrayList<Sensor> sensors;
    private ArrayList<Actuator> actuators;

    public Building(String name) {
        super(name);
        sensors = new ArrayList<>();
        actuators = new ArrayList<>();
    }

    public ArrayList<Actuator> getActuators() {
        return actuators;
    }

    public ArrayList<Sensor> getSensors() {
        return sensors;
    }

    public UUID addTempSensor(Sensor sensor) {
        sensors.add(sensor);
        return sensor.getId();
    }

    public UUID addCo2Sensor(Sensor sensor) {
        sensors.add(sensor);
        return sensor.getId();
    }

    public UUID addVentActuator(Actuator actuator) {
        actuators.add(actuator);
        return actuator.getId();
    }

    public void removeSensor(UUID id) {
        for (int i = 0; i < sensors.size(); i++) {
            Sensor sensor = sensors.get(i);
            if (sensor.getId() == id) {
                sensors.remove(sensor);
            }
        }
    }

    public void removeActuator(UUID id) {
        for (int i = 0; i < actuators.size(); i++) {
            Actuator actuator = actuators.get(i);
            if (actuator.getId() == id) {
                actuators.remove(actuator);
            }
        }
    }
}
