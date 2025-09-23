public class max_min_sameloop {
    public static void main(String[] args) {
        int[] arr = {3,7,2,5,3};

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++) {
            int x = arr[i];

            if(x > max) {
                max = x;
            }

            if(x < min){
                min = x;
            }
        }


    System.out.println("Maximum number is = " + max);
    System.out.println("Minimum number is = " + min);
    }
}