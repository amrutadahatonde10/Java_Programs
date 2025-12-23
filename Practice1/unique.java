public class unique {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,1,1,2};

        boolean isunique = true;

        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    isunique = false;
                    break;
                }
            }
        }
        if(isunique){
            System.out.println("Array is unique");
        } else {
            System.out.println("Array is not unique");
        }
    }
}

// check array is unique elements or not.