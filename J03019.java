import java.util.*;
public class J03019{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        String s=sc.next();
        char Max='a';
        for(int i=s.length()-1;i>=0;--i){
            if(s.charAt(i)>=Max){
                sb.insert(0,s.charAt(i));
                Max=s.charAt(i);
            }
        }
        System.out.println(sb.toString());
    }
}