import java.util.*;
public class J04009{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            Pair<Double,Double> a=new Pair<>(sc.nextDouble(),sc.nextDouble());
            Pair<Double,Double> b=new Pair<>(sc.nextDouble(),sc.nextDouble());
            Pair<Double,Double> c=new Pair<>(sc.nextDouble(),sc.nextDouble());
            Double d=Math.sqrt((a.first-b.first)*(a.first-b.first)+(a.second-b.second)*(a.second-b.second));
            Double e=Math.sqrt((c.first-b.first)*(c.first-b.first)+(c.second-b.second)*(c.second-b.second));
            Double f=Math.sqrt((a.first-c.first)*(a.first-c.first)+(a.second-c.second)*(a.second-c.second));
            Double area=(1.0/4)*Math.sqrt((d+e+f)*(d+e-f)*(d-e+f)*(-d+e+f));
            if(area>0) System.out.println(String.format("%.2f",area));
            else System.out.println("INVALID");
        }
    }
}
class Pair <A,B>{
    public A first;
    public B second;
    public Pair(A first,B second){
        this.first=first;
        this.second=second;
    }
}