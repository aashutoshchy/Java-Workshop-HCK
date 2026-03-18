import java.util.Scanner;

public class que11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 0;

        System.out.print("Enter any number: ");
        num = scanner.nextInt();

        int idx = 0, sum = 0;

        while (idx <= num) {
            if (idx % 2 == 0) {
                sum += idx;
            }
            idx++;
        }

        System.out.printf("Sum of first %d Even numbers is %d", num, sum);

        scanner.close();
    }
}
