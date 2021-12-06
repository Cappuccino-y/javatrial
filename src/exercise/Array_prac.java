package exercise;

public class Array_prac {
    public static int sum(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i = i + 1) {
            sum = sum + a[i];
        }
        return sum;
    }
    public static int max(int[] m) {
        int max_num = m[0];
        for (int i = 0; i < m.length; i++) {
            if (m[i] > max_num) {
                max_num = m[i];
            }
        }
        return max_num;
    }
    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        System.out.println(max(numbers));
        System.out.println(sum(numbers));
    }
}
