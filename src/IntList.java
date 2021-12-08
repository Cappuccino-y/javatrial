public class IntList {
    public int first;
    public IntList rest;

    public IntList(int f,IntList r){
        first=f;
        rest=r;
    }

    public int size_iterative(){
        int num = 1;
        IntList test=rest;
        while (test!=null){
            num=num+1;
            test=rest.rest;
        }
        return num;
    }

    public int size_recursive(){
        if (rest==null){
            return 1;
        }
        else{
            return 1+rest.size_recursive();
        }
    }
    public int get(int i){
        if (i==size_recursive()-1){
            return first;
        }
        else{
            return rest.get(i);
        }
    }
    public static IntList incrList(IntList L,int x){
        IntList temp = new IntList(L.first+x,null );
        for(int i=1; i<L.size_recursive();i++){
            temp = new IntList (L.get(i)+x,temp);
        }
        return temp;
    }
    /*super magical huh*/
    public static IntList dincrList(IntList L, int x){
        if (L.rest==null){
            L.first= L.first+x;
            return L;
        }
        else {
            L.first=L.first+x;
            dincrList(L.rest,x);
            return L;
        }
    }
    public static void main(String[] args){
        IntList L= new IntList(1,null);
         L= new IntList(2,L);
         L= new IntList(3,L);
         L= new IntList(4,L);

        System.out.println(dincrList(L,4).get(3));
    }

}
