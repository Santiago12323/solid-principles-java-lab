package com.example.solid.lsp;

public class GasCar implements Drivable, FuelCar {
    public void drive() {
        System.out.println("Conduciendo coche a gasolina...");
    }

    public void refuel() {
        System.out.println("Repostando gasolina...");
    }
}
