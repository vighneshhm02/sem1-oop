package demo;

import demo.Car;
import demo.Motorcycle;
import demo.Vehicle;

interface Vehicle {
 void drive();
}

class Car implements Vehicle {
 @Override
 public void drive() {
     System.out.println("Car Drive: Smooth and comfortable.");
 }
}

class Motorcycle implements Vehicle {
 @Override
 public void drive() {
     System.out.println("Motorcycle Drive: Fast and agile.");
 }
}

public class PolymorphismDemo {
 public static void main(String[] args) {
     Vehicle car = new Car();
     Vehicle motorcycle = new Motorcycle();

     car.drive();
     motorcycle.drive();
 }
}
