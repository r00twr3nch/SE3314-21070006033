package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for the LuxuryCar class.
 */
public class LuxuryCarTest {

    private LuxuryCar car;

    /**
     * Sets up the test environment by initializing the LuxuryCar object.
     */
    @BeforeEach
    public void setUp() {
        car = new LuxuryCar("BMW", "X5", "XYZ987", true, true);
    }

    /**
     * Tests the calculatePricePerDay method for a luxury car with GPS and leather seats.
     */
    @Test
    public void testCalculatePricePerDayWithGpsAndLeatherSeats() {
        double expectedPrice = 150.0;  // Base price of 100 + 20 for GPS + 30 for leather seats
        assertEquals(expectedPrice, car.calculatePricePerDay(),
                "Price per day should be 150.0 for a luxury car with GPS and leather seats.");
    }

    /**
     * Tests the calculatePricePerDay method for a luxury car without GPS and leather seats.
     */
    @Test
    public void testCalculatePricePerDayWithoutGpsAndLeatherSeats() {
        car = new LuxuryCar("BMW", "X5", "XYZ987", false, false);
        double expectedPrice = 100.0;  // Only the base price
        assertEquals(expectedPrice, car.calculatePricePerDay(),
                "Price per day should be 100.0 for a luxury car without GPS and leather seats.");
    }
}
