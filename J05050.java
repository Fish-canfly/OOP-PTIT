import java.util.*;
public class J05050{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList <khachHang> li=new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        for(int i=1;i<=t;++i){
            String id="KH"+String.format("%02d",i);
            li.add(new khachHang(id,sc.nextLine(),
                                    Long.parseLong(sc.nextLine()),
                                    Long.parseLong(sc.nextLine())));
        }
        for(khachHang it:li) System.out.println(it);
    }
}
class khachHang{
    private String id;
    private long heso,thanhtien,phutroi=0,tong;
    public khachHang(String id,String name,long chisocu,long chisomoi){
        this.id=id;
        switch(name){
            case "KD":
                this.heso=3;
                break;
            case "NN":
                this.heso=5;
                break;
            case "TT":
                this.heso=4;
                break;
            case "CN":
                this.heso=2;
                break;
        }
        this.thanhtien=(chisomoi-chisocu)*this.heso*550;
        if((chisomoi-chisocu)>=50 && (chisomoi-chisocu)<=100){
            this.phutroi=Math.round(this.thanhtien*35/100.0);
        }
        else if((chisomoi-chisocu)>100){
            this.phutroi=this.thanhtien;
        }
    }
    @Override
    public String toString(){
        return this.id+" "+this.heso+" "+this.thanhtien
                +" "+this.phutroi+" "+(this.thanhtien+this.phutroi);
    }
}