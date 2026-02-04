import java.util.*;

public class J02024 {

    static int N;
    static int[] A;
    static List<List<Integer>> result;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            N = sc.nextInt();
            A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            Arrays.sort(A);
            // Đảo để giảm dần
            for (int i = 0; i < N / 2; i++) {
                int tmp = A[i];
                A[i] = A[N - 1 - i];
                A[N - 1 - i] = tmp;
            }

            result = new ArrayList<>();
            backtrack(0, new ArrayList<>(), 0);

            // Sắp xếp kết quả theo từ điển
            Collections.sort(result, new Comparator<List<Integer>>() {
                public int compare(List<Integer> l1, List<Integer> l2) {
                    int len = Math.min(l1.size(), l2.size());
                    for (int i = 0; i < len; i++) {
                        if (!l1.get(i).equals(l2.get(i))) {
                            return l1.get(i) - l2.get(i);
                        }
                    }
                    return l1.size() - l2.size();
                }
            });

            // In kết quả
            for (List<Integer> sub : result) {
                for (int i = 0; i < sub.size(); i++) {
                    if (i > 0) System.out.print(" ");
                    System.out.print(sub.get(i));
                }
                System.out.println();
            }
        }
    }

    // Sinh dãy con (subsequence) theo thứ tự
    static void backtrack(int index, List<Integer> path, int sum) {
        if (!path.isEmpty() && sum % 2 == 1) {
            result.add(new ArrayList<>(path));
        }
        for (int i = index; i < N; i++) {
            path.add(A[i]);
            backtrack(i + 1, path, sum + A[i]);
            path.remove(path.size() - 1);
        }
    }
}
