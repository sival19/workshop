package Program;

public class Main {

    public static void main(String[] args) {
	BuildingAdministrationSystem admin = new BuildingAdministrationSystem();

	Building b1 = new Building("GressumsInc");
	Building b2 = new Building("BananaInc");

	TemperatureSensor t1 = new TemperatureSensor("Gressums Kontor", 25);
	TemperatureSensor t2 = new TemperatureSensor("Amnums Kontor", 27);
	TemperatureSensor t3 = new TemperatureSensor("Lasses Kontor", 12);

	b1.addTempSensor(t1);
	b1.addTempSensor(t2);
	System.out.println(b1.addTempSensor(t3));

	/* test remove methods
	* test other add methods
	* test getters
	* test setters
	 */







    }
}
