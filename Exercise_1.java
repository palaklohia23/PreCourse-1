class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        if (a.length == 0 )
        return true;
        else 
        return false;
    } 

    Stack() 
    { 
        //Initialize your constructor 
        this.a = a;
        this.top = -1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if (isFull())
        {
            System.out.println("Overflow\nProgram Terminated\n");
            return false;
        }
        a[++top] = x;
        return true;
        
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
         if (isEmpty())
        {
            System.out.println("Underflow\nProgram Terminated");
            System.exit(-1);
        }
        return a[top--];
    } 
  
    int peek() 
    { 
        //Write your code here
        return a[top];
    } 
    
    public boolean isFull() {
        return top == MAX - 1;     // or return size() == capacity;
    }
} 
  
// Driver code 
class Main { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
