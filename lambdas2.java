import java.util.ArrayList;
import java.util.List;

public class LambdaExample {
    public static void main(String[] args) {
        // Create a list of numbers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Example 2: Using a lambda expression to filter even numbers and print them
        System.out.println("\nExample 2: Printing even numbers in the list:");
        numbers.stream()
               .filter(number -> number % 2 == 0)
               .forEach(number -> System.out.println(number));

    }
}