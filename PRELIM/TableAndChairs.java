import java.util.Scanner;   
class TableChairs {
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static double divide(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Division by zero is not allowed.");
            return Double.NaN;
        }
        return (double) num1 / num2;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Interactive Java Calculator!");
        System.out.print("Enter 1st Number: ");
        int num1 = scnr.nextInt();

        System.out.print("Enter operation (+, *, /): ");
        scnr.nextLine(); 
        String operation = scnr.nextLine();

        System.out.print("Enter 2nd Number: ");
        int num2 = scnr.nextInt();

        switch (operation) {
            case "+":
                int resultAdd = add(num1, num2);
                System.out.println("Answer: " + resultAdd);
                break;
            case "*":
                int resultMultiply = multiply(num1, num2);
                System.out.println("Answer: " + resultMultiply);
                break;
            case "/":
                double resultDivide = divide(num1, num2);
                if (!Double.isNaN(resultDivide)) {
                    System.out.println("Answer: " + resultDivide);
                }
                break;
            default:
                System.out.println("Invalid operation.");
        }
    }
}