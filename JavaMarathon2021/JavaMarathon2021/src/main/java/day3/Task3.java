package day3;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int value = 1;
        while(value < 6){
            double dividend = scan.nextDouble();
            double divider = scan.nextDouble();
            double result = dividend / divider;
value++;
            System.out.println(result);
            if (divider == 0) {
                System.out.println("Деление на 0");
                continue;
            }
        }
    }
}
