import java.util.Arrays;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        // Create a list of names
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");

        // Example 1: Using streams to filter names starting with 'A' and print them
        System.out.println("Example 1: Names starting with 'A':");
        names.stream()
             .filter(name -> name.startsWith("A"))
             .forEach(System.out::println);
 
}