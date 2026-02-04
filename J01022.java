import java.util.*;
import java.io.*;
public class J01022{
    public static ArrayList <Long> li=new ArrayList<>(93);
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        initli();
        while(t-->0){
            long n=sc.nextLong();
            long k=sc.nextLong();
            backtrack(k,n);
        }
    }
    public static void initli(){
        li.add(0L);
        li.add(1L);
        for(int i=2;i<=93;++i){
            long bruh=li.get(i-2)+li.get(i-1);
            li.add(bruh);
        }
    }
    public static void backtrack(long k,long n){
        if(n==1){
            System.out.println("0");
            return;
        }
        else if(n==2){
            System.out.println("1");
            return;
        }
        if(k<=li.get((int)n-2)){
            backtrack(k,n-2);
        }
        else{
            backtrack(k-li.get((int)n-2),n-1);
        }
    }
}