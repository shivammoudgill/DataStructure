import java.util.*;

public class Stack_queue{
    static Queue<Integer> q1 = new LinkedList<Integer>();
    static Queue<Integer> q2 = new LinkedList<Integer>();
    void display()
    {
        System.out.println(q2);
    }
    void push(int x){
        q2.add(x);
    }
    int pop(){
        if(q2.isEmpty())
        return -1;
        int n = q2.size();
        while(n>1){
            q1.add(q2.poll());
            n--;
        }
        int x = q2.poll();
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        return x; 
    }
    public static void main(String[] args) {
        Stack_queue s = new Stack_queue();
        s.push(10); 
        s.push(20); 
        s.push(30);

        s.display();
        
        s.pop();
        s.display();
    }
}