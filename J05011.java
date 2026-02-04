import java.util.*;
import java.io.*;
import java.time.*;
import java.time.format.*;
import java.time.temporal.*;
public class J05011{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<ArrayList<String>> li= new ArrayList<>();
        while(t-->0){
            ArrayList <String> it=new ArrayList<>();
            it.add(sc.nextLine());
            it.add(chuanhoa(sc.nextLine()));
            it.add(hieu(sc.nextLine(),sc.nextLine()));
            li.add(it);
        }
        Collections.sort(li, (ArrayList<String> a,ArrayList<String> b)->{
            return Integer.compare(Integer.parseInt(b.get(2)),Integer.parseInt(a.get(2)));
        });
        for(ArrayList <String> it:li){
            System.out.print(it.get(0)+" "+it.get(1));
            int min=Integer.parseInt(it.get(2));
            int hour= min/60;
            min=min-hour*60;
            System.out.println(hour+" gio "+min+" phut");
        }
    }
    static String hieu(String a,String b){
        DateTimeFormatter tf= DateTimeFormatter.ofPattern("HH:mm");
        LocalTime x= LocalTime.parse(a,tf);
        LocalTime y= LocalTime.parse(b,tf);
        return String.valueOf(ChronoUnit.MINUTES.between(x,y));
    }
    static String chuanhoa(String s){
        String[] lmao=s.trim().toLowerCase().split("\\s+");
        String res="";
        for(String r:lmao){
            res+=r.substring(0,1).toUpperCase()+r.substring(1)+" ";
        }
        return res;
    }
}