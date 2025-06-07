import java.util.Scanner;

public class Problem_7 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String word = sc.nextLine();
        sc.close();

        String[] words = sentence.split(" ");
        int count = 0;

        for (String w : words) {
            if (w.equals(word)) {
                count++;
            }
        }

        System.out.println(count); 
    }
    
}
