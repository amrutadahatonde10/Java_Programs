// public class Lecture2 {
//     public static void main(String[] args) {
//          // Integer types
//         int age = 25;                   // age is usually whole numbers
//         long population = 7800000000L;  // world population can be very large

//         // Floating-point types
//         double pi = 3.14159265359;      // mathematical constant (more precision)

//         // Character
//         char grade = 'A';               // exam grade

//         // Boolean
//         boolean isMarried = false;      // true/false values
//         boolean isJavaFun = true;

//         // String (text)
//         String name = "Aman";           // person's name
//         String city = "New York";       // city name

//         // Array (collection of same type)
//         int[] marks = {97, 98, 95};     // student's marks



//          // Print all variables
//         System.out.println("Age: " + age);
//         System.out.println("Population: " + population);
//         System.out.println("Pi: " + pi);
//         System.out.println("Grade: " + grade);
//         System.out.println("Is Married? " + isMarried);
//         System.out.println("Is Java Fun? " + isJavaFun);
//         System.out.println("Name: " + name);
//         System.out.println("City: " + city);

//         System.out.print("Marks: ");
//         for(int i = 0; i < marks.length; i++) {
//             System.out.print(marks[i] + " ");
//         }
//     }
// }

// Try to declare meaningful variables of each type. Eg - a variable named age should be a numeric type (int or float) not byte.




// import java.util.Scanner;

// public class Lecture2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a radius of circle :");
//         double radius = sc.nextDouble();

//         double circumference = 2 * Math.PI * radius;
//         double  area = Math.PI * radius * radius;

//         System.out.println("Radius: " + radius);
//         System.out.println("Circumference: " + circumference);
//         System.out.println("Area: " + area);
//     }
// }

// Make a program that takes the radius of a circle as input, calculates its radius and area and prints it as output to the user.





import java.util.Scanner;

public class Lecture2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print its table: ");
        int num = sc.nextInt();

        System.out.println(num + " x 1 = " + (num * 1));
        System.out.println(num + " x 2 = " + (num * 2));
        System.out.println(num + " x 3 = " + (num * 3));
        System.out.println(num + " x 4 = " + (num * 4));
        System.out.println(num + " x 5 = " + (num * 5));
        System.out.println(num + " x 6 = " + (num * 6));
        System.out.println(num + " x 7 = " + (num * 7));
        System.out.println(num + " x 8 = " + (num * 8));
        System.out.println(num + " x 9 = " + (num * 9));
        System.out.println(num + " x 10 = " + (num * 10));
    }
}


// Make a program that prints the table of a number that is input by the user.