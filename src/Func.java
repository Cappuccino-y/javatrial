import org.junit.Test;
import static org.junit.Assert.*;

public class Func {
    public static int max (int x, int y){
        if (x>y){
            return x;
        }else{
            return y;
        }
    }
    
    @Test
    public void draw_triangle() {
        int x=123;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < i+1;j++){
                System.out.print('*');
            }
            System.out.print('\n');
        }
    }

}
