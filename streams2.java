import java.util.Arrays;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        // Create a list of names
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");


        // Example 2: Using streams to map names to uppercase and print them
        System.out.println("\nExample 2: Names in uppercase:");
        names.stream()
             .map(String::toUpperCase)
             .forEach(System.out::println);


    }
}
