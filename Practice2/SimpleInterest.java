
import java.util.Scanner;

public class SimpleInterest{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Principal:");
        double P = sc.nextDouble();

        System.out.println("Enter Rate:");
        double R = sc.nextDouble();

        System.out.println("Enter no. of years:");
        double N = sc.nextDouble();

        double SI = (P*R*N)/100;

        System.out.println("Simple Interest is : " + SI);
    }
}