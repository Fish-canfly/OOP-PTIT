import java.util.*;
import java.io.*;
public class J08012{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList <ArrayList<Integer>> li=new ArrayList<>();
        for(int i=0;i<=n;++i) li.add(new ArrayList<>());
        while(n-->1){
            int a=sc.nextInt(),b=sc.nextInt();
            ArrayList <Integer> u=li.get(a);
            ArrayList <Integer> v=li.get(b);
            u.add(b); v.add(a);
            li.set(a,u);
            li.set(b,v);
        }
        String res="No";
        for(ArrayList<Integer> it: li){
            if(it.size()>1){
                if(it.size()==li.size()-2){
                    res="Yes";
                }
                else{
                    res="No";
                }
                break;
            }
        }
        System.out.println(res);
    }
}