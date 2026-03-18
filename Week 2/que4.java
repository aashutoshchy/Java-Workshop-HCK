import java.util.Scanner;

public class que4 {
    public static void main(String[] args) {
        int age;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        if (age < 18) {
            System.out.println("You are Young.");
        } else {
            System.out.println("You are Adult.");
        }

        scanner.close();

    }
}
