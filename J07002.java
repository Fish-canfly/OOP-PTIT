import java.util.*;
import java.io.*;
public class J07002{
    public static void main(String[] args){
        try{
            Scanner sc=new Scanner(new File("DATA.in"));
            long sum=0;
            while(sc.hasNext()){
                if(sc.hasNextInt()) sum+=(long)sc.nextInt();
                else sc.next();
            }
            System.out.println(sum);
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
}