import java.util.*;
import java.io.*;
public class J05064{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<giaovien> li=new ArrayList<>();
        HashMap <String,Integer> mp=new HashMap<>();
        while(t-->0){
            li.add(new giaovien(sc.nextLine(),
                                sc.nextLine(),
                                sc.nextLine()
        ));
        }
        for(giaovien it:li){
            if(it.getRank().equals("HT")){
                if(mp.containsKey("HT"))
                    continue;
                else mp.put("HT",1);
            }
            if(it.getRank().equals("HP")){
                if(mp.containsKey("HP")){
                    if(mp.get("HP")==2)
                        continue;
                    else{
                        mp.put("HP", mp.get("HP")+1);
                    }
                }
                else mp.put("HP",1);
            }
            System.out.println(it);
        }
    }
}
class giaovien{
    private String id, name;
    private long basic,thunhap,bonus,heso;
    public giaovien(String id,String name,String basic){
        this.id=id;
        this.name=name;
        this.basic=Long.parseLong(basic);
        String a=id.substring(0,2);
        switch (a){
            case "HT":
                this.bonus=2000000;
                break;
            case "HP":
                this.bonus=900000;
                break;
            case "GV":
                this.bonus=500000;
                break;
        }
        this.heso=Long.parseLong(id.substring(2));
        this.thunhap=this.basic*this.heso+this.bonus;
    }
    @Override
    public String toString(){
        return this.id+" "+this.name+" "+this.heso+" "+this.bonus+" "+this.thunhap;
    }
    public String getRank(){
        return this.id.substring(0,2);
    }
}