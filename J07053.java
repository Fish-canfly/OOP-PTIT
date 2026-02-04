import java.util.*;
import java.io.*;
public class J07053{
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc=new Scanner(new File("XETTUYEN.in"));
        ArrayList <Thisinh> li=new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            li.add(new Thisinh(sc.nextLine(),
                                sc.nextLine(),
                                Double.parseDouble(sc.nextLine()),
                                Double.parseDouble(sc.nextLine())));
        }
        for(Thisinh it:li){
            System.out.println(it);
        }
    }
}
class Thisinh{
    private static int pos=1;
    private String name,id="PH",trangthai;
    private double poin;
    private int tuoi,poi;
    public Thisinh(String a,String b,double c,double d){
        String[] lmao=b.split("/");
        if(pos<10) this.id=this.id+"0";
        this.id=this.id+String.valueOf(pos);
        pos++;
        this.tuoi=2021-Integer.parseInt(lmao[2]);
        this.name=chuanhoa(a);
        this.poin=(c+d)/2;
        if(c>=8 && d>=8) poin+=1;
        else if(c>=7.5 && d>=7.5) poin+=0.5;
        this.poi=(int)Math.round(poin);
        if(this.poi>10) this.poi=10;
        this.trangthai=solve(poi);
    }
    public String chuanhoa(String a){
        String[] lol=a.trim().toLowerCase().split("\\s+");
        StringBuilder sb=new StringBuilder();
        for(String s: lol){
            sb.append(s.substring(0,1).toUpperCase()+s.substring(1)+" ");
        }
        return sb.toString();
    }
    public String solve(double poi){
        if(poi<5) return "Truot";
        if(poi <7) return "Trung binh";
        if(poi == 7.0) return "Kha";
        if(poi==8.0) return "Gioi";
        return "Xuat sac"; 
    }
    @Override
    public String toString(){
        String s=this.id+" "+this.name+String.valueOf(this.tuoi)+" ";
        if(this.poi==(int)this.poi) s=s+String.valueOf((int)this.poi);
        else s=s+String.format("%.1f",this.poi);
        return s+ " "+ this.trangthai;
    }
}