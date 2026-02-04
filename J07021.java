import java.util.*;
import java.io.*;
public class J07021{
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc=new Scanner(new File("DATA.in"));
        while(sc.hasNextLine()){
            String s=sc.nextLine().trim();
            if(s.equals("END")) break;
            String[] lmao=s.toLowerCase().split("\\s+");
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<lmao.length;++i){
                String c=lmao[i];
                sb.append(c.substring(0,1).toUpperCase()+c.substring(1));
                if(i!=lmao.length-1) sb.append(" ");
            }
            System.out.println(sb.toString());
        }
    }
}