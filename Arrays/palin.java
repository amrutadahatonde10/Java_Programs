public class palin{
    public static void main(String[] args) {
        int[] arr = {1,2,1,4};

        boolean ispalin = true;

        int i = 0;
        int j = arr.length - 1;

        while(i < j){
            if(arr[i] != arr[j]){
                ispalin = false;
                break;
            }
            i++;
            j--;
        }
        if(ispalin){
            System.out.println("Array is palindrome");
        } else {
            System.out.println("Array is not palindrome");
        }
    }
 }
