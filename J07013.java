import java.util.*;
import java.io.*;
import java.time.*;
import java.time.format.*;
import java.text.*;
public class J07013{
    public static void main(String[] args) throws ClassNotFoundException,IOException,FileNotFoundException{
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("SV.in"));
        ArrayList<Sinhvien> li=(ArrayList<Sinhvien>) ois.readObject();
        for(int i=0;i<li.size();++i){
            System.out.println(li.get(i));
        }
        ois.close();
    }
}
class Sinhvien implements Serializable{
    private String id,name,lop,dob;
    private float diem;
    public Sinhvien(int id,String ten,String lop,String dob,float diem){
        this.id=String.format("B20DCCN%03d",id+1);
        this.name=ten;
        this.lop=lop;
        this.dob=chuanhoa(dob);
        this.diem=diem;
    }
    public String chuanhoa(String s){
        String[] lmao=s.split("/");
        for(int i=0;i<2;++i){
            if(lmao[i].length()==1) lmao[i]="0"+lmao[i];
        }
        return lmao[0]+"/"+lmao[1]+"/"+lmao[2];
    }
    @Override
    public String toString(){
        return this.id+" "+this.name+" "+this.lop+" "+this.dob+" "+
                    String.format("%.2f",this.diem);
    }
} 