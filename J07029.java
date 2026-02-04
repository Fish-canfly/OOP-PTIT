import java.util.*;
import java.io.*;
public class J07029{
    private static int[] prime=new int[1000001];
    public static void main(String[] args) throws FileNotFoundException,IOException,ClassNotFoundException{
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> li= (ArrayList<Integer>) ois.readObject();
        sang();
        int[] mp=new int[1000001];
        for(int i:li) mp[i]++;
        int cnt=0;
        for(int i=1000000;i>=0;--i){
            if(mp[i]>0 && prime[i]==0){
                System.out.println(i+" "+mp[i]);
                cnt++;
            }
            if(cnt==10) break;
        }
    }
    static void sang(){
        prime[0]=1;prime[1]=1;
        for(int i=2;i<=1000;++i){
            if(prime[i]==0){
                for(int j=i*i;j<=1000000;j+=i){
                    prime[j]=1;
                }
            }
        }
    }
}