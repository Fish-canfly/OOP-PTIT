import java.util.*;
public class J05054{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<students> li=new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        for(int i=1;i<=t;++i){
            String id="HS"+String.format("%02d",i);
            li.add(new students(id,sc.nextLine(),
                                Double.parseDouble(sc.nextLine())));
        }
        ArrayList<students> clone=new ArrayList<>(li);
        Collections.sort(clone, (students a,students b)->{
            return Double.compare(b.getDiem(),a.getDiem());
        });
        int rank=1;
        clone.get(0).setRank(rank);
        int nho=1;
        for(int i=1;i<clone.size();++i){
            if(clone.get(i).getDiem()==clone.get(i-1).getDiem()){
                nho++;
                clone.get(i).setRank(rank);
            }
            else{
                rank+=nho;
                clone.get(i).setRank(rank);
                nho=1;
            }
        }
        for(students it:li){
            System.out.println(it);
        }
    }
}
class students{
    private String id,name,trangthai="Gioi",rank;
    private double diem;
    public students(String id, String name,double diem){
        this.id=id;
        this.name=name;
        this.diem=diem;
        if(diem<5) this.trangthai="Yeu";
        else if(diem>=5 && diem <7) this.trangthai="Trung Binh";
        else if(diem>=7 && diem<9) this.trangthai="Kha";
    }
    public double getDiem(){
        return this.diem;
    }
    public void setRank(int a){
        this.rank=String.valueOf(a);
    }
    @Override
    public String toString(){
        return this.id+" "+this.name+" "+String.format("%.1f",this.diem)+" "+
                this.trangthai +" "+this.rank;
    }
}