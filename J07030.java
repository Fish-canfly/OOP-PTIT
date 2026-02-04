import java.util.*;
import java.io.*;
public class J07030{
    private static int[] prime=new int[1000001];
    public static void main(String[] args) throws IOException,FileNotFoundException,ClassNotFoundException{
        ObjectInputStream ois1=new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream ois2=new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList <Integer> a= (ArrayList <Integer>) ois1.readObject();
        ArrayList <Integer> b= (ArrayList <Integer>) ois2.readObject();
        sang();
        int[] mp=new int[1000001];
        int[] mp2=new int[1000001];
        for(int i:a) mp[i]=1;
        for(int j:b) mp2[j]=1;
        for(int i=2;i<=500000;++i){
            if(mp[i]==1 && prime[i]==0){
                if(mp2[1000000-i]==1 && prime[1000000-i]==0){
                    System.out.printf("%d %d\n",i,1000000-i);
                    mp2[1000000-i]=0;
                }
            }
        }
    }
    static void sang(){
        prime[1]=1;prime[0]=1;
        for(int i=2;i<=1000;++i){
            if(prime[i]==0){
                for(int j=i*i;j<=1000000;j+=i) prime[j]=1;
            }
        }
    }
}