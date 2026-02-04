import java.util.*;
import java.io.*;
public class J03013{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String a=sc.next();
            String b=sc.next();
            if(a.length()>b.length()){
                b=canbang(b,a.length()-b.length());
            }
            else{
                String temp=canbang(a,b.length()-a.length());
                a=b;
                b=temp;
            }
            if(a.compareTo(b)<0){
                String temp=a;
                a=b;
                b=temp;
            }
            //System.out.printf("%s %s\n",a,b);
            System.out.println(hieu(a,b));
        }
    }
    static String canbang(String x,int gap){
        StringBuilder sb=new StringBuilder();
        sb.append(x);
        for(int i=0;i<gap;++i){
            sb.insert(0,"0");
        }
        return sb.toString();
    }
    static String hieu(String a,String b){
        StringBuilder sb=new StringBuilder();
        int nho=0;
        for(int i=a.length()-1;i>=0;--i){
            int x=a.charAt(i)-'0';
            int y=b.charAt(i)-'0';
            //System.out.printf("%d %d\n",x,y);
            x-=y+nho;
            nho=0;
            //System.out.println(x);
            if(x<0){
                x+=10;
                nho=1;
            }
            sb.insert(0,String.valueOf(x));
        }
        return sb.toString();
    }
}