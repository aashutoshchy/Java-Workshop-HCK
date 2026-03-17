import java.util.Scanner;

public class que1 {
    public static void main(String[] args) {
        // Taking length and breadth of a rectangle from user and check if it is square
        // or not.
        Scanner scanner = new Scanner(System.in);

        double length, breadth;

        System.out.print("Enter length: ");
        length = scanner.nextDouble();

        System.out.print("Enter breadth: ");
        breadth = scanner.nextDouble();

        if (length == breadth) {
            System.out.println("It is square.");
        } else {
            System.out.println("It is not square.");
        }
        scanner.close();
    }
}
