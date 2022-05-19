package day3;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
while(true){
double dividend = sc.nextDouble();
double divider = sc.nextDouble();
double result = dividend / divider;

if(divider == 0){
    break;
}
    System.out.println(result);

}

}

}
