import java.util.*;

public class J02027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int K = sc.nextInt();
            int[] A = new int[n];
            for (int i = 0; i < n; i++) {
                A[i] = sc.nextInt();
            }
            Arrays.sort(A); // sắp xếp tăng dần

            int count = 0;
            int j = 1;
            for (int i = 0; i < n - 1; i++) {
                while (j < n && A[j] - A[i] < K) {
                    j++;
                }
                count += j - i - 1; // số cặp với A[i]
            }
            System.out.println(count);
        }
    }
}
