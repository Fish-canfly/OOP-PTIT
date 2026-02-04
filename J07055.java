import java.util.*;
import java.io.*;
public class J07055{
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc=new Scanner(new File("BANGDIEM.in"));
        int t=Integer.parseInt(sc.nextLine());
        ArrayList <Hocsinh> li= new ArrayList<>();
        while(t-->0){
            li.add(new Hocsinh(sc.nextLine(),
                                Integer.parseInt(sc.nextLine()),
                                Integer.parseInt(sc.nextLine()),
                                Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(li, (Hocsinh a,Hocsinh b)-> Double.compare(b.getPoi(),a.getPoi()));
        for(Hocsinh it:li){
            System.out.println(it);
        }
    }
}
class Hocsinh{
    private static int pos=1;
    private String name,id="SV",trangthai;
    private double poi;
    public Hocsinh(String a,int b,int c,int d){
        this.name=chuanhoa(a);
        this.poi=b*0.25+c*0.35+d*0.4;
        this.poi=Math.round(poi*100.0)/100.0;
        if(this.poi < 5) trangthai="KEM";
        else if(this.poi>=5 && this.poi<6.5) trangthai="TRUNG BINH";
        else if(this.poi>=6.5 && this.poi<8) trangthai="KHA";
        else trangthai="GIOI";
        if(pos<10) this.id=this.id+"0";
        this.id=this.id+String.valueOf(pos);
        pos++;
    }
    public String chuanhoa(String a){
        String[] lmao=a.trim().toLowerCase().split("\\s+");
        String b="";
        for(String s:lmao){
            b+=s.substring(0,1).toUpperCase()+s.substring(1)+" ";
        }
        return b;
    }
    public double getPoi(){
        return this.poi;
    }
    @Override
    public String toString(){
        return this.id+" "+this.name+String.format("%.2f",this.poi)+" "+this.trangthai;
    }
}