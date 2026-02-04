import java.util.*;
import java.io.*;
public class J05024{
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
            String nganh=sc.nextLine();
            System.out.println("DANH SACH SINH VIEN NGANH "+nganh.toUpperCase()+":");
            for(ArrayList<String> it:li){
                if(check(nganh,it.get(0),it.get(2)))
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
    static boolean check(String a,String b,String c){
        switch(a.toLowerCase()){
            case "ke toan":
                if(b.substring(3,7).equals("DCKT")){
                    return true;
                }
                break;
            case "vien thong":
                if(b.substring(3,7).equals("DCVT")){
                    return true;
                }
                break;
            case "dien tu":
                if(b.substring(3,7).equals("DCDT")){
                    return true;
                }
                break;
            case "cong nghe thong tin":
                if(b.substring(3,7).equals("DCCN") && c.charAt(0)!='E'){
                    return true;
                }
                break;
            case "an toan thong tin":
                if(b.substring(3,7).equals("DCAT") && c.charAt(0)!='E'){
                    return true;
                }
                break;
        }
        return false;
    }
}