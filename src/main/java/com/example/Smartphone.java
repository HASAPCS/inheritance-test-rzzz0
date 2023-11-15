package com.example;

// TODO: make this class extend ElectronicDevice
public class Smartphone extends ElectronicDevice {
    private int batteryLevel;

    // TODO: Declare the necessary attributes (brand, model, batteryLevel)

    // Constructor to initialize the Smartphone object
    public Smartphone(String brand, String model, int batteryLevel) {
        // TODO: Initialize the attributes with the provided parameters
        super(brand, model);
        this.batteryLevel = batteryLevel;
    }
    public int getBatteryLevel(){
        return this.batteryLevel;
    }
 
    
    public String checkBattery(){

        if(this.batteryLevel <= 20){
            return "Warning: Battery low!";
        }
        else {
            return "Battery level is okay: " + batteryLevel + "%";
        }
    }
    

    // TODO: Implement a method to check the battery level and return a message
    // based on the level
    // Implement the checkBattery method to return:
    // "Warning: Battery low!" if the battery level is 20% or lower.
    // "Battery level is okay: [batteryLevel]%." if the battery level is above 20%.

    // TODO: Implement necessary getters for the attributes
    // OPTIONALLY implement the required methods to pass the BonusTest.

}

