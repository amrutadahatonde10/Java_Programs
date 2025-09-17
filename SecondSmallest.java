public class SecondSmallest {
    public static void main(String[] args) {
        int[] arr = {22, 11, 43, 54, 243}; // Expected: 22 is the second smallest

        // Start with very large values
        int first = Integer.MAX_VALUE;   // smallest
        int second = Integer.MAX_VALUE;  // second smallest

        // Check every element in the array
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i]; // current number

            if (x < first) {            // found new smallest
                second = first;         // old smallest → second
                first = x;              // update smallest
            } else if (x > first && x < second) {  // x is greater than first and x is smaller than second
                second = x;             // found a number between first and second
            }
        }

        // If no valid second smallest found
        if (second == Integer.MAX_VALUE) {
            System.out.println("No second smallest element found");
        } else {
            System.out.println("Second smallest element = " + second);
        }
    }
}
