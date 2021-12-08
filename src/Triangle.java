public class Triangle {
    public static void main(String[] args) {
        int x = 10;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < i+1;j++){
                System.out.print('*');
            }
            System.out.print('\n');
        }
    }
}
