import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class J07085{
    public static void main(String[] args) throws IOException,ClassNotFoundException,FileNotFoundException{
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList <String> li=(ArrayList <String>) ois.readObject();
        for(String s:li){
            String res="";
            int sum=0;
            for(char c:s.toCharArray()){
                if(c-'0'>=0 && c-'0' <=9){
                    res+=c;
                    sum+=c-'0';
                }
            }
            BigInteger b= new BigInteger(res);
            System.out.println(b+" "+sum);
        }
    }
}