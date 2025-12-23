public class ThirdLargest {
    public static void main(String[] args) {
        int[] arr = {1,3,2,5,5};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];

            if (x == first || x == second || x == third) {
                continue;
            }

            if (x > first) {
                third = second;
                second = first;
                first = x;
            } else if (x > second) {
                third = second;
                second = x;
            } else if (x > third) {
                third = x;
            }
        }

        if (third == Integer.MIN_VALUE) {
            System.out.println("No third largest element");
        } else {
            System.out.println("Third largest element is " + third);
        }

    }
}