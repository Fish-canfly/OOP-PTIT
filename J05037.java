import java.util.*;
public class J05037{
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
        Collections.sort(li, (Product x,Product y)->{
            return Double.compare(y.getGia(),x.getGia());
        });
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
        this.phivc= (d*e)*5/100;
            this.phivc=Math.round(this.phivc);
        this.thanhtien=d*e+this.phivc;
            this.thanhtien=Math.round(this.thanhtien);   
        this.giaban=(this.thanhtien+this.thanhtien*2/100.0)/e;
            this.giaban=lamtron(this.giaban);
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
    public double getGia(){
        return this.giaban;
    }
    public double lamtron(double a){
        double b=(a/100.0)-((int)(a/100.0));
        if(b>0){
            return ((int)(a/100.0)+1)*100;
        }
        return a;
    }
}