package org.example;

/**
 * Represents a luxury car with optional GPS and leather seats.
 */
public class LuxuryCar extends VehicleAbstract {
    /** Base daily rental price for a luxury car. */
    private static final double BASE_PRICE = 100.0;

    /** Additional daily price for GPS feature. */
    private static final double GPS_PRICE = 20.0;

    /** Additional daily price for leather seats. */
    private static final double LEATHER_PRICE = 30.0;

    /** Indicates if the car has GPS. */
    private final boolean hasGps;

    /** Indicates if the car has leather seats. */
    private final boolean hasLeatherSeats;

    /**
     * Constructs a LuxuryCar with specific features.
     *
     * @param brand the car brand
     * @param model the car model
     * @param licensePlate the license plate
     * @param gpsEnabled true if GPS is included
     * @param leatherEnabled true if leather seats are included
     */
    public LuxuryCar(
            final String brand,
            final String model,
            final String licensePlate,
            final boolean gpsEnabled,
            final boolean leatherEnabled) {
        super(brand, model, licensePlate);
        this.hasGps = gpsEnabled;
        this.hasLeatherSeats = leatherEnabled;
    }

    /**
     * Calculates the daily rental price.
     *
     * @return total price per day based on selected features
     */
    @Override
    public double calculatePricePerDay() {
        double price = BASE_PRICE;
        if (hasGps) {
            price += GPS_PRICE;
        }
        if (hasLeatherSeats) {
            price += LEATHER_PRICE;
        }
        return price;
    }
}
