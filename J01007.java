import java.util.*;
import java.io.*;
public class J01007{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        HashSet<Long> ha=new HashSet<>();
        ha.add(0L);
        ha.add(1L);
        long a=1,b=1;
        long c,i=0;
        while(true){
            c=a+b;
            if(i<93){
                ha.add(c);
                a=b;
                b=c;
            }
            else{
                break;
            }
            ++i;
        }
        /*for (int i=0; i<93; ++i){
            c = a + b;
            ha.add(c);
            a = b; 
            b = c;
        }*/
        /*for(long x:ha){
            System.out.println(x);
        }*/
        while(t-->0){
            long n=sc.nextLong();
            if(ha.contains(n)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}