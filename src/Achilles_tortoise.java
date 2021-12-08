public class Achilles_tortoise {
        public int a;
        public static int b=2;

        public Achilles_tortoise(int w){
            a=w;
        }
        public int cd (){
            System.out.println("hello there");
            System.out.println(a);
            return a*b;
        }

        public static Achilles_tortoise max (Achilles_tortoise x,Achilles_tortoise y){
            if (x.a>y.a){
                return x;
            }else{
                return y;
            }
        }

        public static void main(String[] args) {
            String a = "Achilles";
            String t = "Tortoise";
            double aPos = 0;
            double tPos = 100;
            double aSpeed = 20;
            double tSpeed = 10;
            double totalTime = 0;

            while (aPos < tPos) {
                System.out.println("At time: " + totalTime);
                System.out.println("    " + a + " is at position " + aPos);
                System.out.println("    " + t + " is at position " + tPos);
                double timeToReach = (tPos - aPos) / aSpeed;
                totalTime = totalTime + timeToReach;
                aPos = aPos + timeToReach * aSpeed;
                tPos = tPos + timeToReach * tSpeed;
            }
        }
}
