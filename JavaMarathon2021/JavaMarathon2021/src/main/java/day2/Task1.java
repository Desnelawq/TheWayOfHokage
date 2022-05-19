package day2;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.println("Узнай насколько большой твой дом. Введи любое положительное число!");
        int num = sc.nextInt();

        if(num > 0 & num <=4) {
            System.out.println("Малоэтажный дом");
        }
        else if(num <= 5 & num > 0){
            System.out.println("Среднеэтажный дом");
        }
        else if(num >= 9){
            System.out.println("Многоэтажный дом");
        }
        else if(num <= 0){
            System.out.println("Ошибка ввода");
        }

    }
}