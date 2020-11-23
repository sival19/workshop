package Program;

/*
 * This class is responsible for keeping
 * track of the value of a VentActuator
 */

public class VentilationActuator extends Actuator{

    public VentilationActuator(String name, double value) {
        super(name, value);
    }

    @Override
    public void setValue(double value) {
        super.setValue(value);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
