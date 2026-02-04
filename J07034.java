import java.util.*;
import java.io.*;
public class J07034{
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc=new Scanner(new File("MONHOC.in"));
        int t=Integer.parseInt(sc.nextLine());
        ArrayList <ArrayList<String>> li= new ArrayList<>();
        while(t-->0){
            ArrayList <String> v=new ArrayList<>();
            v.add(sc.nextLine());
            v.add(sc.nextLine());
            v.add(sc.nextLine());
            li.add(v);
        }
        Collections.sort(li, (a,b) -> a.get(1).compareTo(b.get(1)));
        for(ArrayList <String> it: li){
            for(String s: it){
                System.out.printf("%s ",s);
            }
            System.out.println();
        }
    }
}