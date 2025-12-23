public class Swap {
    public static void main(String[] args) {
        
        int a = 2;
        int b = 5;

        System.out.println("Before swapping a = " + a);
        System.out.println("Before Swapping b = " + b);

        a = a + b;  // a = 2 + 5 = 7 => a=7
        b = a - b;  // b = 7 - 5 = 2 => b=2
        a = a - b;  // a = 7 - 2 = 5 => a=5

        System.out.println("After Swapping a = " + a);
        System.out.println("After Swapping b = " + b);
    }
}