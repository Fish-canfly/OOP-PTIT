import java.util.*;
import java.io.*;
public class J02009{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList <int[]> li= new ArrayList<>();
        while(t-->0){
            int[] a=new int[2];
            a[0]=sc.nextInt();
            a[1]=sc.nextInt();
            li.add(a);
        }
        Collections.sort(li, (a,b) -> Integer.compare(a[0],b[0]));
        for(int i=0;i<li.size();++i){
            int[] a=li.get(i);
            if(i<li.size()-1){
                if(a[0]+a[1]>li.get(i+1)[0]){
                    int[] b=li.get(i+1);
                    b[0]=a[0]+a[1];
                    li.set(i+1,b);
                }
            }
        }
        System.out.println(li.get(li.size()-1)[0]+li.get(li.size()-1)[1]);
    }
}