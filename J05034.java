import java.util.*;
public class J05034{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Thuctap> li=new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        for(int i=1;i<=t;++i){
            li.add(new Thuctap(String.valueOf(i),sc.nextLine(),
                                sc.nextLine(),sc.nextLine(),
                                sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(li, (Thuctap a,Thuctap b)->{
            return a.getName().compareTo(b.getName());
        });
        t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String cty=sc.nextLine();
            for(Thuctap it:li){
                if(it.getCty().equals(cty)){
                    System.out.println(it);
                }
            }
        }
    }
}
class Thuctap{
    private String pos,id,name,lop,mail,cty;
    public Thuctap(String a,String b,String c,String d,String e,String f){
        this.pos=a; this.id=b;
        this.name=c; this.lop=d;
        this.mail=e; this.cty=f;
    }
    public String getName(){
        return this.name;
    }
    public String getCty(){
        return this.cty;
    }
    @Override
    public String toString(){
        return this.pos+" "+this.id+" "+this.name+" "+
                this.lop+" "+this.mail+" "+this.cty;
    }
}