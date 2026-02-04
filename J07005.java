import java.util.*;
import java.io.*;
public class J07005{
    public static void main(String[] args) throws IOException{
        DataInputStream fin= new DataInputStream(new FileInputStream("DATA.IN"));
        int[] mp=new int[1001];
        int b;
        for(int i=0;i<100000;++i){
            b=fin.readInt();
            mp[b]++;
        }
        for(int i=0;i<1001;++i){
            if(mp[i]>0){
                System.out.printf("%d %d\n",i,mp[i]);
            }
        }
    }
}