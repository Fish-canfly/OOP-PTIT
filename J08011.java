import java.util.*;
public class J08011{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        HashMap <Long,Integer> mp=new HashMap<>();
        ArrayList <Long> res=new ArrayList<>();
        while(sc.hasNext()){
            long a=sc.nextLong();
            //System.out.println(check(a));
            if(check(a)){
                if(mp.containsKey(a)){
                    mp.put(a,mp.get(a)+1);
                }
                else{
                    res.add(a);
                    mp.put(a,1);
                }
            }
        }
        Collections.sort(res,(Long a,Long b)->{
            return Integer.compare(mp.get(b),mp.get(a));
        });
        for(long it:res){
            System.out.println(it+" "+mp.get(it));
        }
        sc.close();
    }
    static boolean check(long b){
        long a=b;
        long temp=10000000000L;
        while(a>0){
            long du=a%10;
            if(du>temp) return false;
            a/=10;
            temp=du;
        }
        return true;
    }
}