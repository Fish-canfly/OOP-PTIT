import java.util.*;
import java.io.*;
public class J07037{
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc=new Scanner(new File("DN.in"));
        int t=Integer.parseInt(sc.nextLine());
        ArrayList <Doanhnghiep> li= new ArrayList<>();
        while(t-->0){
            li.add(new Doanhnghiep(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(li, (Doanhnghiep a,Doanhnghiep b) -> a.getId().compareTo(b.getId()));
        for(Doanhnghiep it:li){
            System.out.println(it.res());
        }
    }
}
class Doanhnghiep{
    private String id, name, num;
    public Doanhnghiep(String a,String b,int c){
        this.id=a;
        this.name=b;
        this.num=String.valueOf(c);
    }
    public String getId(){
        return this.id;
    }
    public String res(){
        return this.id+" "+this.name+" "+this.num;
    }
}