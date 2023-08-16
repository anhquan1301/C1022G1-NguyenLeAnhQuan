package baitap.DesignPattern;

interface Vehicle{
    void displaySpeed();
}

class Car implements Vehicle{
    @Override
    public void displaySpeed() {
        System.out.println("100km/1h");
    }
}

class MotoBike implements Vehicle{
    @Override
    public void displaySpeed() {System.out.println("80km/1h");}
}

enum VehicleObject{
  CAR,MOTOBIKE
}

public class FactoryPattern {
    public static Vehicle createVehicle (VehicleObject vehicleObject){
        switch (vehicleObject){
            case CAR:
                return new Car();
            case MOTOBIKE:
                return new MotoBike();
            default:
                return null;
        }
    }
}
class Client {
    public static void main(String[] args) {
        Vehicle vehicle = FactoryPattern.createVehicle(VehicleObject.CAR);
        Vehicle vehicle1 = FactoryPattern.createVehicle(VehicleObject.MOTOBIKE);
        vehicle.displaySpeed();
        vehicle1.displaySpeed();
    }
}
