import java.util.*;
import java.io.*;
public class J05027{
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
            String tukhoa=sc.nextLine();
            solve(li,tukhoa);
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
    static void solve(ArrayList<ArrayList<String>> li,String tukhoa){
        System.out.printf("DANH SACH GIANG VIEN THEO TU KHOA %s:\n",tukhoa);
        for(ArrayList<String> it:li){
            if(check(it.get(1),tukhoa.toLowerCase()))
                System.out.println(it.get(0)+" "+it.get(1)+" "+it.get(2));
        }
    }
    static boolean check(String a,String b){
        if(a.toLowerCase().contains(b)) return true;
        return false;
    }
}