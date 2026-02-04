import java.util.*;
import java.io.*;
public class J02037{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String[] mp=sc.nextLine().split("\\s+");
            int chan=0;
            int le=0;
            for(String s:mp){
                if(Integer.parseInt(s)%2==0){
                    chan++;
                }
                else le++;
            }
            if(chan>le){
                if(mp.length%2==0) System.out.println("YES");
                else System.out.println("NO");
            }
            else if(le>chan){
                if(mp.length%2!=0) System.out.println("YES");
                else System.out.println("NO");
            }
            else System.out.println("NO");
        }
    }
}