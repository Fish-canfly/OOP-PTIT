import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class J03040{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s=sc.nextLine();
            StringBuilder sb=new StringBuilder();
            s=s.substring(5);
            String[] lmao=s.split("\\.");
            sb.append(lmao[0]+lmao[1]);
            System.out.println(res(sb));
        }
    }
    static String res(StringBuilder sb){
        boolean check1=true,check2=true,check3=true,check4=true;
        for(int i=0;i<sb.length()-1;++i){
            int a=sb.charAt(i)-'0';
            int b=sb.charAt(i+1)-'0';
            //System.out.println(a);
            //System.out.println(b);
            if(b-a!=1 && check1){
                check1=false;
            }
            if(b!=a){
                if(check2) check2=false;
                if(i<2||i>=3){
                    check3=false;
                }
            }
            if(check4){
                if(a!=6 && a!=8){
                    check4=false;
                }
                if(i==sb.length()-2){
                    if(b!=6 && b!=8){
                        check4=false;
                    }
                }
            }
            if(!check1 && !check2 && !check3 && !check4){
                return "NO";
            }
        }
        return "YES";
    }
}