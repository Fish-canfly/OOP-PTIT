import java.util.*;
import java.io.*;
public class J02014{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            ArrayList <Integer> li=new ArrayList<>(n);
            int left=0;
            int right=0;
            for(int i=0;i<n;++i){
                int x=sc.nextInt();
                right+=x;
                li.add(x);
            }
            int res=-1;
            for(int i=0;i<n;++i){
                if(i!=0){
                    left+=li.get(i-1);
                }
                right-=li.get(i);
                if(left==right){
                    res=i+1;
                    break;
                }
            }
            System.out.println(res);
        }
    }
}