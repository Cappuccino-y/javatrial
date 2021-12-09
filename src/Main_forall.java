public class Main_forall {
    public static void main(String[] args) {
        SLList A = new SLList();
        A.addFirst(32);
        A.addFirst(21312);
        A.addFirst(231);
        A.addLast(23);
        A.addLast(23);
        A.addLast(23);

        System.out.println(A.get(4));
    }
}
