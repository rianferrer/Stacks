
public class Stacks {
	
    int stk[];
    int size, maxStkSize, top; 
  
    Stacks(int n) 
    {
        maxStkSize = n;
        size = 0;
        stk = new int[maxStkSize];
        top = -1;
    }
    
    // STACK OPERATIONS ALGO
    
    /*  Function to get the size of the stack */
    public int size()
    {
        return top;
    }
    
    public int clear()
    {
        return top - 1;
    }
    
    /*  Function to check if stack is empty */
    boolean isEmpty() 
    { 
        return (top == -1);
    }
    
    /*  Function to check if stack is full */
    boolean isFull()
    {
        return (top == maxStkSize-1);
    }
  
    /*  Function to add an element to the stack */
    public void push(int s) 
    { 
        if (isFull()) { 
            System.out.println("Stack is full.");  
        } 
        else { 
            stk[++top] = s; 
            System.out.println(s + " is pushed into the stack."); 
            maxStkSize++; 
        } 
    } 

    //	FERRER, MARION CARYL R.
    //	2ITF
    
    /*  Function to delete an element from the stack */
    public int pop() 
    { 
        if (isEmpty()) 
            System.out.println("Stack is empty."); 
        maxStkSize--;
        return stk[top--];
    } 
  
    /*  Function to check the top element of the stack */
    public int peek() 
    { 
        if (isEmpty()) 
            System.out.println("Stack is empty."); 
            return stk[top];
    }

    /*  Function to display the status of the stack */
    public void display() 
    {
        System.out.print("\nCurrent stack: ");
        
        if (maxStkSize == 0) {
            System.out.print("The stack is empty.");
            return;
        }
        
        for (int i = top; i <= 0; i--)
            System.out.print(stk[i] + "");
        System.out.println();
    }
}
