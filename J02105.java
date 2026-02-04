import java.util.*;
import java.io.*;
public class J02105{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] mp=new int[n][n];
        for(int i=0;i<n;++i){
            for(int j=0;j<n;++j){
                mp[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;++i){
            System.out.printf("List(%d) =",i+1);
            for(int j=0;j<n;++j){
                if(mp[i][j]==1){
                    System.out.printf(" %d",j+1);
                }
            }
            System.out.println();
        }
    }
}