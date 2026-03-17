import java.util.Scanner;

public class que3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double mark;
        System.out.print("Enter your mark: ");
        mark = scanner.nextDouble();

        if (mark <= 100 && mark > 90) {
            System.out.println("You scored A+");
        } else if (mark <= 90 && mark > 80) {
            System.out.println("You scored A");
        } else if (mark <= 80 && mark > 70) {
            System.out.println("You scored B+");
        } else if (mark <= 70 && mark > 60) {
            System.out.println("You scored B");
        } else if (mark <= 60 && mark > 50) {
            System.out.println("You scored C+");
        } else if (mark <= 50 && mark > 40) {
            System.out.println("You scored C");
        } else {
            System.out.println("You failed.");
        }

        scanner.close();
    }
}
