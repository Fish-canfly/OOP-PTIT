import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class J03033{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            BigInteger a=new BigInteger(sc.next());
            BigInteger b=new BigInteger(sc.next());
            BigInteger res=a.gcd(b);
            res=a.multiply(b).divide(res);
            System.out.println(res);
        }
    }
}