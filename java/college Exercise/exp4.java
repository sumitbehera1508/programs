import java.util.Scanner;

class NumberProcessor {
    public static int findSumOfEvens(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                sum += number;
            }
        }
        return sum;
    }

    public static int findSumOfOdds(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            if (number % 2 != 0) {
                sum += number;
            }
        }
        return sum;
    }
}

public class exp4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int sumOfEvens = NumberProcessor.findSumOfEvens(numbers);
        int sumOfOdds = NumberProcessor.findSumOfOdds(numbers);

        System.out.println("Sum of even numbers: " + sumOfEvens);
        System.out.println("Sum of odd numbers: " + sumOfOdds);

        scanner.close();
    }
}
