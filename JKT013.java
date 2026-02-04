import java.util.*;
public class JKT013 {
    static ArrayList<String> generate(int n){
    Queue<String> q = new LinkedList<>();
    ArrayList<String> res = new ArrayList<>();
        q.add("6");
        q.add("8");

        while(!q.isEmpty()){
            String s = q.poll();
            if(s.length() > n) break;
            res.add(s);
            q.add(s + "6");
            q.add(s + "8");
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt();
            ArrayList<String> ans = generate(N);

            Collections.sort(ans, (a, b) -> {
                if (a.length() != b.length())
                    return b.length() - a.length();  
                return b.compareTo(a);              
            });

            System.out.println(ans.size());
            for(String s : ans){
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }
}