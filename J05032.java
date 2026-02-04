import java.util.*;
import java.time.*;
import java.time.format.*;
import java.time.temporal.*;
public class J05032{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<String[]> li=new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            li.add(sc.nextLine().split("\\s+"));
        }
        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Collections.sort(li, (String[] a,String[] b)->{
            LocalDate x=LocalDate.parse(a[1],df);
            LocalDate y=LocalDate.parse(b[1],df);
            return x.compareTo(y);
        });
        System.out.println(li.get(li.size()-1)[0]);
        System.out.println(li.get(0)[0]);
    }
}