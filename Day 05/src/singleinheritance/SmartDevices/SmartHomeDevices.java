package singleinheritance.SmartDevices;

public class SmartHomeDevices {
    public static void main(String[] args) {

        Thermostat device1 = new Thermostat();

        // Set device details

        device1.deviceId = 101;
        device1.status = "Working";
        device1.temperatureSetting = "19 degrees";

        // Display the details of the devices

        System.out.println("--- Device Details ---");
        device1.displayStatus();
    }
}


