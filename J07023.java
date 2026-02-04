import java.util.*;
import java.io.*;
public class J07023{
    public static int[] prime=new int[10001];
    public static ArrayList<Integer> res;
    static void sang(){
        prime[0]=1;prime[1]=1;
        for(int i=2;i<=100;++i){
            if(prime[i]==0){
                for(int j=i*i;j<=10000;j+=i){
                    prime[j]=1;
                }
            }
        }
        for(int i=2;i<=10000;++i){
            if(prime[i]==0 && check(i)) res.add(i);
        }
    }
    public static void main(String[] args) throws FileNotFoundException,ClassNotFoundException,IOException{
        ObjectInputStream ois1=new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream ois2=new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> l=(ArrayList<Integer>)ois1.readObject();
        ArrayList<Integer> m=(ArrayList<Integer>)ois2.readObject();
        int[] a=new int[10001];
        int[] b=new int[10001];
        for(int i:l) a[i]++;
        for(int i:m) b[i]++;
        sang();
        for(int i:res){
            if(a[i]>0 && b[i]>0) System.out.println(i+" "+a[i]+" "+b[i]);
        }
    }
    static boolean check(int i){
        int s=Integer.valueOf(new StringBuilder(String.valueOf(i)).reverse().toString());
        if(s==i) return true;
        return false;
    }
}