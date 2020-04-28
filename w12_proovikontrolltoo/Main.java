import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Main
 */

public class Main {
    public static void main(String[] args) {
        
        List<String> strings = Arrays.asList("one", "two", "three");
        List<Integer> integers = Arrays.asList(1, 2, 3);
        List<Character> characters = Arrays.asList('a', 'b', 'c');
        List<Double> doubles = Arrays.asList(1.0, 2.0, 3.0);
        List<String> strings2 = new ArrayList<>();

        System.out.println(
            Generics.getFirst(strings) + " " +
            Generics.getFirst(integers) + " " + 
            Generics.getFirst(characters) + " " + 
            Generics.getFirst(doubles) + " " +
            Generics.getFirst(strings2)
        );

        SimplePair<String, String> pair = new SimplePair<>("name", "Raimo");
        
        System.out.println(
            pair.getKey() + " " + 
            pair.getValue()
        );

        SimplePair<String, SimplePair<String, String>> pair2 = new SimplePair<>("data", new SimplePair<>("info", "Raimo"));
        // SimplePair<String, SimplePair<String, SimplePair<String, String>>> pair3 = new SimplePair<>("data", new SimplePair<>("info", new SimplePair<>("info2", "Raimo" )));

        System.out.println(
            pair2.getKey() + " \n\t" + 
            pair2.getValue().getKey() + ": " + pair2.getValue().getValue()
        );

        Car car = new Car();
        Vehicle car2 = new Car();
        Vehicle vehicle = new Vehicle();
        //Motorbike motorbike = new Motorbike();

        System.out.println(
            Generics.getWheels(car) + " " +
            Generics.getWheels(car2) + " " +
            Generics.getWheels(vehicle)
        );

        // Generics.getType

        Map<String, String> map = new HashMap<>();

        System.out.println(
            Generics.getType(1) + " " +
            Generics.getType("Raimo") + " " + 
            Generics.getType(1.0) + " " + 
            Generics.getType((byte) 5) + " " +
            Generics.getType((long) 5) + " " +
            Generics.getType(map) + " " +
            Generics.getType(pair2) + " " +
            Generics.getType(strings)
        );

    }
}