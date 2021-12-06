package exercise;

public class BreakContinue {
    public static void horse(String []a) {
        for (String s : a) {
            for (int j = 0; j < 3; j += 1) {
                System.out.println(s);
                if (s.contains("horse")) {
                    break;
                }
            }
        }
    }
    public static void windowPosSum(int[] a, int n) {
        for (int i = 0; i < a.length; i++){
            if (a[i]<0){
                continue;
            }
            for (int j = i+1; j < i+n+1; j++){
                if (j >= a.length){
                    break;
                }
                a[i]=a[i]+a[j];
            }
        }
    }

    public static void main(String[] args) {
        String[] b = {"cat", "dog", "laser horse", "ketchup", "horse", "horbse"};
        int[] a = {1, 2, -3, 4, 5, 4};
        int n = 3;
        windowPosSum(a, n);
        System.out.println(java.util.Arrays.toString(a));
        horse(b);
    }
}
