import java.util.*;
public class J05047{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList <hang> li= new ArrayList<>();
        for(int i=1;i<=t;++i){
            li.add(new hang(sc.nextLine(),
                            Integer.parseInt(sc.nextLine()),
                            Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(li, (hang a,hang b)->{
            return Integer.compare(b.getCK(),a.getCK());
        });
        for(hang it:li){
            System.out.println(it);
        }
    }
}
class hang{
    private String id,name;
    private int chietkhau,tien;
    private static HashMap <String,Integer> mp= new HashMap<>();
    public hang(String name,int num,int per){
        this.name=name;
        this.chietkhau=solve(num,per);
        this.tien=num*per-this.chietkhau;
        this.id=rutgon(name);
        if(mp.containsKey(this.id)){
            mp.put(this.id,mp.get(this.id)+1);
            this.id+=String.format("%02d",mp.get(this.id));
        }
        else{
            mp.put(this.id,1);
            this.id+="01";
        }
    }
    public int solve(int num,int per){
        if(num>10){
            return num*per*5/100;
        }
        else if(num>=8 && num <=10){
            return num*per*2/100;
        }
        else if(num>=5 && num <8){
            return num*per/100;
        }
        return 0;
    }
    public int getCK(){
        return this.chietkhau;
    }
    public String rutgon(String a){
        String[] lmao=a.toUpperCase().split("\\s+");
        return lmao[0].substring(0,1)+lmao[1].substring(0,1);
    }
    @Override
    public String toString(){
        return this.id+" "+this.name+" "+this.chietkhau+" "+this.tien;
    }
}