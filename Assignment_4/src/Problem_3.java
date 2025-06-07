import java.util.Scanner;


public class Problem_3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter String:");
         String str= sc.nextLine();
         String res= "";
         for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);
            if(res.indexOf(ch)==-1){
                res +=ch;
            }
         }
         System.out.println("After Removal of Duplication    "+res);

    }
}
