import java.util.*;
import java.io.*;
import java.time.*;
import java.time.format.*;
import java.time.temporal.*;
public class J07046{
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc=new Scanner(new File("KHACH.in"));
        int t=Integer.parseInt(sc.nextLine());
        ArrayList <Khach> li= new ArrayList<>();
        while(t-->0){
            li.add(new Khach(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));   
        }
        Collections.sort(li, (Khach a,Khach b) -> Integer.compare(b.getDay(),a.getDay()));
        for(Khach it: li){  
            System.out.println(it);
        }
    }
}
class Khach{
    private String name,id="KH",ngay,ma;
    private static int pos=1;
    public Khach(String a, String b, String c, String d){
        this.name=a;
        this.ma=b;
        this.ngay=String.valueOf(hieu(c,d));
        if(pos<10){
            id=id+"0"+String.valueOf(pos);
        }
        else id=id+String.valueOf(pos);
        pos++;
    }
    public long hieu(String a, String b){
        DateTimeFormatter df= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d1=LocalDate.parse(a,df);
        LocalDate d2=LocalDate.parse(b,df);
        return ChronoUnit.DAYS.between(d1,d2);
    }
    public int getDay(){
        return Integer.parseInt(ngay);
    }
    @Override
    public String toString(){
        return this.id+" "+this.name+" "+this.ma+" "+this.ngay;
    }
}