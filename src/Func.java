public class Func {
    public static int max (int x, int y){
        if (x>y){
            return x;
        }else{
            return y;
        }
    }
    public static void draw_triangle(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < i+1;j++){
                System.out.print('*');
            }
            System.out.print('\n');
        }
    }
    public static void main (String[] args) {
        System.out.println(max(7,2));
        double[] numbers = new double[]{4, 7.0, 10};
        System.out.println(numbers.length);
        SLList C= new SLList(234);
        C.addFirst(32);
        System.out.println(C.get(1));

    }
}
