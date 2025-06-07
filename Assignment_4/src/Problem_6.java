import java.util.Scanner;

public class Problem_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        sc.close();

        String[] words = sentence.split(" ");
        String result = "";

        for (String word : words) {
            if (!word.isEmpty()) {
                result += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
            }
        }

        System.out.println(result.trim()); // Output: Java Is Fun
    }
    
}
