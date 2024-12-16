package model.classes.factory;

import model.classes.properties.Property;
import model.classes.properties.PropertyColor;

import java.util.ArrayList;
import java.util.List;

public class PropertyFactory {
    private static final List<Property> propertiesList = new ArrayList<>();

    static {
        // LIME
        propertiesList.add(new Property(
                "Puppy Park", (short) 0, (short) 200,
                (short) 25, (short) 100, (short) 250,
                (short) 500, (short) 700, (short) 1000,
                PropertyColor.LIME
        ));
        propertiesList.add(new Property(
                "Kitty Condo", (short) 0, (short) 220,
                (short) 30, (short) 120, (short) 300,
                (short) 600, (short) 800, (short) 1100,
                PropertyColor.LIME
        ));
        propertiesList.add(new Property(
                "Bunny Borrow", (short) 0, (short) 240,
                (short) 35, (short) 140, (short) 350,
                (short) 700, (short) 900, (short) 1200,
                PropertyColor.LIME
        ));

        // BLUE
        propertiesList.add(new Property(
                "Puppy Mansion", (short) 0, (short) 350,
                (short) 50, (short) 200, (short) 500,
                (short) 1000, (short) 1300, (short) 1600,
                PropertyColor.BLUE
        ));
        propertiesList.add(new Property(
                "Exotic Bird Sanctuary", (short) 0, (short) 420,
                (short) 55, (short) 130, (short) 400,
                (short) 600, (short) 800, (short) 1005,
                PropertyColor.BLUE
        ));
        propertiesList.add(new Property(
                "Furry Friends Cafe", (short) 0, (short) 180,
                (short) 25, (short) 100, (short) 250,
                (short) 550, (short) 750, (short) 950,
                PropertyColor.BLUE
        ));

        // PURPLE
        propertiesList.add(new Property(
                "Rabbit Retreat", (short) 0, (short) 320,
                (short) 45, (short) 180, (short) 450,
                (short) 950, (short) 1200, (short) 1500,
                PropertyColor.PURPLE
        ));
        propertiesList.add(new Property(
                "Kitty Kingdom", (short) 0, (short) 350,
                (short) 50, (short) 200, (short) 500,
                (short) 1100, (short) 1400, (short) 1700,
                PropertyColor.PURPLE
        ));
        propertiesList.add(new Property(
                "Pet Boutique", (short) 0, (short) 220,
                (short) 30, (short) 120, (short) 300,
                (short) 600, (short) 800, (short) 1000,
                PropertyColor.PURPLE
        ));

        // RED
        propertiesList.add(new Property(
                "Hamster Hideaway", (short) 0, (short) 280,
                (short) 35, (short) 130, (short) 320,
                (short) 700, (short) 900, (short) 1100,
                PropertyColor.RED
        ));
        propertiesList.add(new Property(
                "Doggie Delights", (short) 0, (short) 270,
                (short) 35, (short) 140, (short) 350,
                (short) 750, (short) 950, (short) 1200,
                PropertyColor.RED
        ));
        propertiesList.add(new Property(
                "Feline Fortress", (short) 0, (short) 320,
                (short) 40, (short) 150, (short) 400,
                (short) 850, (short) 1050, (short) 1300,
                PropertyColor.RED
        ));

        // ORANGE
        propertiesList.add(new Property(
                "Snuggle Station", (short) 0, (short) 250,
                (short) 40, (short) 130, (short) 320,
                (short) 700, (short) 900, (short) 1100,
                PropertyColor.ORANGE
        ));
        propertiesList.add(new Property(
                "Cuddly Corner", (short) 0, (short) 240,
                (short) 35, (short) 125, (short) 315,
                (short) 675, (short) 875, (short) 1050,
                PropertyColor.ORANGE
        ));
        propertiesList.add(new Property(
                "Fluffy Field", (short) 0, (short) 260,
                (short) 40, (short) 140, (short) 350,
                (short) 700, (short) 900, (short) 1100,
                PropertyColor.ORANGE
        ));

        // YELLOW
        propertiesList.add(new Property(
                "Purrfect Place", (short) 0, (short) 380,
                (short) 50, (short) 190, (short) 450,
                (short) 900, (short) 1100, (short) 1300,
                PropertyColor.YELLOW
        ));
        propertiesList.add(new Property(
                "Kitty Cottage", (short) 0, (short) 400,
                (short) 55, (short) 200, (short) 500,
                (short) 950, (short) 1150, (short) 1350,
                PropertyColor.YELLOW
        ));
        propertiesList.add(new Property(
                "Tail Wag Terrace", (short) 0, (short) 380,
                (short) 50, (short) 190, (short) 450,
                (short) 900, (short) 1100, (short) 1300,
                PropertyColor.YELLOW
        ));

        // GREEN
        propertiesList.add(new Property(
                "Puppy Pad", (short) 0, (short) 350,
                (short) 45, (short) 180, (short) 450,
                (short) 850, (short) 1050, (short) 1250,
                PropertyColor.GREEN
        ));
        propertiesList.add(new Property(
                "Paws Palace", (short) 0, (short) 420,
                (short) 60, (short) 220, (short) 500,
                (short) 950, (short) 1150, (short) 1350,
                PropertyColor.YELLOW
        ));
        propertiesList.add(new Property(
                "Kitten Keep", (short) 0, (short) 390,
                (short) 55, (short) 210, (short) 500,
                (short) 950, (short) 1150, (short) 1350,
                PropertyColor.YELLOW
        ));
    }

    // Public static method to access the properties list
    public static List<Property> getPropertiesList() {
        return propertiesList;
    }

    // Method to get a property by index
    public static Property getPropertyByIndex(int index) {
        if (index >= 0 && index < propertiesList.size()) {
            return propertiesList.get(index);
        } else {
            return null; // Index out of bounds
        }
    }
}
