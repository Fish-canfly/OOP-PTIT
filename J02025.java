import java.util.*;

public class J02025 {
    // Biến toàn cục để lưu kết quả
    static int n;
    static Integer[] a;
    static ArrayList<List<Integer>> results;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Đọc số bộ test
        int t = Integer.parseInt(sc.nextLine());
        
        while (t-- > 0) {
            n = sc.nextInt();
            a = new Integer[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            // 1. Sắp xếp mảng đầu vào GIẢM DẦN
            // Để đảm bảo các phần tử trong dãy con luôn giảm dần (ví dụ: 5 4 2)
            Arrays.sort(a, Collections.reverseOrder());

            results = new ArrayList<>();
            
            // 2. Quay lui tìm các dãy con
            backtrack(0, 0, new ArrayList<>());

            // 3. Sắp xếp các dãy con tìm được theo thứ tự từ điển
            Collections.sort(results, new Comparator<List<Integer>>() {
                @Override
                public int compare(List<Integer> o1, List<Integer> o2) {
                    int size = Math.min(o1.size(), o2.size());
                    for (int i = 0; i < size; i++) {
                        // So sánh giá trị từng phần tử
                        if (!o1.get(i).equals(o2.get(i))) {
                            return o1.get(i) - o2.get(i);
                        }
                    }
                    // Nếu giống nhau phần đầu, dãy ngắn hơn đứng trước
                    return o1.size() - o2.size();
                }
            });

            // 4. In kết quả
            for (List<Integer> list : results) {
                for (int i = 0; i < list.size(); i++) {
                    System.out.print(list.get(i) + " ");
                }
                System.out.println();
            }
        }
    }

    // Hàm Quay lui (Try)
    private static void backtrack(int index, int currentSum, List<Integer> currentList) {
        // Duyệt từ phần tử index đến hết mảng
        for (int i = index; i < n; i++) {
            currentList.add(a[i]);
            int newSum = currentSum + a[i];

            // Nếu tổng là số nguyên tố -> Lưu kết quả
            if (isPrime(newSum)) {
                results.add(new ArrayList<>(currentList));
            }

            // Gọi đệ quy cho phần tử tiếp theo
            backtrack(i + 1, newSum, currentList);

            // Backtrack: bỏ phần tử vừa thêm để thử nhánh khác
            currentList.remove(currentList.size() - 1);
        }
    }

    // Hàm kiểm tra số nguyên tố
    private static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}