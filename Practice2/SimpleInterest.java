import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Principal: ");
        double P = sc.nextInt();

        System.out.println("Enter Rate: ");
        double R = sc.nextInt();

        System.out.println("Enter Number of Years: ");
        double N = sc.nextInt();

        double SI = (P*R*N) / 100;

        System.out.println("The simple Interset is: " + SI);

    }
}