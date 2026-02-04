import java.util.*;
public class J05013{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<thisinh> li=new ArrayList<>();
        for(int i=1;i<=t;++i){
            li.add(new thisinh(String.format("TS%02d",i),
                                sc.nextLine(),
                                sc.nextLine(),
                                sc.nextLine()));
        }
        Collections.sort(li, (thisinh a,thisinh b)->{
            return Double.compare(b.poi,a.poi);
        });
        for(thisinh it:li) System.out.println(it);
    }
}
class thisinh{
    public String id,name,trangthai;
    public double a,b,poi;
    public thisinh(String id,String name,String a,String b){
        this.id=id;
        this.name=name;
        this.a=solve(a);
        this.b=solve(b);
        this.poi=(this.a+this.b)/2;
        if(poi<5) this.trangthai="TRUOT";
        else if(poi<8) this.trangthai="CAN NHAC";
        else if(poi<=9.5) this.trangthai="DAT";
        else this.trangthai="XUAT SAC";
    }
    public double solve(String s){
        double bruh=Double.valueOf(s);
        if(bruh>10) return bruh/10.0;
        return bruh;
    }
    @Override
    public String toString(){
        return this.id+" "+this.name+" "+String.format("%.2f",this.poi)+" "+
                    this.trangthai;
    }
}