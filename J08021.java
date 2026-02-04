import java.util.*;
import java.io.*;
public class J08021{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        Stack <Integer> st=new Stack<>();
        while(t-->0){
            st.push(-1);
            String s=sc.nextLine();
            int ans=0;
            for(int i=0;i<s.length();++i){
                if(s.charAt(i)=='(') st.push(i);
                else {
                    st.pop();
                    if(st.isEmpty()){
                        st.push(i);
                    }
                    else{
                        ans=Math.max(ans,i-st.peek());
                    }
                }
            }
            System.out.println(ans);
            st.clear();
        }
    }
}