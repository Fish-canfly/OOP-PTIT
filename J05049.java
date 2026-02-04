import java.util.*;
public class J05049{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<Nhapxuat> li=new ArrayList<>();
        while(t-->0){
            li.add(new Nhapxuat(sc.nextLine(),
                                Long.parseLong(sc.nextLine())));
        }
        String s=sc.nextLine();
        Collections.sort(li, (Nhapxuat a,Nhapxuat b)->{
            return Long.compare(b.getThue(),a.getThue());
        });
        for(Nhapxuat it:li){
            if(it.check().equals(s))  System.out.println(it);
        }
    }
}
class Nhapxuat{
    private String id;
    private long num_nhap,num_xuat,gia,tien,thue;
    public Nhapxuat(String id,long num_nhap){
        this.id=id;
        this.num_nhap=num_nhap;
        switch (id.charAt(0)){
            case 'A':
                this.num_xuat=Math.round(this.num_nhap*60.0/100);
                break;
            case 'B':
                this.num_xuat=Math.round(this.num_nhap*70.0/100);
                break;
        }
        switch (id.charAt(id.length()-1)){
            case 'Y':
                this.gia=110000;
                break;
            case 'N':
                this.gia=135000;
                break;
        }
        this.tien=this.num_xuat*this.gia;
        if(id.charAt(0)=='A' && id.charAt(id.length()-1)=='Y') this.thue=this.tien*8/100;
        else if(id.charAt(0)=='A' && id.charAt(id.length()-1)=='N') this.thue=this.tien*11/100;
        else if(id.charAt(0)=='B' && id.charAt(id.length()-1)=='Y') this.thue=this.tien*17/100;
        else this.thue=this.tien*22/100;
        
    }
    @Override
    public String toString(){
        return this.id+" "+this.num_nhap+" "+this.num_xuat+" "+
                this.gia+" "+this.tien+" "+this.thue;
    }
    public String check(){
        return this.id.substring(0,1);
    }
    public Long getThue(){
        return this.thue;
    }
}