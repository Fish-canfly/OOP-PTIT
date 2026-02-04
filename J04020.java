import java.util.*;
import java.io.*;
public class J04020{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break; 
                }
            }
            if(!check) System.out.println(-1);
        }
    }
}
class Pair<A extends Integer,B extends Integer>{
    public A first;
    public B second;
    public static int[] prime=new int[1000001];
    public Pair(A first,B second){
        this.first=first;
        this.second=second;
    }
    public boolean isPrime(){
        if(prime[(Integer)this.first]==0 && prime[(Integer)this.second]==0) return true;
        return false;
    }
    static{
        sang();
    }
    static void sang(){
        prime[0]=1;
        prime[1]=1;
        for(int i=2;i<=1000;++i){
            if(prime[i]==0){
                for(int j=i*i;j<=1000000;j+=i){
                    prime[j]=1;
                }
            }
        }
    }
    @Override
    public String toString(){
        return String.valueOf(this.first)+" "+String.valueOf(this.second);
    }
}