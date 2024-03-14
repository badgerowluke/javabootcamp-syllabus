import java.util.Arrays;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        // Create a list of names
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");

        // Example 3: Using streams to count the number of names containing 'e'
        long count = names.stream()
                         .filter(name -> name.contains("e"))
                         .count();
        System.out.println("\nExample 3: Number of names containing 'e': " + count);
    }
}
