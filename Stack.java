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