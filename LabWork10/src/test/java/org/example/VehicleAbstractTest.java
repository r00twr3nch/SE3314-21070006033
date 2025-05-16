package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for the VehicleAbstract class.
 * Note: This is an abstract class, so tests should be done for concrete implementations like EconomyCar and LuxuryCar.
 */
public class VehicleAbstractTest {

    private VehicleAbstract vehicle;

    /**
     * Sets up the test environment by initializing a concrete subclass of VehicleAbstract.
     */
    @BeforeEach
    public void setUp() {
        vehicle = new EconomyCar("Toyota", "Corolla", "ABC123", true);
    }

    /**
     * Tests the getBrand method.
     */
    @Test
    public void testGetBrand() {
        assertEquals("Toyota", vehicle.getBrand(), "The brand should be Toyota.");
    }

    /**
     * Tests the getModel method.
     */
    @Test
    public void testGetModel() {
        assertEquals("Corolla", vehicle.getModel(), "The model should be Corolla.");
    }

    /**
     * Tests the getLicensePlate method.
     */
    @Test
    public void testGetLicensePlate() {
        assertEquals("ABC123", vehicle.getLicensePlate(), "The license plate should be ABC123.");
    }
}
