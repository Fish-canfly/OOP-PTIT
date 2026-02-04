import java.util.*;
import java.io.*;
public class J07073{
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc=new Scanner(new File("MONHOC.in"));
        int t=Integer.parseInt(sc.nextLine());
        ArrayList <ArrayList <String>> li= new ArrayList<>();
        while(t-->0){
            ArrayList <String> it=new ArrayList<>();
            it.add(sc.nextLine());
            it.add(sc.nextLine());
            it.add(sc.nextLine());
            it.add(sc.nextLine());
            it.add(sc.nextLine());
            li.add(it);
        }
        Collections.sort(li, (ArrayList <String> a, ArrayList<String> b) ->{
            return a.get(0).compareTo(b.get(0));
        });
        for(ArrayList <String> it: li){
            if(!it.get(4).equals("Truc tiep")){
                System.out.println(it.get(0)+" "+
                                    it.get(1)+" "+
                                    it.get(2)+" "+
                                    it.get(3)+" "+
                                    it.get(4));
            }
        }
    }
}