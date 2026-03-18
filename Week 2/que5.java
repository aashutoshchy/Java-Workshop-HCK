import java.util.Scanner;

public class que5 {
    public static void main(String[] args) {

        // Ask student if he/she has medical cause or not ( 'y or 'n' ). if (‘y’) print
        // you are not allowed to sit in the exam and if(‘n’’) print you can sit in the
        // exam.

        Scanner scanner = new Scanner(System.in);

        char isMedicalCause = 'N';

        System.out.print("Are you medical cause? (Y/N): ");
        isMedicalCause = scanner.next().charAt(0);

        System.out.println(isMedicalCause);

        if (isMedicalCause == 'Y') {
            System.out.println("You are not allowed to sit in the exam.");
        } else if (isMedicalCause == 'N') {
            System.out.println("You can sit in the exam.");
        } else {
            System.out.println("Enter correct value.");
        }

        scanner.close();

    }
}
