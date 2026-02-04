import java.util.*;
import java.io.*;
public class J07033{
    public static void main(String[] args)throws FileNotFoundException{
        Scanner sc=new Scanner(new File("SINHVIEN.in"));
        int t=Integer.parseInt(sc.nextLine());
        ArrayList <Sinhvien> li=new ArrayList<>();
        while(t-->0){
            li.add(new Sinhvien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(li, new Comparator<Sinhvien>(){
            public int compare(Sinhvien a,Sinhvien b){
                return a.getID().compareTo(b.getID());
            }
        });
        for(Sinhvien it:li){
            System.out.println(it.res());
        }
    }
}
class Sinhvien{
    private String id,name,lop,mail;
    public Sinhvien(String a,String b,String c,String d){
        this.id=a;
        this.name=chuanhoa(b);
        this.lop=c;
        this.mail=d;
    }
    public String chuanhoa(String b){
        String[] lmao=b.toLowerCase().trim().split("\\s+");
        StringBuilder sb=new StringBuilder();
        for(String it:lmao){
            sb.append(it.substring(0,1).toUpperCase()+it.substring(1)+" ");
        }
        return sb.toString();
    }
    public String getID(){
        return this.id;
    }
    public String res(){
        return this.id+" "+this.name+this.lop+" "+this.mail;
    }
}