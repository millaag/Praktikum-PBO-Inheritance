/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author L0324020 - Milla Agustin
 */

class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle {
    Car(String brand) {
        super(brand);
    }

    @Override
    void start() {
        System.out.println(brand + " car starts with a key");
    }
}

class Motorcycle extends Vehicle {
    Motorcycle(String brand) {
        super(brand);
    }

    @Override
    void start() {
        System.out.println(brand + " motorcycle starts with a button");
    }
}

public class Latihan1Kendaraan {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car("Toyota"),
            new Motorcycle("Honda"),
            new Car("Suzuki")
        };

        for (Vehicle v : vehicles) {
            v.start();
        }
    }
}
