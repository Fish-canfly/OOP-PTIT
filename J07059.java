import java.util.*;
import java.io.*;
import java.time.*;
import java.time.format.*;
public class J07059{
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc=new Scanner(new File("CATHI.in"));
        int t=Integer.parseInt(sc.nextLine());
        ArrayList <Cathi> li=new ArrayList<>();
        while(t-->0){
            li.add(new Cathi(sc.nextLine(),
                                sc.nextLine(),
                                sc.nextLine()));
        }
        Collections.sort(li, new Comparator<Cathi>(){
            @Override
            public int compare(Cathi a,Cathi b){
                DateTimeFormatter df=DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate x=LocalDate.parse(a.getDay(),df);
                LocalDate y=LocalDate.parse(b.getDay(),df);
                if(y.compareTo(x)==0){
                    DateTimeFormatter hf= DateTimeFormatter.ofPattern("HH:MM");
                    LocalTime c=LocalTime.parse(a.getHour(),hf);
                    LocalTime d=LocalTime.parse(b.getHour(),hf);
                    if(d.compareTo(c)==0){
                        return a.getID().compareTo(b.getID());
                    }
                    return c.compareTo(d);
                }
                return x.compareTo(y);
            }
        });
        for(Cathi it:li){
            System.out.println(it);
        }
    }
}
class Cathi{
    private static int pos=1;
    private String id="C",ngay,gio,phong;
    public Cathi(String a,String b,String c){
        if(pos<10) id+="00";
        else if(pos>=10 && pos<100) id+="0";
        id+=String.valueOf(pos);
        pos++;
        this.ngay=a;
        this.gio=b;
        this.phong=c;
    }
    @Override
    public String toString(){
        return this.id+" "+this.ngay+" "+this.gio+" "+this.phong;
    }
    public String getDay(){
        return this.ngay;
    }
    public String getHour(){
        return this.gio;
    }
    public String getID(){
        return this.id;
    }
}