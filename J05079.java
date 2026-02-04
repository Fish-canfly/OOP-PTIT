import java.util.*;
public class J05079{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        HashMap<String,ArrayList<Participant>> mp=new HashMap<>();
        while(t-->0){
            String id=sc.nextLine();
            if(mp.containsKey(id)) mp.get(id).add(new Participant(sc.nextLine(),
                                                                    sc.nextLine(),
                                                                    sc.nextLine()));
            else{
                mp.put(id,new ArrayList<>());
                mp.get(id).add(new Participant(sc.nextLine(),
                                                sc.nextLine(),
                                                sc.nextLine()));
            }
        }
        int q=Integer.parseInt(sc.nextLine());
        while(q-->0){
            String check=sc.nextLine();
            ArrayList<Participant> li=mp.get(check);
            Collections.sort(li, (Participant a,Participant b)->{
                return a.id.compareTo(b.id);
            });
            System.out.printf("Danh sach nhom lop mon %s:\n",li.get(0).lop);
            for(Participant it:li){
                System.out.println(it);
            }
        }
    }
}
class Participant{
    public String lop,id,name;
    public Participant(String lop,String id,String name){
        this.lop=lop;
        this.name=chuanhoa(name);
        this.id=id;
    }
    @Override
    public String toString(){
        return this.id+" "+this.name;
    }
    public String chuanhoa(String s){
        String[] lmao=s.trim().toLowerCase().split("\\s+");
        String res="";
        for(String r:lmao){
            res+=r.substring(0,1).toUpperCase()+r.substring(1)+" ";
        }
        return res;
    }
}