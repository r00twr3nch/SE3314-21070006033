package org.example;

/**
 * Represents the Middle-Earth map for navigation.
 */
public class MiddleEarthMap {

    /**
     * Navigates to a location with an option for secret passage.
     * @param location The destination.
     * @param isSecretPassage Whether a secret passage is used.
     */
    public void navigate(String location, boolean isSecretPassage) {
        switch (location) {
            case "Mordor":
                System.out.println("Navigating to Mordor");
                if (isSecretPassage) {
                    System.out.println("Taking a secret passage");
                }
                break;
            case "Shire":
                System.out.println("Navigating to the Shire");
                break; // Fixed: fall-through
            case "Gondor":
                System.out.println("Navigating to Gondor");
                break;
            case "Lothlórien":
                System.out.println("Navigating to Lothlórien");
                break;
            default:
                System.out.println("Unknown location");
        }

        String result = isSecretPassage ? "Secret" : "Normal";
        System.out.println(result);
    }
}
