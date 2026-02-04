import java.util.*;
import java.io.*;
public class J02016{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            int n=sc.nextInt();
            HashSet <Integer> set=new HashSet<>();
            //int[] a=new int[1000000001];
            int[] mp=new int[n];
            for(int i=0;i<n;++i){
                mp[i]=sc.nextInt();
                set.add(mp[i]);
            }
            //Arrays.sort(mp);
            String res="NO";
            for(int i=0;i<n;++i){
                for(int j=0;j<n;++j){
                    if(i==j) continue;
                    int lmao=(int)Math.sqrt(mp[i]*mp[i]+mp[j]*mp[j]);
                        if(set.contains(lmao) && lmao*lmao==mp[i]*mp[i]+mp[j]*mp[j]){
                            res="YES";
                            break;
                        }
                }
                if(res=="YES") break;
            }
            System.out.println(res);
        }
    }
}