package org.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Represents a rental record for a specific vehicle.
 */
public class RentalRecord {
    /** The rented vehicle. */
    private final VehicleAbstract vehicle;

    /** The name of the person renting the vehicle. */
    private final String renterName;

    /** The rental start date. */
    private final LocalDate startDate;

    /** The rental end date. */
    private final LocalDate endDate;

    /**
     * Constructs a rental record with vehicle, renter, and date range.
     *
     * @param rentedVehicle  the vehicle being rented
     * @param nameOfRenter   name of the renter
     * @param rentalStart    the start date of rental
     * @param rentalEnd      the end date of rental
     */
    public RentalRecord(final VehicleAbstract rentedVehicle,
                        final String nameOfRenter,
                        final LocalDate rentalStart,
                        final LocalDate rentalEnd) {
        this.vehicle = rentedVehicle;
        this.renterName = nameOfRenter;
        this.startDate = rentalStart;
        this.endDate = rentalEnd;
    }

    /**
     * Calculates the total rental price based on days.
     *
     * @return total price for the rental duration
     */
    public double getTotalPrice() {
        long days = ChronoUnit.DAYS.between(startDate, endDate);
        return days * vehicle.calculatePricePerDay();
    }
}
