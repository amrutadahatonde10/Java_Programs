
// import java.util.Scanner;

// public class Practice{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("Enter the number of elements: ");
//         int size = sc.nextInt();

//         int numbers[] = new int[size];

//         System.out.println("Enter " + size + " numbers:");
//         for(int i=0; i<size; i++) {
//             numbers[i] = sc.nextInt();
//         }

//         System.out.println("You entered:");
//         for(int i=0; i<size; i++) {
//             System.out.println(numbers[i]);
//         }
//         sc.close();
//     }
// }
// // Write a program to take 'n' inputs from the user and print them using a for loop.




// import java.util.Scanner;

// public class Practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the number of elements: ");
//         int size = sc.nextInt();

//         int numbers[] = new int[size]; 

//         System.out.println("Enter " + size + " Numbers:");
//         for(int i=0; i<size; i++) {
//             numbers[i] = sc.nextInt();
//         }

//         int sum = 0;
//         for(int i=0; i<size; i++) {
//             sum += numbers[i];
//         } 

//         System.out.println("Sum of array element is :" + sum);
//     }
// }
// // Write a program to find the sum of all elements in an array.





// import java.util.Scanner;

// public class Practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the number of elements: ");
//         int size = sc.nextInt();

//         int numbers[] = new int[size];

//         System.out.println("Enter " + size + " Numbers:");
//         for(int i=0; i<size; i++){
//             numbers[i] = sc.nextInt();
//         }

//         int max = numbers[0];
//         for(int i=0; i<size; i++) {
//             if (numbers[i] > max) {
//                 max = numbers[i];
//             }
//         }
//         System.out.println("Maximum number is: " + max);
//     }
// }

// // Write a program to find the largest number in a given array.





// import java.util.Scanner;

// public class Practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the number of elements: ");
//         int size = sc.nextInt();

//         int numbers[] = new int[size];

//         System.out.println("Enter " + size + " Numbers:");
//         for(int i=0; i<size; i++){
//             numbers[i] = sc.nextInt();
//         }

//         int min = numbers[0];
//         for(int i=0; i<size; i++) {
//             if (numbers[i] < min) {
//                 min = numbers[i];
//             }
//         }
//         System.out.println("Minimum number is: " + min);
//     }
// }

// // Write a program to find the smallest number in a given array.




// import java.util.Scanner;

// public class Practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the number of elements: ");
//         int n = sc.nextInt();

//         int num[] = new int[n];

//         System.out.println("Enter " + n + " numbers:");
//         for(int i=0; i<n; i++) {
//             num[i] = sc.nextInt();
//         }

//         int evencnt = 0;
//         int oddcnt = 0;

//         for(int i=0; i<n; i++) {
//            if (num[i] % 2 == 0 ) {
//                 evencnt++;
//             } else {
//                 oddcnt++;
//             }
//         }

//         System.out.println("Total even numbers: " + evencnt);
//         System.out.println("Total odd numbers: " + oddcnt);

//     }
// }

// // //Write a program to count how many even and how many odd numbers are in the array.




// import java.util.Scanner;

// public class Practice {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the number of elements: ");
//         int n = sc.nextInt();

//         int num[] = new int[n];

//         System.out.println("Enter " + n + " Numbers");
//         for(int i=0; i<n; i++) {
//             num[i] = sc.nextInt();
//         }

//         System.out.println("Arrays in reverse order:");
//         for(int i=n-1; i >= 0; i--) {
//             System.out.print(num[i] + " ");
//         }

//     }
// }

// // Write a program to print the array elements in reverse order.




// import java.util.Scanner;

// public class Practice {
//     public static void main (String args[]) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the number of elements: ");
//         int n = sc.nextInt();

//         if (n < 2) {
//             System.out.println("Array must have at least 2 elements.");
//             return;
//         }

//         int[] arr = new int[n];


//         System.out.println("Enter " + n + " numbers:");
//         for(int i=0; i<n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         int max = Integer.MIN_VALUE;
//         int secondMax = Integer.MIN_VALUE;

//         for(int i=0; i<n; i++) {
//             if(arr[i] > max) {
//                 secondMax = max;
//                 max = arr[i];
//             } else if (arr[i] > secondMax && arr[i] != max) {
//                 secondMax = arr[i];
//             }
//         }

//         if (secondMax == Integer.MIN_VALUE) {
//             System.out.println("NO second largest number (all elements might be equal).");
//         } else {
//             System.out.println("Second largest number is: " + secondMax);
//         }

//     }
// }

// // Write a program to find the second largest number in the array.



// // String Builder
// import java.util.*;

// public class Practice { 
// public static void main(String args[]) {
//     StringBuilder sb = new StringBuilder("hello");

//     for(int i=0; i<sb.length()/2; i++) {
//         int front = i;
//         int back = sb.length() -1 - i; // 5-1-0 = 4

//         char frontChar = sb.charAt(front);
//         char backChar = sb.charAt(back);

//         sb.setCharAt(front, backChar);
//         sb.setCharAt(back, frontChar);
//     }

//     System.out.println(sb);
// }
// }

// //Reverse String program


