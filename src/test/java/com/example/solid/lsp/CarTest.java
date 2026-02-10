package com.example.solid.lsp;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    void gasCarShouldDriveAndRefuel() {
        Drivable car = new GasCar();

        assertDoesNotThrow(car::drive);
    }

    @Test
    void electricCarShouldDrive() {
        Drivable car = new ElectricCar();

        assertDoesNotThrow(car::drive);
    }
}
