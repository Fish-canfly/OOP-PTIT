import java.util.*;
import java.io.*;
public class J07007{
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc=new Scanner(new File("DATA.in"));
        TreeMap <String,Integer> mp=new TreeMap<>();
        while(sc.hasNext()){
            String s=sc.next().toLowerCase();
            if(!mp.containsKey(s)){
                mp.put(s,1);
            }
        }
        for(String s:mp.keySet()){
            System.out.println(s);
        }
    }
}