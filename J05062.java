import java.util.*;
import java.io.*;
public class J05062{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt(); int n=sc.nextInt();
        sc.nextLine();
        double mini=100;
        HashSet<Double> set=new HashSet<>();
        while(t-->0){
            String s=chuanhoa(sc.nextLine());
            String[] poi=sc.nextLine().split("\\s+");
            double a=Double.valueOf(poi[0]);
            int b=Integer.valueOf(poi[1]);
            String hocbong="KHONG";
            if(a>=3.6 && b>=90){
                if(n>0){
                    hocbong="XUATSAC";
                    n--;
                    mini=Math.min(mini,a);
                    set.add(a);
                }
                else{
                    if(set.contains(a)) hocbong="XUATSAC";
                }
            }
            else if(a>3.2 && b>=80){
                if(n>0){
                    hocbong="GIOI";
                    n--;
                    mini=Math.min(mini,a);
                    set.add(a);
                }
                else{
                    if(set.contains(a)) hocbong="GIOI";
                }
            }
            else if(a>2.5 && b>=70){
                if(n>0){
                    hocbong="KHA";
                    n--;
                    mini=Math.min(mini,a);
                    set.add(a);
                }
                else{
                    if(set.contains(a)) hocbong="KHA";
                }
            }
            System.out.println(s+": "+hocbong);
        }
    }
    static String chuanhoa(String s){
        String[] lmao=s.trim().toLowerCase().split("\\s+");
        String res="";
        for(String r:lmao){
            res+=r.substring(0,1).toUpperCase()+r.substring(1)+" ";
        }
        return res.substring(0,res.length()-1);
    }
}