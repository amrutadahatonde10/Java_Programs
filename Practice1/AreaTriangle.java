
import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter base:");
        double b = sc.nextDouble();

        System.out.println("Enter height:");
        double h = sc.nextDouble();

        double Area = b * h /2;

        System.out.println("Area of Triangle is: " + Area);
    }
}