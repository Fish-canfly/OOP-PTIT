import java.util.*;
import java.io.*;
public class J04004{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong();
        long b=sc.nextLong();
        long c=sc.nextLong();
        long d=sc.nextLong();
        long e=a*d+c*b;
        long f=b*d;
        long bruh=gcd(e,f);
        System.out.println((e/bruh)+"/"+(f/bruh));
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