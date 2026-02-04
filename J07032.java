import java.util.*;
import java.io.*;
public class J07032{
    public static void main(String[] agrs) throws IOException, FileNotFoundException,ClassNotFoundException{
        ObjectInputStream ois1=new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream ois2=new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList <Integer> a=(ArrayList <Integer>) ois1.readObject();
        ArrayList <Integer> b=(ArrayList <Integer>) ois2.readObject();
        int[] mp=new int[1000001];
        int[] mp2=new int[1000001];
        for(int i:a) mp[i]++;
        for(int i:b) mp2[i]++;
        int cnt=0;
        for(int i=100;i<100000;++i){
            if(mp[i]>=1 && mp2[i]>=1 && check(i)){
                System.out.printf("%d %d\n",i,mp[i]+mp2[i]);
                cnt++;
            }
            if(cnt==10) break;
        }
    }
    static boolean check(int i){
        int temp=i;
        int rev=0;
        //if(String.valueOf(i).length()%2==0) return false;
        int dem=0;
        while(temp>0){
            int du=temp%10;
            if(du%2==0) return false;
            rev=rev*10+du;
            temp/=10;
            dem++;
        }
        if(dem%2==0) return false;
        return rev==i;
    }
}