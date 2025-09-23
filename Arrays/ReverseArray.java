public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};

        int[] reversed = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            reversed[arr.length - 1 - i] = arr[i];
        }

        System.out.print("Reversed Array is: ");
        for(int num : reversed) {
            System.out.print(num + " ");
        }
    }
}          