import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class J03011{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            BigInteger a=new BigInteger(sc.next());
            BigInteger b=new BigInteger(sc.next());
            BigInteger res=a.gcd(b);
            System.out.println(res);
        }
    }
}