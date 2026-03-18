import java.util.Scanner;

public class que7 {
    public static void main(String[] args) {
        // Write a program to check the number is odd or even, if the number is even,
        // check whether it is divisible by 4, and if the number is odd,check whether it
        // is divisible by 7 or not using user input.

        Scanner scanner = new Scanner(System.in);

        int num;

        System.out.print("Enter a number: ");
        num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.printf("%d is Even.", num);
            if (num % 4 == 0) {
                System.out.println("It is also divisible by 4.");
            } else {
                System.out.println("It is not divisible by 4.");
            }
        } else {
            System.out.printf("%d is Odd.", num);
            if (num % 7 == 0) {
                System.out.println("It is also divisible by 7.");
            } else {
                System.out.println("It is not divisible by 7.");
            }
        }

        scanner.close();
    }
}
