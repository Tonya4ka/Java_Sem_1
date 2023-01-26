// Реализовать простой калькулятор Scanner sc = ... int a = sc.nextLine int b = sc.nextLine

import java.util.Scanner;

public class Ex_1_3 {

    static int iScannerInt() {
        Scanner iScanner = new Scanner(System.in);
        int num = iScanner.nextInt();
        return num;
    }

    static String iScannerOperations() {
            Scanner op = new Scanner(System.in);
            String operations = op.nextLine();
            return operations;
    }

    public static void main(String[] args) {
        System.out.printf("Enter the first number: ");
        int num1 = iScannerInt();
        System.out.printf("Enter the operator: ");
        String operations = iScannerOperations();
        System.out.printf("Enter the second number: ");
        int num2 = iScannerInt(); 
        int result = 0;
        switch (operations) {
            case "+":
                result = num1+num2;
                break;
            case "-":
                result = num1-num2;
                break;
            case "*":
                result = num1*num2;
                break;
            case "/":
                result = num1/num2;
                break;
            default:
                System.out.println("Wrong operation");
        }
        System.out.printf("Result: %s %s %s = %s", num1, operations, num2, result);
    }
}