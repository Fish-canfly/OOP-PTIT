import java.util.*;
import java.io.*;
public class J05029{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<Company> li=new ArrayList<>();
        while(t-->0){
            li.add(new Company(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(li, (Company a,Company b)->{
            if(a.getNum()==b.getNum()) return a.getID().compareTo(b.getID());
            return Integer.compare(b.getNum(),a.getNum());
        });
        t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            int start=sc.nextInt(),end=sc.nextInt();
            System.out.printf("DANH SACH DOANH NGHIEP NHAN TU %d DEN %d SINH VIEN:\n",start,end);
            for(Company it:li){
                if(it.getNum()<=end && it.getNum()>=start)
                    System.out.println(it);
            }
        }
    }
}
class Company{
    private String id,name;
    private int num;
    public Company(String a,String b,int c){
        this.id=a; this.name=b;
        this.num=c;
    }
    public int getNum(){
        return this.num;
    }
    public String getID(){
        return this.id;
    }
    @Override
    public String toString(){
        return this.id+" "+this.name+" "+this.num;
    }
}