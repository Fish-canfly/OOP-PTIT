import java.util.*;
import java.io.*;
public class J02106{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] mp= new int[n][3];
        int cnt=0;
        for(int i=0;i<n;++i){
            int dem1=0;
            for(int j=0;j<3;++j){
                mp[i][j]=sc.nextInt();
                if(mp[i][j]==1) dem1++;
            }
            //System.out.println(dem1);
            if(dem1>=2){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}