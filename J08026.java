import java.util.*;
import java.io.*;
import java.time.*;
import java.time.format.*;
public class J08026{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            int[] mp=new int[1000001];
            Queue<Pair<Integer,Integer>> q=new LinkedList<>();
            int n=sc.nextInt();
            int m=sc.nextInt();
            q.offer(new Pair<>(n,0));
            while(!q.isEmpty()){
                Pair<Integer,Integer> a=q.poll();
                if(a.first==m){
                    System.out.println(a.second);
                    break;
                }
                if(mp[a.first-1]==0 && a.first-1>0){
                    q.offer(new Pair<>(a.first-1,a.second+1));
                    mp[a.first-1]=1;
                }
                if(mp[a.first*2]==0 && a.first*2<=10000){
                    q.offer(new Pair<>(a.first *2,a.second+1));
                    mp[a.first*2]=1;
                }
            }
        }
    }
}
class Pair<A extends Integer,B extends Integer>{
    public A first;
    public B second;
    public Pair(A first, B second){
        this.first=first;
        this.second=second;
    }
}