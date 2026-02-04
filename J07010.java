import java.util.*;
import java.io.*;
public class J07010{
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc=new Scanner(new File("SV.in"));
        int t=Integer.parseInt(sc.nextLine());
        ArrayList <Sinhvien> li= new ArrayList<>();
        while(t-->0){
            li.add(new Sinhvien(sc.nextLine(),
                                sc.nextLine(),
                                sc.nextLine(),
                                Double.parseDouble(sc.nextLine())));
        }
        for(Sinhvien it:li){
            System.out.println(it.res());
        }
    }
}
class Sinhvien{
    private String name,lop,birth,id="B20DCCN";
    private double poi;
    private static int ma=1;
    public Sinhvien(String a,String b,String c,Double d){
        this.name=a; this.lop=b;
        this.birth=chuanhoa(c);
        this.poi=d;
        if(ma<10) id=id+"00"+String.valueOf(ma);
        else if(10<=ma && ma<100) id=id+"0"+String.valueOf(ma);
        else id=id+String.valueOf(ma);
        ma++;
    }
    public String chuanhoa(String c){
        String[] lmao=c.split("/");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<lmao.length;++i){
            if(lmao[i].length()==1) sb.append("0");
            sb.append(lmao[i]);
            if(i!=lmao.length-1) sb.append("/");
        }
        return sb.toString();
    }
    public String res(){
        return this.id+" "+this.name+" "+this.lop+" "+this.birth+" "+String.format("%.2f",this.poi);
    }
}