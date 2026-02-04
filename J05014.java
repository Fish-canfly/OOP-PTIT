import java.util.*;
public class J05014{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList <giaovien> li=new ArrayList<>();
        for(int i=1;i<=t;++i){
            li.add(new giaovien(String.format("GV%02d",i),
                    sc.nextLine(),
                    sc.nextLine(),
                    sc.nextLine(),
                    sc.nextLine()));
        }
        Collections.sort(li, (giaovien a,giaovien b)->{
            return Double.compare(b.poi+b.bonus,a.poi+a.bonus);
        });
        for(giaovien it:li) System.out.println(it);
    }
}
class giaovien{
    public String id,name,ma,mon="HOA",trangthai="LOAI";
    public double a,b,bonus=0.0,poi;
    public giaovien(String id,String name,String ma,String a,String b){
        this.id=id;
        this.name=name;
        this.ma=ma;
        this.a=Double.valueOf(a)*2.0;
        this.b=Double.valueOf(b);
        switch(ma.charAt(1)){
            case '1':
                this.bonus=2.0;
                break;
            case '2':
                this.bonus=1.5;
                break;
            case '3':
                this.bonus=1.0;
                break;
        }
        switch(ma.charAt(0)){
            case 'A':
                this.mon="TOAN";
                break;
            case 'B':
                this.mon="LY";
                break;
        }
        this.poi=this.a+this.b;
        if(this.poi+this.bonus>=18){
            this.trangthai="TRUNG TUYEN";
        }
    }
    @Override
    public String toString(){
        return this.id+" "+this.name+" "+this.mon+" "+
                String.format("%.1f",this.poi+this.bonus)+" "+this.trangthai;
    }
}