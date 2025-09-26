public class ReplaceOcc {
    public static void main(String[] args) {
        String input = "Tomorrow";
        char letter = 'o';
        String output = "";
        int count = 0;

        for(int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            if (current == letter) {
                count++;
                for (int j = 0; j < count; j++) {
                    output += "*";
                }
            } else {
                output += current;
            }
        }
        System.out.println("Input: "+input);
        System.out.println("Output: "+output);
    }
}