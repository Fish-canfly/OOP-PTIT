import java.util.*;
import java.io.*;
public class J03027{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();++i){
            if(sb.length()>0){
                if(sb.charAt(sb.length()-1)==s.charAt(i)){
                    sb.setLength(sb.length()-1);
                }
                else{
                    sb.append(s.charAt(i));
                }
            }
            else sb.append(s.charAt(i));
        }
        if(sb.length()>0) System.out.println(sb.toString());
        else System.out.println("Empty String");
    }
}