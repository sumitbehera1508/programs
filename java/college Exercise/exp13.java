import java.util.Arrays;

class FindLargestNumberThread extends Thread {
    private int[] numbers;
    private int largest;

    public FindLargestNumberThread(int[] numbers) {
        this.numbers = numbers;
        this.largest = Integer.MIN_VALUE;
    }

    public int getLargestNumber() {
        return largest;
    }

    @Override
    public void run() {
        for (int number : numbers) {
            if (number > largest) {
                largest = number;
            }
        }
    }
}

class CalculateSumThread extends Thread {
    private int[] numbers;
    private int sum;

    public CalculateSumThread(int[] numbers) {
        this.numbers = numbers;
        this.sum = 0;
    }

    public int getSum() {
        return sum;
    }

    @Override
    public void run() {
        for (int number : numbers) {
            sum += number;
        }
    }
}

public class exp13 {
    public static void main(String[] args) throws InterruptedException {
        int[] numbers = { 10, 5, 7, 15, 20, 12 };

        FindLargestNumberThread findLargestThread = new FindLargestNumberThread(numbers);
        CalculateSumThread calculateSumThread = new CalculateSumThread(numbers);

        findLargestThread.start();
        calculateSumThread.start();

        findLargestThread.join();
        calculateSumThread.join();

        int largestNumber = findLargestThread.getLargestNumber();
        int sum = calculateSumThread.getSum();

        System.out.println("Largest number: " + largestNumber);
        System.out.println("Sum of numbers: " + sum);
    }
}
