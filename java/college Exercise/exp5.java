import java.util.Scanner;

class NumberProcessor {
    public static int findLargestNumber(int[] numbers) {
        int largest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static int findSmallestNumber(int[] numbers) {
        int smallest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        return smallest;
    }
}

public class exp5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int largestNumber = NumberProcessor.findLargestNumber(numbers);
        int smallestNumber = NumberProcessor.findSmallestNumber(numbers);

        System.out.println("Largest number: " + largestNumber);
        System.out.println("Smallest number: " + smallestNumber);

        scanner.close();
    }
}
