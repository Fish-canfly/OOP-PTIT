import java.util.*;
public class J05007{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<ArrayList<String>> li=new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        for(int i=0;i<t;++i){
            String id="";
            if((i+1)<10000) id+="0";
            if((i+1)<1000) id+="0";
            if((i+1)<100) id+="0";
            if((i+1)<10) id+="0";
            id+=String.valueOf(i+1);
            ArrayList <String> it=new ArrayList<>();
            String name=sc.nextLine();
            String gender=sc.nextLine();
            String dob=sc.nextLine();
            String address=sc.nextLine();
            String tax=sc.nextLine();
            String signday=sc.nextLine();
            it.add(id);
            it.add(name); it.add(gender); it.add(dob); it.add(address); it.add(tax);
            it.add(signday);
                li.add(it);
        }
        Collections.sort(li, (ArrayList<String> a,ArrayList<String> b)->{
            String[] lmao= a.get(3).split("/");
            String[] lol= b.get(3).split("/");
            if(Integer.parseInt(lmao[2])==Integer.parseInt(lol[2])){
                if(Integer.parseInt(lmao[1])==Integer.parseInt(lol[1])){
                    return Integer.compare(Integer.parseInt(lmao[0]),Integer.parseInt(lol[0]));
                }
                return Integer.compare(Integer.parseInt(lmao[1]),Integer.parseInt(lol[1]));
            }
            return Integer.compare(Integer.parseInt(lmao[2]),Integer.parseInt(lol[2]));
        });
        for(int i=0;i<li.size();++i){
            ArrayList<String> it=li.get(i);
            System.out.println(it.get(0)+" "+chuanhoa(it.get(1))+
                                it.get(2)+" "+it.get(3)+" "+
                                it.get(4)+" "+it.get(5)+" "+
                                it.get(6));
        }
    }
    static String chuanhoa(String a){
        String[] lmao=a.trim().toLowerCase().split("\\s+");
        String res="";
        for(String s:lmao){
            res+=s.substring(0,1).toUpperCase()+s.substring(1)+" ";
        }
        return res;
    }
}