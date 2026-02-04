import java.util.*;
public class J05068{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<Xangdau> li=new ArrayList<>();
        while(t-->0){
            li.add(new Xangdau(sc.nextLine()));
        }
        Collections.sort(li, (Xangdau a,Xangdau b)->{
            return Long.compare(b.getTien(),a.getTien());
        });
        for(Xangdau it:li) System.out.println(it);
    }
}
class Xangdau{
    private String id,hang;
    private long num,dongia,thue,thanhtien;
    public Xangdau(String s){
        String[] lmao=s.split("\\s+");
        this.id=lmao[0];
        this.num=Long.valueOf(lmao[1]);
        switch(this.id.charAt(0)){
            case 'X':
                this.dongia=(long)128000;
                this.thue=this.dongia*this.num*3/100;
                break;
            case 'D':
                this.dongia=(long)11200;
                this.thue=this.dongia*this.num*35/1000;
                break;
            case 'N':
                this.dongia=(long)9700;
                this.thue=this.dongia*this.num*2/100;
                break;
        }
        switch(this.id.substring(3)){
            case "BP":
                this.hang="British Petro";
                break;
            case "ES":
                this.hang="Esso";
                break;
            case "SH":
                this.hang="Shell";
                break;
            case "CA":
                this.hang="Castrol";
                break;
            case "MO":
                this.hang="Mobil";
                break;
            case "TN":
                this.hang="Trong Nuoc";
                this.thue=0;
                break;
        }
        this.thanhtien=this.dongia*this.num+this.thue;
    }
    @Override
    public String toString(){
        return this.id+" "+this.hang+" "+this.dongia+" "+
                this.thue+" "+this.thanhtien;
    }
    public long getTien(){
        return this.thanhtien;
    }
}