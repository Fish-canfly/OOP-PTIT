import java.util.*;
import java.io.*;
public class J03032{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String[] lmao=sc.nextLine().trim().split("\\s+");
            /*for(String c:lmao){
                System.out.printf("%s ",c);
            }
            System.out.println();*/
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<lmao.length;++i){
                for(int j=lmao[i].length()-1;j>=0;--j){
                    sb.append(lmao[i].charAt(j));
                }
                if(i!=lmao.length-1) sb.append(" ");
            }
            System.out.println(sb.toString());
        }
    }
}