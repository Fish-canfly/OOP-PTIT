import java.util.*;
import java.io.*;
public class J07040{
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        Scanner sc=new Scanner(new File("VANBAN.in"));
        ArrayList <String> lol= (ArrayList <String>) ois.readObject();
        HashSet <String> h1= new HashSet<>();
        HashSet <String> h2= new HashSet<>();
        ArrayList <String> li= new ArrayList<>();
        for(String s: lol){
            String[] lmao=s.trim().toLowerCase().split("\\s+");
            for(String r:lmao){
                h1.add(r);
            }
        }
        ArrayList <String> mp= new ArrayList<>();
        while(sc.hasNext()){
            String s=sc.next().toLowerCase();
            if(!h2.contains(s)){
                mp.add(s);
                h2.add(s);
            }
        }
        for(String s:mp){
            if(h1.contains(s) && h2.contains(s)){
                System.out.println(s);
            }
        }
    }
}