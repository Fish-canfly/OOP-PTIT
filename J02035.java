import java.util.*;
public class J02035{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            ArrayList <Long> li=new ArrayList<>();
            int res=0;
            for(int i=0;i<n;++i){
                li.add(sc.nextLong());
                if(i>0){
                    if(li.get(i-1)>li.get(i))
                        res=i;
                }
            }
            System.out.println(res);
        }
    }
}