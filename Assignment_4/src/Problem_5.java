
import java.util.Scanner;

public class Problem_5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        String str2= sc.nextLine();
        int [] count = new int[26];

        for(char c: str.toCharArray()){
            count[c-'a']++;
        }
         for(char c: str2.toCharArray()){
            count[c-'a']--;
        }
        for(int i=0;i<26;i++){
            if(count[i]!=0){
                System.out.println("Not Anagrams");
        }
         }
         System.out.println("Anagrams");
   
    }
    
}
