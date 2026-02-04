import java.util.*;
public class J05040{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<nhanvien> li=new ArrayList<>();
        for(int i=1;i<=t;++i){
            String id="NV"+String.format("%02d",i);
            li.add(new nhanvien(id,sc.nextLine(),
                                Integer.parseInt(sc.nextLine()),
                                Integer.parseInt(sc.nextLine()),
                                sc.nextLine()));
        }
        for(nhanvien it:li){
            System.out.println(it);
        }
    }
}
class nhanvien{
    private String id,name,rank;
    private int thang, reward,bonus=0, res;
    public nhanvien(String id,String name,int ngay,int num, String rank){
        this.id=id;
        this.name=name;
        this.rank=rank;
        this.thang=ngay*num;
        this.reward=0;
        if(num>=25) this.reward=this.thang*20/100;
        else if(num>=22) this.reward=this.thang*10/100;
        switch(rank){
            case "GD":
                this.bonus=250000;
                break;
            case "PGD":
                this.bonus=200000;
                break;
            case "TP":
                this.bonus=180000;
                break;
            case "NV":
                this.bonus=150000;
                break;
        }
        this.res=this.thang+this.reward+this.bonus;
    }
    @Override
    public String toString(){
        return this.id+" "+this.name+" "+
                this.thang +" "+ this.reward+" "+this.bonus+" "+
                this.res;
    }
}