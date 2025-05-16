package org.example;

/**
 * Represents an economy car that can be rented.
 * The price is based on whether the car is hybrid or not.
 */
public class EconomyCar extends VehicleAbstract {

    /** The base price for renting an economy car. */
    private static final double BASE_PRICE = 50.0;

    /** The additional price for renting a hybrid economy car. */
    private static final double HYBRID_PRICE = 10.0;

    /** Indicates whether the economy car is a hybrid. */
    private boolean isHybrid;

    /**
     * Constructs an EconomyCar with the specified brand, model, license plate,
     * and hybrid status.
     *
     * @param brand the brand of the car
     * @param model the model of the car
     * @param licensePlate the license plate of the car
     * @param hybrid indicates if the car is hybrid
     */
    public EconomyCar(final String brand,
                      final String model,
                      final String licensePlate,
                      final boolean hybrid) {
        super(brand, model, licensePlate);
        this.isHybrid = hybrid;
    }

    /**
     * Calculates the price per day to rent the car.
     * If the car is hybrid, an additional fee is added.
     *
     * @return the price per day to rent the economy car
     */
    @Override
    public double calculatePricePerDay() {
        double price = BASE_PRICE;
        if (isHybrid) {
            price += HYBRID_PRICE;
        }
        return price;
    }

    /**
     * Returns whether the car is hybrid.
     *
     * @return true if the car is hybrid, false otherwise
     */
    public boolean isHybrid() {
        return isHybrid;
    }

    /**
     * Sets the hybrid status of the car.
     *
     * @param hybrid the new hybrid status
     */
    public void setHybrid(final boolean hybrid) {
        this.isHybrid = hybrid;
    }
}
