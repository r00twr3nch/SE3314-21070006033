package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Test class for the {@link EconomyCar} class.
 * This class tests the methods and functionality of the EconomyCar class.
 */
public class EconomyCarTest {

    private EconomyCar car;

    /**
     * Sets up the test environment by creating a new instance of EconomyCar before each test.
     */
    @BeforeEach
    public void setUp() {
        // Initialize the EconomyCar object before each test
        car = new EconomyCar("Toyota", "Corolla", "ABC123", true);
    }

    /**
     * Test the {@link EconomyCar#getBrand()} method.
     * Verifies that the brand is correctly returned.
     */
    @Test
    public void testGetBrand() {
        // Test the getter for brand
        assertEquals("Toyota", car.getBrand(), "Brand should be Toyota");
    }

    /**
     * Test the {@link EconomyCar#calculatePricePerDay()} method for a non-hybrid car.
     * Verifies that the price per day is calculated correctly without a hybrid car.
     */
    @Test
    public void testCalculatePricePerDayWithoutHybrid() {
        // Test the calculatePricePerDay method without a hybrid car
        car = new EconomyCar("Toyota", "Corolla", "ABC123", false);
        double expectedPrice = 50.0;  // Base price of 50
        assertEquals(expectedPrice, car.calculatePricePerDay(), "Price per day should be 50.0 for a non-hybrid car");
    }

    /**
     * Test the {@link EconomyCar#getModel()} method.
     * Verifies that the model is correctly returned.
     */
    @Test
    public void testGetModel() {
        // Test the getter for model
        assertEquals("Corolla", car.getModel(), "Model should be Corolla");
    }

    /**
     * Test the {@link EconomyCar#getLicensePlate()} method.
     * Verifies that the license plate is correctly returned.
     */
    @Test
    public void testGetLicensePlate() {
        // Test the getter for license plate
        assertEquals("ABC123", car.getLicensePlate(), "License plate should be ABC123");
    }

    /**
     * Test the {@link EconomyCar#isHybrid()} method.
     * Verifies that the hybrid status is correctly returned.
     */
    @Test
    public void testIsHybrid() {
        // Test the getter for hybrid status
        assertTrue(car.isHybrid(), "The car should be hybrid.");
    }
}
