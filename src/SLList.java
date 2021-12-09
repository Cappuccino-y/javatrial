public class SLList {
    private IntNode sentinel;
    private int size_num;
    public SLList(int x){
        sentinel = new IntNode(231,null);
        sentinel.next =new IntNode(x,null);
        size_num=1;
    }
    public SLList(){
        sentinel = new IntNode(231,null);
        size_num=0;
    }

    public void addLast(int x){
        sentinel.next = new IntNode(x, sentinel.next);
        size_num=size_num+1;
    }

    public void addFirst(int x){
        IntNode pointer = sentinel;
        while (pointer.next!=null){
            pointer = pointer.next;
        }
        pointer.next = new IntNode (x,null);
        size_num=size_num+1;
    }

    public int size(){
        return size_num;
    }

    public int get(int i){
        return sentinel.next.get(i);
    }

    public static void main(String[] args) {
        SLList C= new SLList(234);
        C.addLast(32);
        C.addFirst(26);
        C.addFirst(2312);
        C.addFirst(2312);
        C.addFirst(2312);
        C.addFirst(2312);
        C.addFirst(2312);
        System.out.println(C.size());
    }

    private static class IntNode {
        public int item;
        public IntNode next;
        public IntNode(int f,IntNode r){
            item =f;
            next=r;
        }

        public int size_iterative(){
            int num = 1;
            IntNode test=next;
            while (test!=null){
                num=num+1;
                test=next.next;
            }
            return num;
        }

        public int size(){
            if (next==null){
                return 1;
            }
            else{
                return 1+next.size();
            }
        }
        public int get(int i){
            if (i==size()-1){
                return item;
            }
            else{
                return next.get(i);
            }
        }
        public static IntNode incrList(IntNode L,int x){
            IntNode temp = new IntNode(L.item +x,null );
            for(int i=1; i<L.size();i++){
                temp = new IntNode (L.get(i)+x,temp);
            }
            return temp;
        }
        /*super magical huh*/
        public static IntNode dincrList(IntNode L, int x){
            if (L.next==null){
                L.item = L.item +x;
                return L;
            }
            else {
                L.item =L.item +x;
                dincrList(L.next,x);
                return L;
            }
        }
    }

}
