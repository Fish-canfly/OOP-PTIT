import java.util.*;
import java.io.*;
public class J05023{
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
        int n=Integer.parseInt(sc.nextLine());
        while(n-->0){
            String nam=sc.nextLine();
            System.out.println("DANH SACH SINH VIEN KHOA "+nam+":");
            for(ArrayList<String> it:li){
                if(it.get(2).substring(1,3).equals(nam.substring(2)))
                    System.out.println(it.get(0)+" "+
                                        it.get(1)+" "+it.get(2)+" "+
                                        it.get(3));
            }
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