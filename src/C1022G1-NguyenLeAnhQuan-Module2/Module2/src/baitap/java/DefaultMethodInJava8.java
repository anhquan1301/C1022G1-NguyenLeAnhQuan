//package baitap.java;
//
//public class DefaultMethodInJava8 {
//    public static void main(String[] args) {
//        Vehicle car = new baitap.DesignPattern.Car();
//        car.start(); // Kết quả: "Car starting"
//        car.honk(); // Kết quả: "Vehicle honking"
//
//        Vehicle bike = new Bike();
//        bike.start(); // Kết quả: "Bike starting"
//        bike.honk(); // Kết quả: "Bike honking"
//    }
//}
//interface Vehicle {
//    void start();
//    default void honk() {
//        System.out.println("car");
//    }
//}
////interface Speed {
////    default void honk() {
////        System.out.println("Speed");
////    }
////}
//class Car implements Vehicle {
//
//    @Override
//    public void start() {
//        System.out.println("car");
//    }
//
//}
//
//class Bike implements Vehicle {
//
//    @Override
//    public void start() {
//        System.out.println("Bike");
//    }
//
//    @Override
//    public void honk() {
//        System.out.println("Bike honking");
//    }
//}
