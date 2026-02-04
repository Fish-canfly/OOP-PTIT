import java.util.*;
import java.io.*;
public class J05031{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<CollegeStu> li=new ArrayList<>();
        for(int i=0;i<t;++i){
            li.add(new CollegeStu(sc.nextLine(),sc.nextLine(),sc.nextLine(),
                                    sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(li, (CollegeStu a,CollegeStu b)->{
            if(a.getName().equals(b.getName())) return a.getID().compareTo(b.getID());
            return a.getName().compareTo(b.getName());
        });
        for(int i=0;i<t;++i){
            System.out.println((i+1)+" "+li.get(i));
        }
    }
}
class CollegeStu{
    private String id,name,lop,p1,p2,p3;
    public CollegeStu(String a,String b,String c, String d, String e, String f){
        this.id=a;
        this.name=b;
        this.lop=c;
        this.p1=d;
        this.p2=e;
        this.p3=f;
    }
    public String getID(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    @Override
    public String toString(){
        return this.id+" "+this.name+" "+this.lop+" "+this.p1+" "+this.p2+" "+this.p3;
    }
}