import java.util.*;
import java.math.BigInteger;
public class J03018{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            BigInteger a=sc.nextBigInteger();
            BigInteger tong=BigInteger.ZERO;
            for(int i=1;i<=4;++i){
                BigInteger b=new BigInteger(String.valueOf(i));
                tong.add(b.pow(a));
            }
            System.out.println(tong.mod(BigInteger.valueOf(5)));
        }
    }
}