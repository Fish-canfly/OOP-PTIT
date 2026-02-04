import java.util.*;
import java.io.*;
public class J04003{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong();
        long b=sc.nextLong();
        long bruh=gcd(a,b);
        System.out.println((a/bruh)+"/"+(b/bruh));
    }
    static long gcd(long a,long b){
        while(b!=0){
            long t=a%b;
            a=b;
            b=t;
        }
        return a;
    }
}