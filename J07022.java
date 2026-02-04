import java.util.*;
import java.io.*;
public class J07022{
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc=new Scanner(new File("DATA.in"));
        ArrayList <String> li= new ArrayList<>();
        while(sc.hasNext()){
            if(!sc.hasNextInt()){
                li.add(sc.next());
            }
            else{
                sc.nextInt();
            }
        }
        Collections.sort(li,(a,b)-> a.compareTo(b));
        for(String s:li){
            System.out.printf("%s ",s);
        }
    }
}