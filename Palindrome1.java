import java.util.Scanner;

class Palindrome1 {


// Function
    public static boolean palin(String ans) {
        int a = 0;
        int b = ans.length() - 1;

        while (a < b) {
            if (ans.charAt(a) != ans.charAt(b)) {
                return false;
            }
            a++;
            b--;
        }
        return true;
    }


// Main Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);     
        System.out.println("Enter input:");
        String ans = sc.nextLine();

        // If not using static word in function then we want to create object
        // Palindrome1 obj = new Palindrome1();

        // if (obj.palin(ans))

        if (palin(ans)) {
            System.out.println("It is Palindrome");
        } else {
            System.out.println("It is not Palindrome");
        }

    }
}
