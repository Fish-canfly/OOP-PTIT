import java.util.*;
public class J05036{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList <Product> li= new ArrayList<>();
        for(int i=1;i<=t;++i){
            String pos="MH";
            if(i<10) pos+="0";
            pos+=String.valueOf(i);
            li.add(new Product(pos,sc.nextLine(),sc.nextLine(),
                                Integer.parseInt(sc.nextLine()),
                                Integer.parseInt(sc.nextLine())));
        }
        for(Product it:li){
            System.out.println(it);
        }
    }
}
class Product{
    private String id,name,donvi;
    private double phivc,thanhtien,giaban;
    public Product(String a,String b,String c,int d,int e){
        this.id=a;
        this.name=b;
        this.donvi=c;
        this.phivc= (d*e)*5.0/100;
            this.phivc=Math.round(this.phivc);
        this.thanhtien=d*e+this.phivc;
            this.thanhtien=Math.round(this.thanhtien);   
        this.giaban=this.thanhtien+(this.thanhtien*2.0/100);
            this.giaban=Math.round(this.giaban);
    }
    @Override
    public String toString(){
        String res= this.id+" "+this.name+" "+this.donvi+" ";
        res+=chuanhoa(this.phivc);
        res+=chuanhoa(this.thanhtien);
        res+=chuanhoa(this.giaban);
        return res;
    }
    public String chuanhoa(double a){
        if((int)a==a) return String.valueOf((int)a)+" ";
        return String.format("%.1f",a)+" ";
    }
}