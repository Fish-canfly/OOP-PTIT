import java.util.*;
public class J05060{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList <Phuho> li=new ArrayList<>();
        for(int i=1;i<=t;++i){
            li.add(new Phuho(String.format("PH%02d",i),
                                sc.nextLine(),
                                sc.nextLine(),
                                Double.parseDouble(sc.nextLine()),
                                Double.parseDouble(sc.nextLine())
            ));
        }
        for(Phuho it:li){
            System.out.println(it);
        }
    }
}
class Phuho{
    private String id,name,trangthai="Truot";
    private double tong,bonus=0,res;
    private int tuoi;
    public Phuho(String id,String name,String dob,double a,double b){
        this.id=id;
        this.name=name;
        this.tuoi=2021-(Integer.valueOf(dob.substring(6)));
        this.tong=(a+b)/2;
        if(a>=8 && b>=8) bonus=1;
        else if(a>=7.5 && b>=7.5) bonus=0.5;
        this.res=Math.round((this.tong+this.bonus));
        if(this.res>10) this.res=10;
        if(res>=5 && res<=6) this.trangthai="Trung binh";
        else if(res>6 && res <8) this.trangthai="Kha";
        else if(res>=8 && res<9) this.trangthai="Gioi";
        else if(res>=9) this.trangthai="Xuat sac";
    }
    @Override
    public String toString(){
        return this.id+" "+this.name+" "+String.valueOf(this.tuoi)+" "+
                chuanhoa(this.res)+" "+this.trangthai;
    }
    public String chuanhoa(double a){
        if(a>(int)a) return String.format("%.1f",a);
        return String.valueOf((int)a);
    }
}