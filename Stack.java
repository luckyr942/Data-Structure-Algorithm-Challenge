 //This is a Java code which shows how to Implement the Staack using Array.
public class Stack {
    public static void main(String[] args){
        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.top());
        System.out.println(s.size());
        System.out.println(s.pop());
        System.out.println(s.top());
        System.out.println(s.size());
    }
}
class stack{
      int size = 3;
      int arr[] = new int[size];
      int top = -1;
      
      void push(int x){
        top++;
        arr[top] = x;
      }

      int pop(){
        int x = arr[top];
        top--;
        return x;
      }

      int top(){
        return arr[top];
      }
      
      int size(){
        return top+1;
      }
}
