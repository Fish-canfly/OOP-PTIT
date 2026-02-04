import java.util.*;
import java.io.*;
public class J05017{
    public static void main(String[] args)throws FileNotFoundException,IOException{
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<Dien> li=new ArrayList<>();
        for(int i=1;i<=t;++i){
            li.add(new Dien(String.format("KH%02d",i),
                                sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(li, (Dien a,Dien b)->{
           return Long.compare(b.tong,a.tong); 
        });
        for(Dien it:li) System.out.println(it);
    }
}
class Dien{
    public long chiso,tong;
    public String id,name;
    public Dien(String a,String b,String c,String d){
        this.id=a;
        this.name=b;
        this.chiso=Long.valueOf(d)-Long.valueOf(c);
        if(chiso<=50){
            this.tong=this.chiso*100;
            this.tong+=Math.round(this.tong*2.0/100);
        }
        else if(chiso<=100){
            this.tong=50*100+(this.chiso-50)*150;
            this.tong+=Math.round(this.tong*3.0/100);
        }
        else{
            this.tong=50*100+50*150+(this.chiso-100)*200;
            this.tong+=Math.round(this.tong*5.0/100);
        }
    }
    @Override
    public String toString(){
        return this.id+" "+this.name+" "+this.tong;
    }
}