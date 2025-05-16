package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for the RentalRecord class.
 */
public class RentalRecordTest {

    private RentalRecord rentalRecord;

    /**
     * Sets up the test environment by initializing the RentalRecord object.
     */
    @BeforeEach
    public void setUp() {
        VehicleAbstract vehicle = new EconomyCar("Toyota", "Corolla", "ABC123", true);
        rentalRecord = new RentalRecord(vehicle, "John Doe", LocalDate.of(2025, 5, 1), LocalDate.of(2025, 5, 5));
    }

    /**
     * Tests the getTotalPrice method of RentalRecord for a 4-day rental.
     */
    @Test
    public void testGetTotalPrice() {
        double expectedTotalPrice = 240.0;  // 4 days * 60.0 per day for a hybrid car
        assertEquals(expectedTotalPrice, rentalRecord.getTotalPrice(),
                "Total price should be 240.0 for a 4-day rental.");
    }
}
