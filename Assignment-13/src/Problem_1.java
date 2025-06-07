import java.util.*;
import java.util.Stack;


public class Problem_1{
    public static void main (String[] args) {;
    Stack <Character> st = new Stack<>();
    Scanner sc= new Scanner(System.in);
     String str = sc.nextLine();


     for(char ch : str.toCharArray()){
        if(!st.isEmpty() && st.peek() == ch){
            st.pop();
        }
        else{
            st.push(ch);
        }
        }

        StringBuilder result = new StringBuilder();
        for(char s :st){
            result.append(s);
        }
        System.out.println(result.toString());
       
     }
  


}