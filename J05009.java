import java.util.*;
public class J05009{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList <ArrayList<String>> li= new ArrayList<>();
        for(int i=1;i<=t;++i){
            String name=sc.nextLine();
            String dob=sc.nextLine();
            double tong=Double.parseDouble(sc.nextLine())+
                        Double.parseDouble(sc.nextLine())+
                        Double.parseDouble(sc.nextLine());
            ArrayList<String> it=new ArrayList<>();
            it.add(String.valueOf(i)); it.add(name); it.add(dob); it.add(String.format("%.1f",tong));
            li.add(it);
        }
        Collections.sort(li, (ArrayList<String> a, ArrayList<String> b)->{
            double lmao=Double.parseDouble(a.get(3));
            double lol=Double.parseDouble(b.get(3));
            if(lmao==lol){
                return Integer.compare(Integer.parseInt(a.get(0)),Integer.parseInt(b.get(0)));
            }
            return Double.compare(lol,lmao);
        });
        int check=0;
        for(int i=0;i<li.size();++i){
            if(i!=0){
                if(Double.parseDouble(li.get(i).get(3))==Double.parseDouble(li.get(0).get(3))){
                    check=1;
                }
                else break;
            }
            if(i==0 || check==1){
                System.out.println(li.get(i).get(0)+" "+
                                    li.get(i).get(1)+" "+
                                    li.get(i).get(2)+" "+
                                    li.get(i).get(3));
            }
        }
    }
}