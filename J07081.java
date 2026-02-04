import java.util.*;
import java.io.*;
public class J07081{
    public static void main(String[] arg) throws FileNotFoundException{
        Scanner sc=new Scanner(new File("SINHVIEN.in"));
        ArrayList <ArrayList <String>> li=new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            ArrayList <String> it=new ArrayList<>();
            it.add(sc.nextLine());
            it.add(sc.nextLine());
            it.add(sc.nextLine());
            it.add(sc.nextLine());
            li.add(it);
        }
        Collections.sort(li, (ArrayList <String> a,ArrayList <String> b)->{
            String t1=a.get(1).substring(a.get(1).lastIndexOf(" ")+1);
            String t2=b.get(1).substring(b.get(1).lastIndexOf(" ")+1);
            String h1=a.get(1).substring(0,a.get(1).lastIndexOf(" "));
            String h2=b.get(1).substring(0,b.get(1).lastIndexOf(" "));
            if(t1.equals(t2)){
                if(h1.equals(h2)){
                    return a.get(0).compareTo(b.get(0));
                }
                return h1.compareTo(h2);
            }
            return t1.compareTo(t2);
        });
        for(ArrayList <String> it:li){
            System.out.println(it.get(0)+" "+it.get(1)+" "+it.get(2)+" "+
                                it.get(3));
        }
    }
}
//ac//