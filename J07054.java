import java.util.*;
import java.io.*;
public class J07054{
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc=new Scanner(new File("BANGDIEM.in"));
        int t=Integer.parseInt(sc.nextLine());
        ArrayList <Thisinh> li=new ArrayList<>();
        while(t-->0){
            li.add(new Thisinh(sc.nextLine(),
                        Integer.parseInt(sc.nextLine()),
                        Integer.parseInt(sc.nextLine()),
                        Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(li,(Thisinh a,Thisinh b) -> Double.compare(b.getPoi(),a.getPoi()));
        int cnt=0;
        int rank=1;
        for(int i=0;i<li.size();++i){
            System.out.printf("%s",li.get(i));
            if(i!=0){
                if(li.get(i).getPoi()==li.get(i-1).getPoi()){
                    cnt++;
                    System.out.println(rank);
                }
                else{
                    System.out.println(rank+cnt);
                    rank+=cnt;
                    cnt=1;
                }
            }
            else{
                System.out.println(rank);
                cnt=1;
            }
        }
    }
}
class Thisinh{
    private static int pos=1;
    private String name,id="SV";
    private double poi;
    public Thisinh(String a,int b,int c,int d){
        this.name=chuanhoa(a);
        this.poi=(b*3+c*3+d*2)/8.0;
        this.poi=Math.round(this.poi*100)/100.0;
        if(pos<10) this.id=this.id+"0";
        this.id=this.id+String.valueOf(pos);
        pos++;

    }
    public double getPoi(){
        return this.poi;
    }
    public String chuanhoa(String a){
        String[] lmao=a.trim().toLowerCase().split("\\s+");
        String b="";
        for(String s:lmao){
            b+=s.substring(0,1).toUpperCase()+s.substring(1)+" ";
        }
        return b;
    }
    @Override
    public String toString(){
        return this.id+" "+this.name+String.format("%.2f",this.poi)+" ";
    }
}