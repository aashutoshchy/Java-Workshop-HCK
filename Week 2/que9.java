import java.util.Scanner;

public class que9 {
    public static void main(String[] args) {
        // Write a program to check whether the number is odd or even using switch
        // statement.

        Scanner scanner = new Scanner(System.in);

        int num, isEven = 1;

        System.out.print("Enter a number: ");
        num = scanner.nextInt();

        if (num % 2 == 0) {
            isEven = 1;
        } else {
            isEven = 0;
        }

        switch (isEven) {
            case 0:
                System.out.printf("%d is Odd.", num);
                break;

            case 1:
                System.out.printf("%d is Even.", num);
                break;

            default:
                break;
        }

        scanner.close();
    }
}
