public class Max_Min {

    // // Finding Maximum element in array

    // public static void main(String[] args) {
    //     int[] arr = {3,1,9,7,4};

    //     int max = arr[0];

    //     for (int i = 0; i < arr.length; i++) {
    //         if (arr[i] > max) {
    //             max = arr[i];
    //         }
    //     }
    //     System.out.println("Largest element = " + max);
    // }


    // // Finding Smallest element in array

    public static void main(String[] args) {
         int[] arr = {2,1,11,8,5};

         int min = arr[0];

         for(int i = 0; i < arr.length ; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
         }
         System.out.println("smallest element = " + min);
    }
}
