import java.util.Scanner;

public class Problem_4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String input=sc.nextLine();
        StringBuilder sb = new StringBuilder(input);
        System.out.println(sb.reverse().toString()); 
    }
    
}
