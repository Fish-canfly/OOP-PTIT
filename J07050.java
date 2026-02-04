import java.util.*;
import java.io.*;
public class J07050{
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc=new Scanner(new File("MATHANG.in"));
        int t=Integer.parseInt(sc.nextLine());
        ArrayList <Hang> li= new ArrayList<>();
        while(t-->0){
            li.add(new Hang(sc.nextLine(),sc.nextLine(),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(li,(Hang a,Hang b) -> Double.compare(b.getPrice(),a.getPrice()));
        for(Hang it: li){
            System.out.println(it);
        }
    }
}
class Hang{
    private String ten,nhom,id="MH";
    private Double price;
    private static int pos=1;
    public Hang(String a,String b,Double c,Double d){
        this.ten=a;this.nhom=b;
        this.price=d-c;
        if(pos<10) id=id+"0";
        id=id+String.valueOf(pos);
        pos++;
    }
    public Double getPrice(){
        return this.price;
    }
    @Override
    public String toString(){
        return this.id+" "+this.ten+" "+this.nhom+" "+String.format("%.2f",this.price);
    }
}