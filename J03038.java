import java.util.*;
import java.io.*;
public class J03038{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        HashSet <Character> set= new HashSet<>();
        for(int i=0;i<s.length();++i){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
            }
        }
        System.out.println(set.size());
    }
}