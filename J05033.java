import java.util.*;
import java.io.*;
public class J05033{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList <ArrayList<Integer>> mp= new ArrayList<>();
        for(int i=0;i<t;++i){
            ArrayList <Integer> v= new ArrayList<>();
            for(int j=0;j<3;++j){
                v.add(sc.nextInt());
            }
            mp.add(v);
        }
        Collections.sort(mp, (a,b)->{
            for(int i=0;i<a.size();++i){
                if(a.get(i)!=b.get(i)){
                    return a.get(i)-b.get(i);
                }
            }
            return 0;
        });
        for(ArrayList <Integer> it:mp){
            for(int a:it){
                System.out.printf("%d ",a);
            }
            System.out.println();
        }
    }
}