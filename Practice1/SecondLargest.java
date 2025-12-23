    public class SecondLargest {
        public static void main(String[] args) {
            int[] arr = {2,4,1,66,34,8,10,14};
   
            int first = Integer.MIN_VALUE;
            int second = Integer.MIN_VALUE;

            for (int i = 0; i < arr.length; i++) 
            {
                int x = arr[i];

                if(x > first) {
                    second = first;
                    first = x;
                } else if (x > second && x < first ) {
                    second = x;
                }
            }
            if (second == Integer.MIN_VALUE) {
            System.out.println("No second largest element found.");
            } else {
            System.out.println("Second largest element = " + second);
            }
        }
    }