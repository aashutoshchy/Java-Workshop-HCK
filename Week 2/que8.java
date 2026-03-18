import java.util.Scanner;

public class que8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double physics, chemistry, biology, math, computer;
        double percentage;

        System.out.println("Enter the marks in Physics: ");
        physics = scanner.nextDouble();

        System.out.println("Enter the marks in Chemistry: ");
        chemistry = scanner.nextDouble();

        System.out.println("Enter the marks in Biology: ");
        biology = scanner.nextDouble();

        System.out.println("Enter the marks in Math: ");
        math = scanner.nextDouble();

        System.out.println("Enter the marks in Computer: ");
        computer = scanner.nextDouble();

        percentage = ((physics + chemistry + biology + math + computer) / 500) * 100;
        System.out.printf("Your total percentage is %.2f", percentage);

        scanner.close();
    }
}
