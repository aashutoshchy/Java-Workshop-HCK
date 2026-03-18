import java.util.Scanner;

public class que13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 0;

        System.out.print("Enter any number: ");
        num = scanner.nextInt();

        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact *= i;
        }

        System.out.printf("Factorial of first %d is %d", num, fact);

        scanner.close();
    }
}
