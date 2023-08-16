package baitap.OCA;

public class OCA_3 {
    class Vehicle{
        String type = "4W";
        int maxSpeed = 100;

//
    }
    class Car extends Vehicle{
        String trans;

        public Car( String trans) {
            this.trans = trans;
        }

//        public Car(String type, int maxSpeed) {
//            super(type, maxSpeed);
//        }
    }
}
