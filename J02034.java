import java.util.*;
import java.io.*;
public class J02034{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int lonnhat=-1;
        ArrayList <Integer> li= new ArrayList<>();
        for(int i=0;i<201;++i){
            li.add(0);
        }
        for(int i=0;i<n;++i){
            int x=sc.nextInt();
            li.set(x,1);
            lonnhat=Math.max(lonnhat,x);
        }
        boolean check=true;
        for(int i=1;i<=lonnhat;++i){
            if(li.get(i)==0){
                System.out.println(i);
                check=false;
            }
        }
        if(check){
            System.out.println("Excellent!");
        }
    }
}