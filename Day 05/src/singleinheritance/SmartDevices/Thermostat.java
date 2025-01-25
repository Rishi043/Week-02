package singleinheritance.SmartDevices;

public class Thermostat extends device {
        String temperatureSetting;

        // Overriding displayStatus() to include temperature setting
        void displayStatus()
        {
            // Call the displayStatus() of the superclass to show Device details

            super.displayStatus();   // used to call superclass method

            // Add temperature setting
            System.out.println("Temperature Setting: " + temperatureSetting);
        }
    }

