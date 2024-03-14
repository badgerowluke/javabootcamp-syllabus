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

        // Example 3: Using a lambda expression to calculate the sum of all numbers in the list
        int sum = numbers.stream()
                         .reduce(0, (subtotal, number) -> subtotal + number);
        System.out.println("\nExample 3: Sum of all numbers in the list: " + sum);
    }
}