import java.util.*;
import java.io.*;
public class J03010{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        String tail="@ptit.edu.vn";
        HashMap<String,Integer> mp=new HashMap<>();
        while(t-->0){
            String s=sc.nextLine();
            String[] lmao=s.trim().split("\\s+");
            StringBuilder sb= new StringBuilder();
            sb.append(lmao[lmao.length-1].toLowerCase());
            for(int i=0;i<lmao.length-1;++i){
                sb.append(lmao[i].toLowerCase().charAt(0));
            }
            String res=sb.toString();
            if(mp.containsKey(res)){
                mp.put(res,mp.get(res)+1);
            }
            else{
                mp.put(res,1);
            }
            System.out.print(res);
            if(mp.get(res)>1){
                System.out.print(mp.get(res));
            }
            System.out.println(tail);
        }
    }
}