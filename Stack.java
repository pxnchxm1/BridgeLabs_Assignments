<<<<<<< HEAD
//custom implementation of Stack using linkedlist
//1.stack.push()
//2.stack.pop()
//3.stack.isEmpty()
//4.stack.peek()

import java.util.LinkedList;

import org.w3c.dom.Node;

class Stack<E>{
   
    private Node top ;
    LinkedList <E> list = new LinkedList<>();
    //push(add element to LL)
    public void push(E element){
        Node newNode = new Node(element);
        if(top == null){
            top = newNode;
            list.add(element);
        }else{
            newNode.next = top;
            top = newNode;
            list.addFirst(element);
        }

    }
    //pop(delete node from tail)
    //peek(traverse and show tail)
    //isEmpty(check if LL is empty)

}
public class Stack {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
    }
}
=======
import java.util.ArrayList;
class Stack<T>{
    
    ArrayList<T> stack;
    public Stack(){
        stack = new ArrayList<T>();
    }
    public void push(T element){
        stack.add(element);
    }
    public T pop(){
     T item = stack.get(stack.size()-1);
     stack.remove(stack.size()-1);
     return item;
    }
    public T peek(){
        return stack.get(stack.size()-1);
    }
    public boolean isEmpty(){
        return stack.size()==0;
    }
    public static void main(String[] args){
        Stack<String> s = new Stack<String>();
        s.push("hello");
        s.push("hi");
        s.push("hellohiworld");
        System.out.println(s.peek());
        s.pop();
       
        while(!s.isEmpty()){
           System.out.println(s.pop());
        }
    }
}
>>>>>>> d83487bbf6e1ef1e7b429bc6ba3aef1bc2c55b92
