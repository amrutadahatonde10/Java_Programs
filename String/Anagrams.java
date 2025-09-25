import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        
        String s1 = "listen";
        String s2 = "silent";

        boolean isAnagrams = true;

        if (s1.length() != s2.length()) {
            isAnagrams = false;
        } else {
            char[] arr1 = s1.toCharArray();
            char[] arr2 = s2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    isAnagrams = false;
                    break;
                }
            }
        }

        if (isAnagrams) {
            System.out.println("strings are anagrams");
        } else {
            System.out.println("strings are not anagrams");
        }
    }
}
