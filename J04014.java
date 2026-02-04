import java.util.*;
import java.io.*;
public class J04014{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            long a=sc.nextLong();
            long b=sc.nextLong();
            long c=sc.nextLong();
            long d=sc.nextLong();
                long e=(a*d+c*b)*(a*d+c*b); long f=(b*d)*(b*d);
                long bruh=gcd(e,f);
                e=e/bruh;
                f=f/bruh;
                long g=a*c*e;
                long h=b*d*f;
                long lmao=gcd(g,h);
                g=g/lmao;
                h=h/lmao;
            System.out.println(e+"/"+f+" "+g+"/"+h);
        }
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