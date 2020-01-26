import java.util.*;
public class PrefixEval {
    public static void main(String[] args) {
        String s="+ 16 2";
        String[] str=s.split(" ");
        Stack<String> stack=new Stack<>();
        for(int i=str.length-1;i>=0;i--){
            if(Character.isDigit(str[i].charAt(0))){
                stack.push(str[i]);
            }
            else{
                char c=str[i].charAt(0);
                //System.out.println(c);
                switch(c){
                    case '+':
                        //System.out.println(stack);
                        int num=(Integer.parseInt(stack.pop()) + Integer.parseInt(stack.pop()));
                        stack.push(String.valueOf(num));
                        break;
                    case '-':
                        int num1=(Integer.parseInt(stack.pop()) - Integer.parseInt(stack.pop()));
                        stack.push(String.valueOf(num1));
                        break;
                    case '/':
                        int num2=(Integer.parseInt(stack.pop()) / Integer.parseInt(stack.pop()));
                        stack.push(String.valueOf(num2));
                        break;
                    case '*':
                        int num3=(Integer.parseInt(stack.pop()) * Integer.parseInt(stack.pop()));
                        stack.push(String.valueOf(num3));
                        break;
                    default:
                        System.out.println("Not correct");
                        break;
                }
            }
        }
        System.out.println(stack.peek());
    }
}
