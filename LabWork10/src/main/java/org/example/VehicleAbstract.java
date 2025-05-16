package org.example;

/**
 * Abstract base class representing a vehicle with common attributes.
 */
public abstract class VehicleAbstract {
    /** The brand of the vehicle. */
    private final String brand;

    /** The model of the vehicle. */
    private final String model;

    /** The license plate number of the vehicle. */
    private final String licensePlate;

    /**
     * Constructs a vehicle with brand, model, and license plate.
     *
     * @param vehicleBrand       the brand of the vehicle
     * @param vehicleModel       the model of the vehicle
     * @param vehicleLicensePlate the license plate number
     */
    public VehicleAbstract(final String vehicleBrand,
                           final String vehicleModel,
                           final String vehicleLicensePlate) {
        this.brand = vehicleBrand;
        this.model = vehicleModel;
        this.licensePlate = vehicleLicensePlate;
    }

    /**
     * Gets the brand of the vehicle.
     *
     * @return vehicle brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Gets the model of the vehicle.
     *
     * @return vehicle model
     */
    public String getModel() {
        return model;
    }

    /**
     * Gets the license plate number.
     *
     * @return license plate
     */
    public String getLicensePlate() {
        return licensePlate;
    }

    /**
     * Calculates and returns the rental price per day.
     *
     * @return price per day for the vehicle
     */
    public abstract double calculatePricePerDay();
}
