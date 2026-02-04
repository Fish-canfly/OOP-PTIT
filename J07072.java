import java.util.*;
import java.io.*;
public class J07072{
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc=new Scanner(new File("DANHSACH.in"));
        ArrayList <String> li=new ArrayList<>();
        while(sc.hasNextLine()){
            li.add(chuanhoa(sc.nextLine()));
        }
        Collections.sort(li, (String a,String b) -> {
            String t1=a.substring(a.lastIndexOf(" ")+1);
            String t2=b.substring(b.lastIndexOf(" ")+1);
            String h1=a.substring(0,a.lastIndexOf(" "));
            String h2=b.substring(0,b.lastIndexOf(" "));
            if(t1.compareTo(t2)==0) return h1.compareTo(h2);
            return t1.compareTo(t2);
        });
        for(String it:li){
            System.out.println(it);
        }
    }
    static String chuanhoa(String s){
        String[] lmao=s.trim().toLowerCase().split("\\s+");
        String res="";
        for(String it:lmao){
            res+=it.substring(0,1).toUpperCase()+it.substring(1)+" ";
        }
        return res.substring(0,res.length()-1);
    }
}