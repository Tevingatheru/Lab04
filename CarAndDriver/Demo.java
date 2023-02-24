public class Demo {

    public static void main (String [] args) {
	    Car  rolls; // declaring variable of type Car called rolls
        Driver nigel; // declaring variable of type Driver called nigel
        ServiceStation esso; // declaring the variable service station.

        rolls = new Car(); // instantiation of rolls
        nigel = new Driver(); // instantiation of nigel
        esso = new ServiceStation();// instantiation of service station

        System.out.println("Rolls: " + rolls.getStatus()); // expect: Rolls: {status}

        System.out.println("Gas up the Rolls"); // expect: Gas up the Rolls
        esso.fill(rolls); // expect: tank set to full

        System.out.println("Rolls: " + rolls.getStatus()); // expect: Rolls: {status}

        System.out.println("Nigel drives the Rolls"); // expect: Nigel drives the Rolls
        nigel.drive(rolls); // expect: set tank to empty and set body to dirty

        System.out.println("Rolls: " + rolls.getStatus()); // expect: Rolls: {status}

        System.out.println("Clean and gas up the Rolls"); // expect: Clean and gas up the Rolls
        // Substitute code here to clean the Rolls
	    // and fill it with gas
        CarWash carWash = new CarWash();

        carWash.wash(rolls); // wash the car

        esso.fill(rolls); // expect: tank set to full

        System.out.println("Rolls: " + rolls.getStatus()); // expect: Rolls: {status}
    }
}
