import java.util.*;
import java.io.*;
public class J02103{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int te=1;te<=t;++te){
            System.out.println("TEST "+te+":");
            int n=sc.nextInt(),m=sc.nextInt();
            ArrayList <ArrayList<Integer>> li= new ArrayList<>();
            for(int i=0;i<n;++i){
                ArrayList <Integer> lmao= new ArrayList<>();
                for(int j=0;j<m;++j){
                    lmao.add(sc.nextInt());
                }
                li.add(lmao);
            }
            for(int i=0;i<n;++i){
                for(int x=0;x<n;++x){
                    int a=0;
                    for(int j=0;j<m;++j){
                        a+=li.get(i).get(j)*li.get(x).get(j);
                    }
                    System.out.printf("%d",a);
                    if(x<n-1) System.out.printf(" ");
                }
                System.out.println();
            }
        }
    }
}

//1 2    1 3
//3 4    2 4