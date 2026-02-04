import java.util.*;
import java.io.*;
public class J03024{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s=sc.next();
            int chan=0,le=0;
            boolean check=true;
            for(int i=0;i<s.length();++i){
                if(Character.isDigit(s.charAt(i))){
                    int a=s.charAt(i)-'0';
                    if(a%2==0) chan++;
                    else le++;
                }
                else{
                    System.out.println("INVALID");
                    check=false;
                    break;
                }
            }
            if(check){
                System.out.println(res(chan,le,s.length()));
            }
        }
    }
    static String res(int chan,int le,int len){
        if(chan>le){
            if(len%2==0) return "YES";
            return "NO";
        }
        else if(le>chan){
            if(len%2!=0) return "YES";
            return "NO";
        }
        return "NO";
    }
}