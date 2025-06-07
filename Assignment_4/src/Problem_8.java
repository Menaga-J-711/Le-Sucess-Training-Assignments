import java.util.Scanner;


public class Problem_8 {
    
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc. nextLine();
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isUpperCase(ch)) {
                result += Character.toLowerCase(ch);
            } else {
                result += Character.toUpperCase(ch);
            }
        }

        System.out.println(result); // Output: hEllO
    }
}
