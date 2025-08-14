
import java.util.Scanner;

class Sad {
    public boolean Palin(String Siddhi) {
        int a = 0;
        int b = Siddhi.length() - 1;

        while (a < b) {
            if (Siddhi.charAt(a) != Siddhi.charAt(b)) {
                return false;
            }
            a++;
            b--;
        }
        return true;
    }
}
class Palindrome {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Input:");
        String Sid = sc.nextLine();

        Sad obj1 = new Sad();

        if (obj1.Palin(Sid)) {
            System.out.println("palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

    }
}
