// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n) 
// тр 5 = 1+2+3+4+5 5! = 1*2*3*4*5

import java.util.Scanner;

public class Ex_1_1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Enter a number: ");
        int num = iScanner.nextInt();
        iScanner.close();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.printf("Sum is: %s ", sum);
    } 
}
