import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        boolean isPrime = true;

        if (n < 2) {
            System.out.println("not a prime number");
            return;
        }

        for(int i = 2; i <= n/2; i++){
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime) {
           System.out.println("prime number");
        } else {
            System.out.println("not a prime number");
        }
    }
}

// it's divisible by 1 and a number own itself.  
// prime no has only 2 divisors
// i.e = 7 so 7 is divisible by only 1 and 7 itself 
// 1 has only one divisor itself so its not prime number