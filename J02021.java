import java.util.*;
import java.io.*;
public class J02021{
    private static int cnt=0;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=sc.nextInt();
        StringBuilder sb=new StringBuilder();
        tohop(n,k,0,0,sb);
        System.out.println();
        System.out.println("Tong cong co " + cnt + " to hop");
    }
    static void tohop(int n,int k,int pos, int value, StringBuilder sb){
        if(pos!=0){
            sb.append(String.valueOf(value));
            if(pos==k){
                System.out.printf(sb.toString()+" ");
                ++cnt;
                return;
            }
        }
        pos++;
        int start=value+1;
        int end=n-k+pos;
        for(int i=start;i<=end;++i){
            int len=sb.length();
            tohop(n,k,pos,i,sb);
            sb.setLength(len);
        }
    }
}