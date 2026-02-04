import java.util.*;
public class J05075{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        LinkedHashMap <String,sinhvien> mp=new LinkedHashMap<>();
        for(int i=0;i<t;++i){
            String id=sc.nextLine();
            mp.put(id, new sinhvien(sc.nextLine(),
                                        sc.nextLine()));
        }
        for(int i=0;i<t;++i){
            String[] lol=sc.nextLine().split("\\s+");
            mp.get(lol[0]).set(lol[1]);
        }
        String s=sc.nextLine();
        for(String it:mp.keySet()){
            if(mp.get(it).lop.equals(s)){
                System.out.println(it+" "+mp.get(it));
            }
        }
    }
}
class sinhvien{
    public String name,lop,trangthai="";
    public int poi=10;
    public sinhvien(String name,String lop){
        this.name=name;
        this.lop=lop;
    }
    public void set(String s){
        for(char c:s.toCharArray()){
            switch(c){
                case 'm':
                    this.poi-=1;
                    break;
                case 'v':
                    this.poi-=2;
                    break;
            }
        }
        if(this.poi<0) this.poi=0;
        if(this.poi==0) this.trangthai="KDDK";
    }
    @Override
    public String toString(){
        return this.name+" "+this.lop+" "+this.poi+" "+this.trangthai;
    }
}