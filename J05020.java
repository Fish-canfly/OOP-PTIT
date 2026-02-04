import java.util.*;
import java.io.*;
public class J05020{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<ArrayList<String>> li=new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            ArrayList<String> it=new ArrayList<>();
            it.add(sc.nextLine());
            it.add(sc.nextLine());
            it.add(sc.nextLine());
            it.add(sc.nextLine());
            li.add(it);
        }
        Collections.sort(li, (ArrayList<String> a,ArrayList<String> b)->{
            if(a.get(2).equals(b.get(2))){
                return a.get(0).compareTo(b.get(0));
            }
            return a.get(2).compareTo(b.get(2));
        });
        for(ArrayList<String> it:li){
            System.out.println(it.get(0)+" "+
                                it.get(1)+" "+it.get(2)+" "+
                                it.get(3));
        }
    }
    static String chuanhoa(String s){
        String res="";
        String[] lmao=s.trim().toLowerCase().split("\\s+");
        for(String r:lmao){
            res+=r.substring(0,1).toUpperCase()+r.substring(1)+" ";
        }
        return res;
    }
}