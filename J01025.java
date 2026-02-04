import java.util.*;
import java.io.*;
public class J01025{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x_min_1=sc.nextInt();
        int y_min_1=sc.nextInt();
        int x_max_1=sc.nextInt();
        int y_max_1=sc.nextInt();
        int x_min_2=sc.nextInt();
        int y_min_2=sc.nextInt();
        int x_max_2=sc.nextInt();
        int y_max_2=sc.nextInt();
        int x_min=Math.min(x_min_1,x_min_2);
        int x_max=Math.max(x_max_1,x_max_2);
        int y_min=Math.min(y_min_1,y_min_2);
        int y_max=Math.max(y_max_1,y_max_2);
        int siz=Math.max(x_max-x_min,y_max-y_min);
        System.out.println(siz*siz);
    }
}