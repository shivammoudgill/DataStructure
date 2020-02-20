import java.util.*;

public class Stack_onequeue{
    static Queue<Integer> q = new LinkedList<>();
    void push(int x){
        q.add(x);
        int n = q.size();
        while(n>1){
            q.add(q.poll());
            n--;
        }
    }
    int pop(){
        if(q.isEmpty())
        return -1;
        return q.poll();
    }
    void display()
    {
        System.out.println(q);
    }
    public static void main(String[] args) {
        Stack_onequeue s = new Stack_onequeue();
        s.push(10); 
        s.push(20); 
        s.push(30);

        s.display();
        
        s.pop();
        s.display();
    }
}
