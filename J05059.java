import java.util.*;
import java.io.*;
public class J05059{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList <Tuyensinh> li=new ArrayList<>();
        while(t-->0){
            li.add(new Tuyensinh(sc.nextLine(),
                                sc.nextLine(),
                                Double.parseDouble(sc.nextLine()),
                                Double.parseDouble(sc.nextLine()),
                                Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(li,(Tuyensinh a,Tuyensinh b)->{
            if(b.getDiem()==a.getDiem()) return a.getId().compareTo(b.getId());
            return Double.compare(b.getDiem(),a.getDiem());
        });
        int chitieu=sc.nextInt();
        double diemchuan=li.get(chitieu-1).getDiem();
        System.out.println(String.format("%.1f",diemchuan));
        for(int i=0;i<li.size();++i){
            System.out.print(li.get(i));
            if(li.get(i).getDiem()>=diemchuan) System.out.println("TRUNG TUYEN");
            else System.out.println("TRUOT");
        }
    }
}
class Tuyensinh{
    private String id,name;
    private double poi,bonus;
    public Tuyensinh(String id,String name,double a,double b,double c){
        this.id=id;
        this.name=name;
        this.poi=Math.round((a*2+b+c)*10.0)/10.0;
        switch (id.charAt(2)){
            case '1':
                this.bonus=0.5;
                break;
            case '2':
                this.bonus=1.0;
                break;
            case '3':
                this.bonus=2.5;
                break;
        }
    }
    @Override
    public String toString(){
        return this.id+" "+this.name+" "+chuanhoa(this.bonus)+" "+chuanhoa(this.poi+this.bonus)+" ";
    }
    public String chuanhoa(double a){
        if(a>(int)a) return String.format("%.1f",a);
        return String.valueOf((int)a);
    }
    public double getDiem(){
        return (this.poi+this.bonus);
    }
    public String getId(){
        return this.id;
    }
}