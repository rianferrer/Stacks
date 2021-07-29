import java.util.Scanner;
public class RunStacks {

	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);        
        System.out.print("Rian's Stack Operation Program\n");
        System.out.print("Enter your preferred stack size: ");
        int a = s.nextInt();
        
  
        Stacks stk = new Stacks(a);
        
        /* Stack Operations */

        char ch;
        do {
        	System.out.println("Stack Operations: \n"
        		+ "A. Stack size \n" 
        		+ "B. clear \n"
        		+ "C. isEmpty \n"
        		+ "D. isFull \n"
        		+ "E. push \n"
        		+ "F. pop \n"
        		+ "G. peek \n"
        		+ "H. display \n");
        System.out.print("Pick a letter of your chosen operation: ");
        char x = s.next().charAt(0);
        
        switch(x)
        {
		case 'A':
		case 'a': System.out.print("Stack size: " + stk.size()); break;

		case 'B':
		case 'b': System.out.println(stk.clear()); break;
		
		case 'C':
		case 'c': System.out.println("Stack: " + stk.isEmpty()); break;
		
		case 'D':
		case 'd': System.out.println("Stack " + stk.isFull()); break;
		
		case 'E':
		case 'e': System.out.println("Enter a number to push: ");
					stk.push(s.nextInt()); break;
		
		case 'F':
		case 'f': System.out.println("Popped element from the stack: "
					+ stk.pop()); break;
		
		case 'G':
		case 'g': System.out.println("Stack's top element: "
					+ stk.peek()); break;

        }
        
        stk.display();
        System.out.print("Another operation to perform? (Y/N)");
        ch = s.next().charAt(0); 
        } while (ch == 'Y' || ch == 'y');

	s.close();
	}
}