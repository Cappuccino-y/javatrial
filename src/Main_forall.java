public class Main_forall {
    public static void main(String[] args) {
        SLList<String> A = new SLList("asd");
        SLList<Integer> B = new SLList(123);

        A.addLast("Aslyy");
        A.addFirst("aswqeq");
        A.addFirst("123sd");

        int[][] ck;
        ck = new int[2][2];
        ck[0]= new int[]{3,4};
        System.out.println(ck[0][1]);
    }
}
