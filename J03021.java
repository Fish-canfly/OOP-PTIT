import java.util.*;
import java.io.*;
public class J03021{
    static String solve(char x){
        int n=x-'a';
        if(n<=2) return "2";
        if(n<=5) return "3";
        if(n<=8) return "4";
        if(n<=11) return "5";
        if(n<=14) return "6";
        if(n<=18) return "7";
        if(n<=21) return "8";
        return "9";
    }
    static int rev(int a){
        int bruh=0;
        while(a!=0){
            bruh=bruh*10+(a%10);
            a/=10;
        }
        return bruh;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s=sc.next().toLowerCase();
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<s.length();++i){
                sb.append(solve(s.charAt(i)));
            }
            String a=sb.toString();
            String b=sb.reverse().toString();
            //System.out.println(a); System.out.println(b);
            if(a.equals(b)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}