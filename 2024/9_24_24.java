import java.util.*;
import java.io.*; //1
import java.lang.Integer;

public class stacks
{

    public static void stacks1() throws IOException {
        Scanner in = new Scanner(new File("foo.txt")); //3
        for (int i=0; i<3; i++) {
            // print/get next line
            String[] bob = in.nextLine().split(" ");
            System.out.println(Arrays.toString(bob));
            
            // add items to stack
            Stack<String> stack = new Stack<String>();
            for (String yay:bob) { stack.push(yay); }
            
            // print/pop items from stack
            System.out.println("popping all items from the stack");
            while (!stack.isEmpty()) {
                System.out.print(stack.pop()+" ");
            }
            System.out.println("\n");
        }
    }
    
    public static void syntaxChecker() throws IOException {
        Scanner in = new Scanner(new File("foo.txt")); //3
        String opensym = "<({[";
        String closesym = ">)}]";
        for (int i=0; i<8; i++) {
            boolean correct=true;
            String holymackeral = in.nextLine();
            String[] bob = holymackeral.split("");
            Stack<String> stack = new Stack<String>();
            for (int yay=0; yay<bob.length; yay++) {
                // check for opening symbol
                if (opensym.indexOf(bob[yay]) !=-1 ) {
                    stack.push(bob[yay]);
                }
                // check for closing symbol
                if (closesym.indexOf(bob[yay])!=-1 ) {
                   // check for opening symbol, and if they match
                   if (!stack.isEmpty() && closesym.indexOf(bob[yay]) == opensym.indexOf(stack.peek())) {
                       stack.pop();
                   } else {correct=false; break;}
                }
            }
            // stack is not empty at end of parsing
            if (!stack.isEmpty()) {correct=false;}
            
            // print result
            System.out.print(holymackeral+" is ");
            if (!correct) {System.out.print("in");}
            System.out.println("correct");
        }
    }
    
    public static void postfixSolver() throws IOException {
        Scanner in = new Scanner(new File("foo.txt"));
        String mathsym = "-+*/";
        for (int i=0; i<6; i++) {
	    double sum = 0;
            String mack = in.nextLine();
            String[] holymackeral = mack.split(" ");
            Stack<Double> stack = new Stack<Double>();
            System.out.print(mack + " = ");

            for (int yay=0; yay<holymackeral.length; yay++) {
		    if (mathsym.indexOf(holymackeral[yay]) == -1) {
			    stack.push(Double.valueOf(holymackeral[yay]));
		    } else {
			    double num1 = stack.pop();
			    double num2 = stack.pop();
			    switch (holymackeral[yay]) {
				    case "+":
					    stack.push(num2+num1);
					    break;
				    case "-":
					    stack.push(num2-num1);
					    break;
				    case "*":
					    stack.push(num2*num1);
					    break;
				    case "/":
					    stack.push(num2/num1);
			    }
		    }
            }
	System.out.println(stack.peek());
        }
    }
    
    public static void main(String[] args) throws IOException { //2
        postfixSolver();
    }
}
