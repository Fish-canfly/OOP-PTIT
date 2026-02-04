import java.util.*;
import java.io.*;
public class J07058{
    public static void main(String[] args)throws FileNotFoundException{
        Scanner sc=new Scanner(new File("MONHOC.in"));
        ArrayList <ArrayList <String>> li=new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            ArrayList <String> it=new ArrayList<>();
            it.add(sc.nextLine());
            it.add(sc.nextLine());
            it.add(sc.nextLine());
            li.add(it);
        }
        Collections.sort(li, (ArrayList <String> a,ArrayList <String> b)-> a.get(0).compareTo(b.get(0)));
        for(ArrayList <String> it:li){
            System.out.println(it.get(0)+" "+it.get(1)+" "+it.get(2));
        }
    }
}