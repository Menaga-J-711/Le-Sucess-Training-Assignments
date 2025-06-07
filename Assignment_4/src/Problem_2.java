import java.util.Scanner;

public class Problem_2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        int count_1=0;
        int count_2=0;
        for(int i=0; i<str.length();i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' || str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U'){
                    count_1++;
            }
            else{
                count_2++;
            }
        }

        System.out.println(count_1);
        System.out.println(count_2);
    }
    
}
