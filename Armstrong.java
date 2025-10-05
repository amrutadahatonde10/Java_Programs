import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num,temp,rem,sum=0;

        System.out.println("Enter a number");
        num = sc.nextInt();

        temp = num;

        while (num > 0) { 
            rem = num % 10;
            sum = sum + (rem*rem*rem); 
            num = num/10;
        }

        if(temp == sum){
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not Armstrong number");
        }
    }
}




//An Armstrong number is a number that is equal to the sum of the cubes (or powers) of its digits.
//1³ + 5³ + 3³ = 1 + 125 + 27 = 153 ✅armstrong number