import java.util.*;
import java.io.*;
public class J07045{
    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }
}
class LoaiPhong implements Comparable<LoaiPhong>{
    private String id,name,price,tax;
    public LoaiPhong(String s){
        String[] lmao=s.split("\\s+");
        this.id=lmao[0];
        this.name=lmao[1];
        this.price=lmao[2];
        this.tax=lmao[3];
    }
    @Override
    public String toString(){
        return this.id+" "+this.name+" "+this.price+" "+this.tax;
    }
    @Override
    public int compareTo(LoaiPhong x){
        return this.name.compareTo(x.name);
    }
}