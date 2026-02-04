import java.util.*;
import java.io.*;
import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;
import java.time.chrono.*;
public class J07051{
    public static void main(String[] agrs) throws FileNotFoundException{
        Scanner sc=new Scanner(new File("KHACHHANG.in"));
        int t=Integer.parseInt(sc.nextLine());
        ArrayList <Khach> li= new ArrayList<>();
        while(t-->0){
            li.add(new Khach(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(li, (Khach a,Khach b)->Integer.compare(b.getPrice(),a.getPrice()));
        for(Khach it:li){
            System.out.println(it);
        }
    }
}
class Khach{
    private String id="KH",name,phong,ngay;
    private static int pos=1;
    private int price;
    public Khach(String a,String b,String c,String d,String e){
        this.name=chuanhoa(a);
        this.phong=b;
        this.ngay=String.valueOf(hieu(correct(c),correct(d)));
        this.price=solve(b,e);
        if(pos<10) this.id=this.id+"0";
        this.id=this.id+String.valueOf(pos);
        pos++;
    }
    public long hieu(String c,String d){
        DateTimeFormatter df= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate a=LocalDate.parse(c,df);
        LocalDate b=LocalDate.parse(d,df);
        return ChronoUnit.DAYS.between(a,b)+1;
    }
    public int solve(String b,String e){
        int base=0;
        switch (b.charAt(0)) {
            case '1':
                base=25;
                break;
            case '2':
                base=34;
                break;
            case '3':
                base=50;
                break;
            case '4':
                base=80;
                break;
        }
        return base*Integer.parseInt(this.ngay)+Integer.parseInt(e);
    }
    public String chuanhoa(String a){
        String[] lmao=a.trim().toLowerCase().split("\\s+");
        String b="";
        for(String it:lmao){
            b+=it.substring(0,1).toUpperCase()+it.substring(1)+" ";
        }
        return b;
    }
    public String correct(String x){
        String[] p=x.split("/");
        if(p[0].length()==1) p[0]="0"+p[0];
        if(p[1].length()==1) p[1]='0'+p[1];
        return p[0]+"/"+p[1]+"/"+p[2];
    }
    public int getPrice(){
        return this.price;
    }
    @Override
    public String toString(){
        return this.id+" "+this.name+this.phong+" "+this.ngay+" "+String.valueOf(this.price);
    }
}