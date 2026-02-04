import java.util.*;
import java.io.*;
public class J07018{
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc=new Scanner(new File("SINHVIEN.in"));
        int t=Integer.parseInt(sc.nextLine());
        for(int i=1;i<=t;++i){
            String id=String.format("B20DCCN%03d",i);
            String name=chuanhoa(sc.nextLine());
            String lop=sc.nextLine();
            String dob=chinhsua(sc.nextLine());
            String poi=String.format("%.02f",Double.parseDouble(sc.nextLine()));
            System.out.println(id+" "+name+lop+" "+dob+" "+poi);
        }
    }
    static String chuanhoa(String s){
        String[] lmao=s.trim().toLowerCase().split("\\s+");
        String res="";
        for(String r:lmao){
            res+=r.substring(0,1).toUpperCase()+r.substring(1)+" ";
        }
        return res;
    }
    static String chinhsua(String s){
        String[] lmao=s.split("/");
        if(lmao[0].length()==1) lmao[0]="0"+lmao[0];
        if(lmao[1].length()==1) lmao[1]="0"+lmao[1];
        return lmao[0]+"/"+lmao[1]+"/"+lmao[2];
    }
}