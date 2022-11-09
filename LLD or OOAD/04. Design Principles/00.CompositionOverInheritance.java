import java.util.*;

class MyStack{
    List<Integer> stk;

    public MyStack(ArrayList<Integer> arr){
        stk = arr;
    }

    public MyStack(LinkedList<Integer> arr){
        stk = arr;
    }

    public void push(int a){
        stk.add(a);
    }

    public int remove(){
        return stk.remove(stk.size() - 1);
    }
}