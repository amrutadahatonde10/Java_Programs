public class max_min_sameloop {
    public static void main(String[] args) {
        int arr[] = {2,4,1111,5,33,67,10,14};

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            int x = arr[i];
        

            if (x > max) {
                max = x;
            }

            if (x < min) {
               min = x;
            }
        }
        System.out.println("Maximum number is = " + max);
        System.out.println("Minimum number is = " + min);
        }
    }
