import java.util.*;
import java.io.*;
public class J08024{
    static long solve(Queue<Long> q,long n){
        q.add(9L);
        while(true){
            long a=q.poll();
            if(a%n==0) return a;
            q.add(a*10+0);
            q.add(a*10+9);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            long n=sc.nextLong();
            Queue<Long> q=new LinkedList<>();
            System.out.println(solve(q,n));
        }
    }
}