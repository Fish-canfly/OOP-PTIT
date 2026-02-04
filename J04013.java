import java.util.*;
import java.io.*;
public class J04013{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String id=sc.nextLine();
        String name=sc.nextLine();
        double toan=Double.parseDouble(sc.nextLine());
        double ly=Double.parseDouble(sc.nextLine());
        double hoa=Double.parseDouble(sc.nextLine());
        String tong=chuanhoa(toan*2+ly+hoa);
        double lmao=0;
        switch (id.substring(0,3)){
            case "KV1":
                lmao=0.5;
                break;
            case "KV2":
                lmao=1;
                break;
            case "KV3":
                lmao=2.5;
                break;
        }
        String bonus=chuanhoa(lmao);
        String res=solve(tong,bonus);
        System.out.println(id+" "+name+" "+bonus+" "+tong+" "+res);
    }
    static String chuanhoa(double bruh){
        if((int) bruh<bruh) return String.format("%.1f",bruh);
        return String.valueOf((int)bruh);
    }
    static String solve(String a,String b){
        if(Double.parseDouble(a)+Double.parseDouble(b)>=24){
            return "TRUNG TUYEN";
        }
        return "TRUOT";
    }
}