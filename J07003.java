import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class J07003{
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc=new Scanner(new File("DATA.in"));
        String s=sc.next();
        while(s.length()>1){
            int mid=s.length()/2;
            String a=s.substring(0,mid);
            s=s.substring(mid,s.length());
            //System.out.println(a+" "+s);
            s=String.valueOf(new BigInteger(a).add(new BigInteger(s)));
            System.out.println(s);
        }
    }
}