import java.util.*;
public class J05006{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<ArrayList<String>> li=new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            ArrayList <String> it=new ArrayList<>();
            String name=sc.nextLine();
            String gender=sc.nextLine();
            String dob=sc.nextLine();
            String address=sc.nextLine();
            String tax=sc.nextLine();
            String signday=sc.nextLine();
            it.add(name); it.add(gender); it.add(dob); it.add(address); it.add(tax);
            it.add(signday);
            li.add(it);
        }
        for(int i=0;i<li.size();++i){
            String id="";
            if((i+1)<10000) id+="0";
            if((i+1)<1000) id+="0";
            if((i+1)<100) id+="0";
            if((i+1)<10) id+="0";
            id+=String.valueOf(i+1);
            ArrayList<String> it=li.get(i);
            System.out.println(id+" "+chuanhoa(it.get(0))+
                                it.get(1)+" "+it.get(2)+" "+
                                it.get(3)+" "+it.get(4)+" "+
                                it.get(5));
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