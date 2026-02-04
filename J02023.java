import java.util.Scanner;

public class J02023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int S = sc.nextInt();
        
        // Trường hợp đặc biệt: S = 0
        if (S == 0) {
            if (N == 1) {
                System.out.println("0 0");
            } else {
                System.out.println("-1 -1");
            }
            return;
        }
        
        // Nếu tổng S quá lớn so với N chữ số
        if (S > 9 * N) {
            System.out.println("-1 -1");
            return;
        }
        
        // Tìm số lớn nhất
        StringBuilder max = new StringBuilder();
        int sum = S;
        for (int i = 0; i < N; i++) {
            int digit = Math.min(9, sum);
            max.append(digit);
            sum -= digit;
        }
        
        // Tìm số nhỏ nhất
        StringBuilder min = new StringBuilder();
        sum = S;
        for (int i = 0; i < N; i++) min.append('0'); // khởi tạo

        for (int i = N - 1; i >= 0; i--) {
            int digit = Math.min(9, sum);
            min.setCharAt(i, (char) ('0' + digit));
            sum -= digit;
        }
        // đảm bảo số nhỏ nhất không bắt đầu bằng 0
        if (min.charAt(0) == '0') {
            for (int i = 1; i < N; i++) {
                if (min.charAt(i) != '0') {
                    min.setCharAt(i, (char)(min.charAt(i) - 1));
                    min.setCharAt(0, '1');
                    break;
                }
            }
        }
        
        System.out.println(min + " " + max);
    }
}
