import java.util.*;
public class J05043{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<tratien> li=new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        for(int i=1;i<=t;++i){
            String id="NV"+String.format("%02d",i);
            li.add(new tratien(id,sc.nextLine(),
                                sc.nextLine(),
                                Integer.parseInt(sc.nextLine()),
                                Integer.parseInt(sc.nextLine())));
        }
        for(tratien it:li){
            System.out.println(it);
        }
    }
}
class tratien{
    private String id,name,rank;
    private int bonus=100, thang, tong, tamung=25000;
    public tratien(String id, String name,String rank, int ngay, int num){
        this.id=id;
        this.name=name;
        this.rank=rank;
        this.thang=ngay*num;
        switch(rank){
            case "GD":
                this.bonus=500;
                break;
            case "PGD":
                this.bonus=400;
                break;
            case "TP":
                this.bonus=300;
                break;
            case "KT":
                this.bonus=250;
                break;
        }
        this.tong=this.bonus+this.thang;
        if((this.tong)*2/3<25000){
            this.tamung=lamtron(Math.round((double)this.tong*2/3.0));
        }
    }
    public int lamtron(double a){
        return (int)Math.round(a/1000)*1000;
    }
    @Override
    public String toString(){
        return this.id+" "+this.name+" "+this.bonus+" "+this.thang+" "+this.tamung
                +" "+(this.tong-this.tamung);
    }
}