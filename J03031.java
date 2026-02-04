import java.util.*;
import java.io.*;
public class J03031{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        String lmao="abcdefghijklmnopqrstuvwxyz";
        while(t-->0){
            HashSet <Character> set=new HashSet<>();
            String s=sc.nextLine();
            int k=Integer.parseInt(sc.nextLine());
            for(int i=0;i<s.length();++i) set.add(s.charAt(i));
            int gap=26-set.size();
            if(gap>k) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}