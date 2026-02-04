import java.util.*;

public class J02028 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            long K = sc.nextLong();
            long[] A = new long[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextLong();
            }

            int left = 0;
            long sum = 0;
            boolean found = false;

            for (int right = 0; right < N; right++) {
                sum += A[right];
                while (sum > K && left <= right) {
                    sum -= A[left++];
                }
                if (sum == K) {
                    found = true;
                    break;
                }
            }

            System.out.println(found ? "YES" : "NO");
        }
    }
}
