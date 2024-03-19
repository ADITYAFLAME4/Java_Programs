import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Creating a HashSet
        Set<String> set = new HashSet<>();

        // Adding elements to the set
        set.add("apple");
        set.add("banana");
        set.add("orange");

        // Adding a duplicate element (will not be added)
        boolean added = set.add("apple");
        System.out.println("Was 'apple' added again? " + added); // Output: false

        // Iterating over elements of the set
        System.out.println("Elements of the set:");
        for (String element : set) {
            System.out.println(element);
        }

        // Removing an element
        set.remove("banana");

        // Checking if a specific element is present
        boolean containsOrange = set.contains("orange");
        System.out.println("Does the set contain 'orange'? " + containsOrange); // Output: true
    }
}
