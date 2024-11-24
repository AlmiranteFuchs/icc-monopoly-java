package model.utils;

import java.util.Optional;

public class ValidationHelper {

    // Private constructor, this cannot be instantiated.
    private ValidationHelper() {
        throw new UnsupportedOperationException("This class cannot be instantiated.");
    }

    public static void assertNotEmpty(String value, Optional<String> message) {
        if (value == null || value.trim().isEmpty()) {
            throw new IllegalArgumentException(message.orElse("Value cannot be empty or null."));
        }
    }

    public static void assertPositive(double value, Optional<String> message) {
        if (value <= 0) {
            throw new IllegalArgumentException(message.orElse("Value must be positive."));
        }
    }

    public static void assertInRange(double value, double min, double max, Optional<String> message) {
        if (value < min || value > max) {
            throw new IllegalArgumentException(message.orElse("Value must be between " + min + " and " + max + "."));
        }
    }

    public static void assertEqual(Object actual, Object expected, Optional<String> message) {
        if (!actual.equals(expected)) {
            throw new IllegalArgumentException(message.orElse("Values are not equal."));
        }
    }

    public static void assertNotNull(Object value, Optional<String> message) {
        if (value == null) {
            throw new IllegalArgumentException(message.orElse("Value cannot be null."));
        }
    }
}
