import java.util.Scanner;

public class exp14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your favorite color: ");
        String favoriteColor = scanner.next();

        System.out.println(" the information :");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Favorite Color: " + favoriteColor);

        scanner.close();
    }
}
