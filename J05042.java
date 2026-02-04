import java.util.*;
public class J05042{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<ArrayList<String>> li=new ArrayList<>();
        while(t-->0){
            ArrayList<String> it=new ArrayList<>();
            it.add(sc.nextLine());
            String[] lmao=sc.nextLine().split("\\s+");
            it.add(lmao[0]);
            it.add(lmao[1]);
            li.add(it);
        }
        Collections.sort(li, (ArrayList<String> a,ArrayList<String> b)->{
            if(Integer.parseInt(a.get(1))==Integer.parseInt(b.get(1))){
                if(Integer.parseInt(a.get(2))==Integer.parseInt(b.get(2))){
                    return a.get(0).compareTo(b.get(0));
                }
                return Integer.compare(Integer.parseInt(a.get(2)),Integer.parseInt(b.get(2)));
            }
            return Integer.compare(Integer.parseInt(b.get(1)),Integer.parseInt(a.get(1)));
        });
        for(ArrayList<String> it:li){
            System.out.println(it.get(0)+" "+it.get(1)+" "+it.get(2));
        }
    }
}