import java.util.*;

import java.util.Stack;



public class Problem_3 {


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Stack<Character> st = new Stack<>();

        boolean flag = false;
        
        for(char ch: str.toCharArray()){
            if( ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
                
            }
            else if(ch== ')' || ch == '}' || ch == ']'){
                if(!st.isEmpty() && ((ch== ')') && st.peek() =='(' || 
                (ch== '}' && st.peek() == '{') ||
                 (ch== ']' && st.peek() == '['))){
                    st.pop();
                    flag = true;
                }
            }          
        }
        if(flag){
            System.out.println("  Balanced");
        }
        else{
            System.out.println("  notBalanced");
        }
        


    }
    
}
