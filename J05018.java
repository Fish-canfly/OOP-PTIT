import java.util.*;
import java.io.*;
public class J05018{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList <ArrayList<String>> li= new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        for(int i=1;i<=t;++i){
            ArrayList <String> it=new ArrayList<>();
            String id="HS";
            if(i<10) id+="0";
            id+=String.valueOf(i);
            it.add(id);
            it.add(chuanhoa(sc.nextLine()));
            String[] lmao=sc.nextLine().split("\\s+");
            double tong=(Double.parseDouble(lmao[0])*2+Double.parseDouble(lmao[1])*2+
                        Double.parseDouble(lmao[2])+Double.parseDouble(lmao[3])+
                        Double.parseDouble(lmao[4])+Double.parseDouble(lmao[5])+
                        Double.parseDouble(lmao[6])+Double.parseDouble(lmao[7])+
                        Double.parseDouble(lmao[8])+Double.parseDouble(lmao[9]))/12.0;
            it.add(String.format("%.1f",Math.round(tong*10.0)/10.0));
            if(tong<5) it.add("YEU");
            else if(tong<7) it.add("TB");
            else if(tong < 8) it.add("KHA");
            else if(tong <9) it.add("GIOI");
            else it.add("XUAT SAC");
            li.add(it);
        }
        Collections.sort(li,(ArrayList<String> a,ArrayList <String> b)->{
            return Double.compare(Double.parseDouble(b.get(2)),Double.parseDouble(a.get(2)));
        });
        for(ArrayList<String> it:li){
            System.out.println(it.get(0)+" "+it.get(1)+it.get(2)+" "+it.get(3));
        }
    }
    static String chuanhoa(String s){
        String res="";
        String[] lol=s.trim().toLowerCase().split("\\s+");
        for(String r:lol){
            res+=r.substring(0,1).toUpperCase()+r.substring(1)+" ";
        }
        return res;
    }
}