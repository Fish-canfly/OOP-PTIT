import java.util.*;
public class J02102{
    static ArrayList<Integer> li= new ArrayList<>();
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        n=n*n;
        while(n-->0){
            li.add(Integer.parseInt(sc.nextLine()));
        }
        int[][] res= new int[3][3];
        Collections.sort(li);
        int ngang=n, doc=n-1;
        int step=1,start=0;
        int r=1,l=0;
        int u=0,d=1;
        while(ngang > 0 && doc >0){
            if(step%2==1){
                if(r==1){
                    for(int i=start;i<start+ngang;++i){
                        
                    }
                }
            }
            else{
                
            }
        }
    }
}