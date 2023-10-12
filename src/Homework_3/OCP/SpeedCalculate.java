package Homework_3.OCP;

public class SpeedCalculate {
    public double cclaculateAllowedSpeed(Vehicle vehicle){
        if (vehicle.getType().equalsIgnoreCase("Car")){
            return vehicle.getMaxSpeed() * 0.8;
        }
        else if (vehicle.getType().equalsIgnoreCase("Bus")){
            return vehicle.getMaxSpeed() * 0.5;
        }
        else return 0;

    }
}
