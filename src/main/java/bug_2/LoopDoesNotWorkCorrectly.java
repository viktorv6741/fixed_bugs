package bug_2;

import java.util.Scanner;

public class LoopDoesNotWorkCorrectly {
//expected behaviour -> should finish work when user's answer on question "Do you want to continue?" is N
// looking for 33 line


    // Using loop with precondition is inappropriate.

    public static void main(String[] args) {
        boolean status = true;
        while (status) {
            Scanner minScanner1 = new Scanner(System.in);
            Scanner scanner = new Scanner(System.in);

            System.out.println("input first number please ");
            double v1 = minScanner1.nextDouble();
            System.out.println("input second number please: ");
            double v2 = minScanner1.nextDouble();

            double result = 0;
            System.out.println("input operation: + - / * ");
            String operation = scanner.nextLine();
            if (operation.equalsIgnoreCase("+")) {
                result = v1 + v2;
            } else if (operation.equalsIgnoreCase("-")) {
                result = v1 - v2;
            } else if (operation.equalsIgnoreCase("*")) {
                result = v1 * v2;
            } else if (operation.equalsIgnoreCase("/")) {
                result = v1 / v2;
            }
            System.out.printf("= %.2f\n ", result);
            System.out.println("Do you want to continue: \n");
            String isContinueRequired = scanner.nextLine();
            if (isContinueRequired.equalsIgnoreCase("N")) status = false;
            else if (isContinueRequired.equalsIgnoreCase("Y")) status = true;

        }
    }
}
