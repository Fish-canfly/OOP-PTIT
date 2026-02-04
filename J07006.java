import java.util.*;
import java.io.*;
public class J07006{
    public static void main(String[] args) throws IOException,FileNotFoundException,ClassNotFoundException{
        ObjectInputStream ois= new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList <Integer> li= (ArrayList<Integer>) ois.readObject();
        int[] mp=new int[1000];
        for(int i:li){
            mp[i]++;
        }
        for(int i=0;i<1000;++i){
            if(mp[i]>0){
                System.out.printf("%d %d\n", i,mp[i]);
            }
        }
        ois.close();
    }
}