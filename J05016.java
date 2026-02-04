import java.util.*;
import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;
public class J05016{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<khach> li=new ArrayList<>();
        for(int i=1;i<=t;++i){
            li.add(new khach(String.format("KH%02d",i),
                                sc.nextLine(),
                                sc.nextLine(),
                                sc.nextLine(),
                                sc.nextLine(),
                                sc.nextLine()));
        }
        Collections.sort(li, (khach a,khach b)->{
            return Long.compare(b.tien,a.tien);
        });
        for(khach it:li) System.out.println(it);
    }
}
class khach{
    public String name,phong,id;
    public long gia=80,ngay,tien;
    public khach(String id,String name,String phong,String vao,String ra,String bonus){
        this.name=chuanhoa(name);
        this.id=id;
        this.phong=phong;
        switch (phong.charAt(0)){
            case '1':
                this.gia=25;
                break;
            case '2':
                this.gia=34;
                break;
            case '3':
                this.gia=50;
                break;
        }
        this.ngay=solve(vao.trim(),ra.trim())+1;
        this.tien=this.gia*this.ngay+Long.valueOf(bonus);
    }
    public long solve(String vao,String ra){
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate a=LocalDate.parse(vao,dtf);
        LocalDate b=LocalDate.parse(ra,dtf);
        return ChronoUnit.DAYS.between(a,b);
    }
    public String chuanhoa(String s){
        String[] lmao=s.trim().toLowerCase().split("\\s+");
        StringBuilder sb=new StringBuilder();
        for(String r:lmao){
            sb.append(r.substring(0,1).toUpperCase()+r.substring(1)+" ");
        }
        return sb.toString();
    }
    @Override
    public String toString(){
        return this.id+" "+this.name+this.phong+" "+this.ngay+" "+this.tien;
    }
}