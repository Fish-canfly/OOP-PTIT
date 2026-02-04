import java.util.*;
import java.io.*;
public class J07057{
    public static void main(String[] args){
        try{
            Scanner sc=new Scanner(new File("THISINH.in"));
            int t=Integer.parseInt(sc.nextLine());
            ArrayList <thisinh> li= new ArrayList<>();
            while(t-->0){
                String a=sc.nextLine();
                double b=Double.parseDouble(sc.nextLine());
                String c=sc.nextLine();
                int d=Integer.parseInt(sc.nextLine());
                li.add(new thisinh(a,b,c,d));
            }
            Collections.sort(li, new Comparator<thisinh>(){
                @Override
                public int compare(thisinh a,thisinh b){
                    return Double.compare(b.getDiem(),a.getDiem());
                }
            });
            for(thisinh a:li){
                System.out.println(a.res());
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
class thisinh{
    private static int id=1;
    private String name,dantoc,ma="TS";
    private double diem; private int kv;
    private String trangthai="Truot";
    public thisinh(String a,double b, String c, int d){
        this.name=chuanhoa(a);this.dantoc=c;
        this.diem=b;
        this.kv=d;
        if(id<10){
            this.ma+="0";
        }
        this.ma+=String.valueOf(id);
        id++;
        if(this.kv==1) this.diem+=1.5;
        else if(this.kv==2) this.diem+=1;
        if(!this.dantoc.equals("Kinh")){
            //System.out.println(id-1);
            this.diem+=1.5;
        }
        if(this.diem>=20.5)
            trangthai="Do";
    }
    public String chuanhoa(String b){
        String[] lmao=b.trim().split("\\s+");
        StringBuilder sb=new StringBuilder();
        for(String c:lmao){
            sb.append(c.substring(0,1).toUpperCase());
            sb.append(c.substring(1).toLowerCase());
            sb.append(" ");
        }
        return sb.toString();
    }
    public double getDiem(){
        return this.diem;
    }
    public String res(){
        String bruh=ma+" "+this.name+String.format("%.1f",this.diem)+" "+this.trangthai;
        return bruh;
    }
}