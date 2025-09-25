public class Palindrome{
    public static void main(String[] args) {
        int[] arr = {1,2,1,5};

        boolean isPalindrome = true;

        int i = 0;
        int j = arr.length - 1;

        while(i < j){
            if(arr[i] != arr[j]){
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }
        if(isPalindrome){
            System.out.println("Array is palindrome");
        } else {
            System.out.println("Array is not palindrome");
        }
    }
 }
