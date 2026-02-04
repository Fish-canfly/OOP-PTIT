import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class J03016{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            BigInteger a= new BigInteger(sc.next());
            BigInteger b= new BigInteger("11");
            if(a.mod(b).intValue()==0){
                System.out.println(1);
            }
            else System.out.println(0);
        }
    }
}