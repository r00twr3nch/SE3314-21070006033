package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for the MiddleEarthMap class.
 */
class MiddleEarthMapTest {

    @Test
    void testNavigateToMordorWithSecretPassage() {
        MiddleEarthMap map = new MiddleEarthMap();
        assertDoesNotThrow(() -> map.navigate("Mordor", true));
    }

    @Test
    void testNavigateToGondor() {
        MiddleEarthMap map = new MiddleEarthMap();
        assertDoesNotThrow(() -> map.navigate("Gondor", false));
    }

    @Test
    void testNavigateToUnknownLocation() {
        MiddleEarthMap map = new MiddleEarthMap();
        assertDoesNotThrow(() -> map.navigate("Unknown", false));
    }

    @Test
    void testNavigateToShireFallthrough() {
        MiddleEarthMap map = new MiddleEarthMap();
        assertDoesNotThrow(() -> map.navigate("Shire", false));
    }
}
