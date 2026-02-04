import java.util.*;
import java.io.*;
public class J03022{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s="";
        while(sc.hasNext()){
            if(!s.equals("")) s+=" "+sc.next().toLowerCase();
            else s+=sc.next().toLowerCase();
        }
        String[] lmao=s.split("[./!/?]");
        for(String it: lmao){
            it=it.trim();
            System.out.println(it.substring(0,1).toUpperCase()+it.substring(1));
        }
    }
}