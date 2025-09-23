public class isarraysorted {
    public static void main(String[] args) {
        int[] arr = {1,2,3,9,5};

        boolean sorted = true;

        for(int i = 0; i < arr.length-1; i++) {
            int x = arr[i];

            if(arr[i] > arr[i+1]){
                sorted = false;
                break;
            }
        }
        if(sorted){
            System.out.println("Array is Sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }
}

// check if array is sorted or not