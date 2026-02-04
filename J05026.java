import java.util.*;
import java.io.*;
public class J05026{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList <ArrayList<String>> li=new ArrayList<>();
        for(int i=1;i<=t;++i){
            ArrayList <String> it=new ArrayList<>();
            String id="GV";
            if(i<10) id+="0";
            id+=String.valueOf(i);
            String name=sc.nextLine();
            String[] lmao=name.split("\\s+");
            it.add(id);
            it.add(name);
            it.add(rutgon(sc.nextLine()));
            it.add(lmao[lmao.length-1]);
                li.add(it);
        }
        int n=Integer.parseInt(sc.nextLine());
        while(n-->0){
            String nganh=rutgon(sc.nextLine());
            solve(li,nganh);
        }
    }
    static String rutgon(String s){
        String[] lmao=s.split("\\s+");
        String res="";
        for(String r:lmao){
            res+=r.substring(0,1).toUpperCase();
        }
        return res;
    }
    static void solve(ArrayList<ArrayList<String>> li,String nganh){
        System.out.printf("DANH SACH GIANG VIEN BO MON %s:\n",nganh);
        for(ArrayList<String> it:li){
            if(it.get(2).equals(nganh))
                System.out.println(it.get(0)+" "+it.get(1)+" "+it.get(2));
        }
    }
}