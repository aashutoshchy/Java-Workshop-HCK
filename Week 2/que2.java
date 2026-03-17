import java.util.Scanner;

public class que2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.print("Enter any number: ");
        num = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d X * %d = %d \n", num, i, num * i);
        }

        scanner.close();
    }
}
