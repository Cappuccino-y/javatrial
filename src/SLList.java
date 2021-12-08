public class SLList {
    public class IntNode {
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
        public IntNode incrList(IntNode L,int x){
            IntNode temp = new IntNode(L.item +x,null );
            for(int i=1; i<L.size();i++){
                temp = new IntNode (L.get(i)+x,temp);
            }
            return temp;
        }
        /*super magical huh*/
        public IntNode dincrList(IntNode L, int x){
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

    private IntNode first;
    public SLList(int x){
        first =new IntNode(x,null);
    }
    public void addFirst(int x){
        first = new IntNode(x,first);
    }
    public int get(int i){
        return first.get(i);
    }
    public static void main(String[] args) {
        SLList C= new SLList(234);
        C.addFirst(32);
        System.out.println(C.get(0));

    }
}
