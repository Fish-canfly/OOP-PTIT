import java.util.*;
public class J05012{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<goods> li=new ArrayList<>();
        for(int i=1;i<=t;++i){
            li.add(new goods(sc.nextLine(),
                            sc.nextLine(),
                            sc.nextLine(),
                            sc.nextLine(),
                            sc.nextLine()));
        }
        Collections.sort(li, (goods a,goods b)->{
            return Long.compare(b.tien,a.tien);
        });
        for(goods it:li) System.out.println(it);
    }   
}
class goods{
    public String id,name;
    public long num,dongia,chietkhau,tien;
    public goods(String id,String name,String num,String dongia, String chietkhau){
        this.id=id;
        this.name=name;
        this.num=Long.valueOf(num);
        this.dongia=Long.valueOf(dongia);
        this.chietkhau=Long.valueOf(chietkhau);
        this.tien=this.dongia*this.num-this.chietkhau;
    }
    @Override
    public String toString(){
        return this.id+" "+this.name+" "+this.num+" "+this.dongia+" "+
                this.chietkhau+" "+this.tien;
    }
}