import java.util.*;
public class J05035{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Intern> li=new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        for(int i=1;i<=t;++i){
            li.add(new Intern(String.valueOf(i),sc.nextLine(),
                                sc.nextLine(),sc.nextLine(),
                                sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(li, (Intern a,Intern b)->{
            return a.getID().compareTo(b.getID());
        });
        t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String cty=sc.nextLine();
            for(Intern it:li){
                if(it.getCty().equals(cty)){
                    System.out.println(it);
                }
            }
        }
    }
}
class Intern{
    private String pos,id,name,lop,mail,cty;
    public Intern(String a,String b,String c,String d,String e,String f){
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
    public String getID(){
        return this.id;
    }
    @Override
    public String toString(){
        return this.pos+" "+this.id+" "+this.name+" "+
                this.lop+" "+this.mail+" "+this.cty;
    }
}