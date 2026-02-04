import java.util.*;
import java.io.*;
public class J07056{
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc=new Scanner(new File("KHACHHANG.in"));
        int t=Integer.parseInt(sc.nextLine());
        ArrayList <GiaDinh> li=new ArrayList<>();
        while(t-->0){
            li.add(new GiaDinh(sc.nextLine(),
                                sc.nextLine()));
        }
        Collections.sort(li, (GiaDinh a,GiaDinh b)-> Integer.compare(b.getTotal(),a.getTotal()));
        for(GiaDinh it:li){
            System.out.println(it);
        }
    }
}
class GiaDinh{
    private static int pos=1;
    private String id="KH",name;
    private int limit,unlimit,total,vat=0;
    public GiaDinh(String a,String b){
        this.name=chuanhoa(a);
        String[] lol=b.split("\\s+");
        solve(lol);
        if(pos<10) id+="0";
        id+=String.valueOf(pos);
        pos++;
    }
    public String chuanhoa(String a){
        String[] lmao=a.trim().toLowerCase().split("\\s+");
        String c="";
        for(String s: lmao){
            c+=s.substring(0,1).toUpperCase()+s.substring(1)+" ";
        }
        return c;
    }
    public void solve(String[] lol){
        int base=0;
        switch(lol[0]){
            case "A":
                base=100;
                break;
            case "B":
                base=500;
                break;
            case "C":
                base=200;
                break;
        }
        int gap=Integer.parseInt(lol[2])-Integer.parseInt(lol[1]);
        if(gap<=base){
            this.limit=gap*450;
            this.unlimit=0;
        }
        else{
            this.limit=base*450;
            this.unlimit=(gap-base)*1000;
            this.vat=unlimit*5/100;
        }
        this.total=this.limit+this.unlimit+this.vat;
    }
    public int getTotal(){
        return this.total;
    }
    @Override
    public String toString(){
        return this.id+" "+this.name+String.valueOf(this.limit)+" "+String.valueOf(this.unlimit)+" "+String.valueOf(this.vat)
            +" "+String.valueOf(this.total);
    }
}