import java.util.*;

public class Problem_1 {
    public static void main(String[] args)  {
        Scanner sc= new Scanner(System.in);

        String s= sc.nextLine();
        

        if(isPalli(s)){
            System.out.println("Palindrom");
        }
        else
        System.out.println("Not Pallindrom");

        
    }
    public static boolean isPalli(String s){
    int left=0;
    int right= s.length()-1;
    while(right<left){
        if(s.charAt(left) != s.charAt(right)){
            return false;
        }
        right++;
        left++;
    }
    return true;

}
}
