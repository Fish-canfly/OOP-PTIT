import java.util.*;
import java.io.*;
public class J08010{
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc=new Scanner(System.in);
        HashMap <String,Integer> mp=new HashMap<>();
        ArrayList<String> res= new ArrayList<>();
        res.add("");
        while(sc.hasNext()){
            String s=sc.next();
            String r=new StringBuilder(s).reverse().toString();
            if(r.equals(s)){
                if(r.length()>res.get(0).length()){
                    res.clear();
                    res.add(r);
                }
                else if(r.length()==res.get(0).length()){
                    if(!mp.containsKey(r))
                        res.add(r);   
                }
                if(mp.containsKey(s)){
                    mp.put(s,mp.get(s)+1);
                }
                else mp.put(s,1);
            }
        }
        for(String it:res){
            System.out.println(it+" "+mp.get(it));
        }
    }
}