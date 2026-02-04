import java.util.*;
import java.io.*;
public class J03025{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s=sc.next();
            int mid=s.length()/2;
            if(s.length()%2==1) mid++;
            int cnt=0;
            for(int i=0;i<mid;++i){
                if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                    cnt++;
                }
            }
            if(cnt==1){
                System.out.println("YES");
                continue;
            }
            if(cnt==0&&s.length()%2==1){
                System.out.println("YES");
                continue;
            }
            System.out.println("NO");
        }
    }
}

//123456