import java.util.*;
import java.io.*;
public class J05057{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList <Tuyensinh> li=new ArrayList<>();
        while(t-->0){
            li.add(new Tuyensinh(sc.nextLine(),
                                sc.nextLine(),
                                Double.parseDouble(sc.nextLine()),
                                Double.parseDouble(sc.nextLine()),
                                Double.parseDouble(sc.nextLine())));
        }
        for(Tuyensinh it:li){
            System.out.println(it);
        }
    }
}
class Tuyensinh{
    private String id,name,trangthai="TRUOT";
    private double poi,bonus;
    public Tuyensinh(String id,String name,double a,double b,double c){
        this.id=id;
        this.name=name;
        this.poi=Math.round((a*2+b+c)*10.0)/10.0;
        switch (id.charAt(2)){
            case '1':
                this.bonus=0.5;
                break;
            case '2':
                this.bonus=1.0;
                break;
            case '3':
                this.bonus=2.5;
                break;
        }
        if(this.poi+this.bonus>=24){
            this.trangthai="TRUNG TUYEN";
        }
    }
    @Override
    public String toString(){
        return this.id+" "+this.name+" "+chuanhoa(this.bonus)+" "+chuanhoa(this.poi)+" "+
                this.trangthai;
    }
    public String chuanhoa(double a){
        if(a>(int)a) return String.format("%.1f",a);
        return String.valueOf((int)a);
    }
}