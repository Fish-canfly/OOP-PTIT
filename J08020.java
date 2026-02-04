import java.util.*;
import java.io.*;
public class J08020{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s=sc.nextLine();
            if(s.length()==0){
                System.out.println("YES");
                continue;
            }
            Stack<Character> st=new Stack<>();
            boolean check=true;
            for(char c:s.toCharArray()){
                if(c=='('||c=='['||c=='{') st.add(c);
                else{
                    if(!st.isEmpty()){
                        if(c==']' && st.peek()!='['){
                            check=false;
                            break;
                        }
                        if(c=='}' && st.peek()!='{'){
                            check=false;
                            break;
                        }
                        if(c==')' && st.peek()!='('){
                            check=false;
                            break;
                        }
                        st.pop();
                    }
                    else{
                        check=false;
                        break;
                    }
                }
            }
            if(!st.isEmpty()) check=false;
            if(check) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}