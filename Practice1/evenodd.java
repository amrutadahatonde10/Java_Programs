// Find the largest even number and smallest odd number in an array.

public class evenodd {
    public static void main(String[] args) {
        int[] arr = {2,4,9,8,1,5,6};
 
        int largesteven = Integer.MIN_VALUE;
        int smallestodd = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){
            int x = arr[i];
            
            if(x % 2 == 0 ){
               if(x > largesteven){
                largesteven = x;
               }
            }
            else {
                if(x < smallestodd){
                    smallestodd = x;
                }
            }
        }
        System.out.println("largesteven numbers : "+ largesteven);
        System.out.println("smallestodd numbers : "+ smallestodd);
    }
}


// find largest even and smallest odd from given array