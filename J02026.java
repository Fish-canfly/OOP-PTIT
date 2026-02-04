import java.util.*;

public class J02026 {
    static int N, K;
    static int[] A;
    static int[] temp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            N = sc.nextInt();
            K = sc.nextInt();
            A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            Arrays.sort(A); // sắp xếp tăng dần
            temp = new int[K];
            combine(0, 0);
        }
    }

    // Sinh combination K phần tử
    static void combine(int start, int index) {
        if (index == K) {
            for (int i = 0; i < K; i++) {
                if (i > 0) System.out.print(" ");
                System.out.print(temp[i]);
            }
            System.out.println();
            return;
        }
        for (int i = start; i < N; i++) {
            temp[index] = A[i];
            combine(i + 1, index + 1);
        }
    }
}
