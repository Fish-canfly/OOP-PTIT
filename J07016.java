import java.util.*;
import java.io.*;
public class J07016{
    public static int[] prime=new int[10005];
    static void sang(){
        prime[0]=1; prime[1]=1;
        for(int i=2;i<=100;++i){
            if(prime[i]==0){
                for(int j=i*i;j<=10000;j+=i){
                    prime[j]=1;
                }
            }
        }
    }
    public static void main(String[] args)throws IOException, ClassNotFoundException,FileNotFoundException{
        ObjectInputStream ois1=new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream ois2=new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> a=(ArrayList<Integer>)ois1.readObject();
        ArrayList<Integer> b=(ArrayList<Integer>)ois2.readObject();
        int[] m1=new int[10001];
        int[] m2=new int[10001];
        sang();
        for(int it:a){
            m1[it]++;
        }
        for(int it:b){
            m2[it]++;
        }
        for(int i=2;i<m2.length;++i){
            if(prime[i]==0){
                if(m1[i]>0 && m2[i]>0) System.out.println(i+" "+m1[i]+" "+m2[i]);
            }
        }
    }
}