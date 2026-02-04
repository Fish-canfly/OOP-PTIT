import java.util.*;
import java.io.*;
public class J07048{
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc=new Scanner(new File("SANPHAM.in"));
        ArrayList<Sanpham> li=new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            li.add(new Sanpham(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()),sc.nextLine()));
        }
        Collections.sort(li, new Comparator<Sanpham>(){
            @Override
            public int compare(Sanpham a,Sanpham b){
                if(a.getPrice()==b.getPrice()){
                    return a.getId().compareTo(b.getId());
                }
                return Integer.compare(b.getPrice(),a.getPrice());
            }
        });
        for(Sanpham it:li){
            System.out.println(it);
        }
    }
}
class Sanpham{
    private String id,name,thang;
    private int price;
    public Sanpham(String a, String b, int c,String d){
        this.id=a;
        this.name=b;
        this.price=c;
        this.thang=d;
    }
    public int getPrice(){
        return this.price;
    }
    public String getId(){
        return this.id;
    }
    @Override
    public String toString(){
        return this.id+" "+this.name+" "+String.valueOf(this.price)+" "+this.thang;
    }
}