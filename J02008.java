import java.util.*;
import java.io.*;
public class J02008{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            long lcm=1;
            for(int i=2;i<=n;++i){
                lcm=lcm*i/gcd(lcm,i);
            }
            System.out.println(lcm);
        }
    }
    static long gcd(long a, long b){
        return b==0 ? a : gcd(b,a%b);
    }
}