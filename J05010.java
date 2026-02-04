import java.util.*;
public class J05010{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList <ArrayList <String>> li=new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        for(int i=1;i<=t;++i){
            ArrayList <String> it=new ArrayList<>();
            it.add(String.valueOf(i));
            it.add(sc.nextLine());
            it.add(sc.nextLine());
            double lai=-Double.parseDouble(sc.nextLine())+Double.parseDouble(sc.nextLine());
            it.add(String.format("%.2f",lai));
            li.add(it);
        }
        Collections.sort(li, (ArrayList<String> a,ArrayList <String> b)->{
            double x=Double.parseDouble(a.get(3));
            double y=Double.parseDouble(b.get(3));
            return Double.compare(y,x);
        });
        for(ArrayList<String> it:li){
            System.out.println(it.get(0)+" "+
                                it.get(1)+" "+
                                it.get(2)+" "+
                                it.get(3));
        }
    }
}