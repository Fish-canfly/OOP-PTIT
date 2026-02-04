import java.util.*;
public class J05069{
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
        while(u-->0){
            String s=sc.nextLine();
            String[] lmao=s.split("\\s+");
            String check=lmao[0].substring(1,3);
            System.out.println(lmao[0]+" "+mp.get(check).name+" "+
                                (mp.get(check).price*Long.valueOf(lmao[1])));
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
}