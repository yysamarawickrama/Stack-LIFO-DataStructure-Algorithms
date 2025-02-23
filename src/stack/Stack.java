package stack;

public class Stack {
    private int maxValue;
    private int StackArray[];
    private int index;
    private int hello;
    
    public Stack(int maxValue){
        this.maxValue = maxValue;
        StackArray = new int[maxValue];
        index = -1;
    }
    
    private void push(int value){
        if(index == maxValue - 1){
            System.out.println("Stack is Full");
        }else{
            StackArray[++index] = value;
            System.out.println("Value "+value+ " has pushed to the Stack");
        }
    }
    
    private void pop(){
        if(index == -1){
            System.out.println("Stack is Empty");
        }else{
            System.out.println("Value "+ StackArray[index--]+" has popped");
        }
    }
    
    private void top(){
        if(index == -1){
            System.out.println("Stack is Empty");
        }else{
            System.out.println("Top value is "+ StackArray[index]+".");
        }
    }
    
    public static void main(String[] args) {
        Stack stack = new Stack(3);
        
        stack.pop();
        System.out.println("");
        
        stack.push(10);
        stack.top();
        System.out.println("");
        stack.push(20);
        stack.top();
        System.out.println("");
        stack.push(30);
        stack.top();
        System.out.println("");
        
        stack.pop();
        stack.top();
        System.out.println("");
        stack.pop();
        stack.top();
        System.out.println("");
        stack.pop();
        stack.top();

    }
}
