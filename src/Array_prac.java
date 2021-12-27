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
        int[] numbers ={9, 2, 15, 2, 22, 10, 6};

        System.out.println(max(numbers));
        System.out.println(sum(numbers));
        Achilles_tortoise[] sd = new Achilles_tortoise[10];
        sd[1]=new Achilles_tortoise(10);
        sd[1].cd();
        sd[2]=new Achilles_tortoise(10);
        System.out.println(sd[2].equals(sd[1]));
        Achilles_tortoise cs2=Achilles_tortoise.max(sd[1],sd[2]);
        cs2.cd();
        Achilles_tortoise.b=3;
        System.out.println(Achilles_tortoise.b);

    }
}
