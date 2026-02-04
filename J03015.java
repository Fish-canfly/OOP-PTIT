import java.util.*;
import java.io.*;
public class J03015{
    private static boolean swap=false;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        a=xoa(a);
        b=xoa(b);
        if(a.length()>b.length()){
            b=canbang(b,a.length()-b.length());
        }
        else{
            a=canbang(a,b.length()-a.length());
        }
        if(a.compareTo(b)<0){
            String temp=a;
            a=b;
            b=temp;
            swap=true;
        }
        //System.out.printf("%s %s\n",a,b);
        String res=xoa(hieu(a,b));
        if(swap) res="-"+res;
        System.out.println(res);
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
            x-=y+nho;
            nho=0;
            if(x<0&&i>0){
                x+=10;
                nho=1;
            }
            sb.insert(0,String.valueOf(x));
        }
        return sb.toString();
    }
    static String xoa(String x){
        StringBuilder sb=new StringBuilder(x);
        while(sb.charAt(0)=='0'&&sb.length()>1){
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }
}