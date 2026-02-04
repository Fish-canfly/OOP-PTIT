import java.util.*;
public class J05052{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList <donhang> li= new ArrayList<>();
        while(t-->0){
            li.add(new donhang(sc.nextLine(),
                                sc.nextLine(),
                                Long.parseLong(sc.nextLine()),
                                Long.parseLong(sc.nextLine())));
        }
        for(donhang it:li) System.out.println(it);
    }
}
class donhang{
    private String id,name,pos;
    private long giamgia,thanhtien;
    public donhang(String name,String id,long gia,long num){
        this.id=id;
        this.name=name;
        this.pos=id.substring(1,4);
        switch(id.charAt(id.length()-1)){
            case '1':
                this.giamgia=num*gia/2;
                break;
            case '2':
                this.giamgia=num*gia*30/100;
                break;
        }
        this.thanhtien=num*gia-this.giamgia;
    }
    @Override
    public String toString(){
        return this.name+" "+this.id+" "+this.pos+" "+
                this.giamgia+" "+this.thanhtien;
    }
}