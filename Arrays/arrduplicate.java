public class arrduplicate {
    public static void main(String[] args) {
        int[] arr = {5,3,5,2,1,8,6,7,3};

        boolean arrduplicate = false;

        for(int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    arrduplicate = true;
                    break;
                }
            }
        }
        if(arrduplicate){
            System.out.println("Array is found duplicates");
        } else {
            System.out.println("Array is not found duplicates");
        }
    }
}

// Array found duplicates






// public class arrduplicate {
//     public static void main(String[] args) {
//         int[] arr = {5, 4, 2, 5, 62, 4, 1, 4, 2, 3};

//         System.out.print("Duplicate elements are: ");
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[i] == arr[j]) {
//                     System.out.print(arr[i] + " ");
//                 }
//             }
//         }
//     }
// }

// Find the duplicate number in an array. 