import java.util.*;
public class J05070{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        HashMap <String,clb> mp=new HashMap<>();
        while(t-->0){
            String id=sc.nextLine();
            clb a=new clb(sc.nextLine(), Long.parseLong(sc.nextLine()));
            mp.put(id,a);
        }
        int u=Integer.parseInt(sc.nextLine());
        ArrayList<ArrayList<String>> li=new ArrayList<>();
        while(u-->0){
            String s=sc.nextLine();
            String[] lmao=s.split("\\s+");
            String check=lmao[0].substring(1,3);
            ArrayList<String> it=new ArrayList<>();
            it.add(lmao[0]);
            it.add(mp.get(check).name);
            it.add(String.valueOf(mp.get(check).price*Long.valueOf(lmao[1])));
            li.add(it);
        }
        Collections.sort(li, (ArrayList<String> a,ArrayList<String> b)->{
            return Long.compare(Long.valueOf(b.get(2)),Long.valueOf(a.get(2)));
        });
        for(ArrayList<String> it:li){
            System.out.println(it.get(0)+" "+it.get(1)+" "+it.get(2));
        }
    }
}
class clb{
    public String name;
    public long price;
    public clb(String name,long price){
        this.name=name;
        this.price=price;
    }
    public void gia(long b){
        this.price=this.price*b;
    }
}