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

        // Example 1: Using a lambda expression to iterate and print each element of the list
        System.out.println("Example 1: Printing all numbers in the list:");
        numbers.forEach(number -> System.out.println(number));

        // Example 2: Using a lambda expression to filter even numbers and print them
        System.out.println("\nExample 2: Printing even numbers in the list:");
        numbers.stream()
               .filter(number -> number % 2 == 0)
               .forEach(number -> System.out.println(number));

        // Example 3: Using a lambda expression to calculate the sum of all numbers in the list
        int sum = numbers.stream()
                         .reduce(0, (subtotal, number) -> subtotal + number);
        System.out.println("\nExample 3: Sum of all numbers in the list: " + sum);
    }
}
