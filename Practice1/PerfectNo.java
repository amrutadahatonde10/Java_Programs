import java.util.Scanner;

public class PerfectNo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int sum = 0;

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if(sum == n) {
            System.out.println("perfect number");
        }
        else {
            System.out.println("not a perfect number");
        }
    }
}


// A perfect number is a positive integer that is equal to the sum of its proper divisors (excluding itself).
// 6 → divisors are 1, 2, 3 → 1 + 2 + 3 = 6
// 28 → divisors are 1, 2, 4, 7, 14 → 1 + 2 + 4 + 7 + 14 = 28