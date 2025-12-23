public class MaxMin {
    public static void main(String[] args) {
        int arr[] = {5,2,7,8,4,3,12,10,21,19};

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++){
            int x = arr[i];

            if(x > max){
                max = x;
            }
            
            if(x < min){
                min = x;
            }
        }
        System.out.println("Maximum number is :" + max);
        System.out.println("Minimum number is :" + min);
    }
}