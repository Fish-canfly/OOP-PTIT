import java.util.*;
import java.io.*;
public class J07004{
    public static void main(String[] args){
        try{
            Scanner sc=new Scanner(new File("DATA.in"));
            int[] mp= new int[1001];
            Arrays.fill(mp,0);
            while(sc.hasNextInt()){
                ++mp[sc.nextInt()];
            }
            for(int i=0;i<1001;++i){
                if(mp[i]>0){
                    System.out.printf("%d %d\n",i,mp[i]);
                }
            }
        }catch(FileNotFoundException e){
            //e.printStackTrace();
        }
    }
}