import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class J03039{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            BigInteger a=new BigInteger(sc.next());
            BigInteger b=new BigInteger(sc.next());
            BigInteger max=a.max(b);
            BigInteger min=a.min(b);
            if(max.mod(min).equals(BigInteger.ZERO)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}