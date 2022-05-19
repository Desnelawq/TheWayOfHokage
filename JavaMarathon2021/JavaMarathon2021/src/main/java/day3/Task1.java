package day3;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

while (true){
    String city = sc.nextLine();

    if(city.equals("stop"))
        break;

        switch (city){
            case "Moscow":
            case "Vladivostok":
                case "Rostov":
                    System.out.println("Russia");
                    break;
            case "Milan":
            case "Rome":
            case "Turin":
                System.out.println("Italy");
                break;
            case "Liverpool":
            case "Manchester":
            case "London":
                System.out.println("England");
                break;
            case "Berlin":
            case "Munchen":
            case "Koln":
                System.out.println("Germany");
                break;
                default:
                System.out.println("Unknown country");
 String stop = "stop";

 }
        }

    }
}
