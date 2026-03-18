import java.util.Scanner;

public class que12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 0;

        System.out.print("Enter any number: ");
        num = scanner.nextInt();

        int sum = 0;

        for (int i = 2; i <= num; i += 2) {
            sum += i;
        }

        System.out.printf("Sum of first %d Even numbers is %d", num, sum);

        scanner.close();
    }
}
