import java.util.*;
import java.io.*;
public class J02104{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] mp=new int[n][n];
        ArrayList <ArrayList<Integer>> adj= new ArrayList<>();
        for(int i=0;i<n;++i){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<n;++i){
            for(int j=0;j<n;++j){
                mp[i][j]=sc.nextInt();
                if(mp[i][j]==1 && i<j){
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }
        /*for(ArrayList <Integer> it: adj){
            for(int x:it){
                System.out.printf("%d ",x);
            }
            System.out.println();
        }
        System.out.println("aodaoidjaodis");*/
        for(int i=0;i<n;++i){
            for(int j=0;j<adj.get(i).size();++j){
                //System.out.printf("%d %d\n",i,j);
                if(adj.get(i).get(j)>i){
                    System.out.printf("(%d,%d)\n",i+1,adj.get(i).get(j)+1);
                }
            }
        }
    }
}