import java.util.*;
public class J03020{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList <String> res=new ArrayList<>();
        HashMap <String,Integer> mp=new HashMap<>();
        int maxlen=0;
        while(sc.hasNext()){
            String s=sc.next();
            String r=new StringBuilder(s).reverse().toString();
            if(s.equals(r)){
                if(s.length() == maxlen){
                    if(!mp.containsKey(s)){
                        res.add(s);
                    }
                }
                else if(s.length() > maxlen){
                    maxlen=s.length();
                    res=new ArrayList<>();
                    res.add(s);
                }
                if(mp.containsKey(s)){
                    mp.put(s,mp.get(s)+1);
                }
                else{
                    mp.put(s,1);
                }
            }
        }
        for(String s:res){
            System.out.println(s+" "+mp.get(s));
        }
    }
}