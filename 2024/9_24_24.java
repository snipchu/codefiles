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
            String mack = in.nextLine();
            String[] holymackeral = mack.split(" ");
            Stack<String> stack = new Stack<String>();
            
            System.out.println(mack + " = ");
            for (int yay=0; yay<stack.size(); yay++) {
                // check if next item is not an operator
                if (mathsym.indexOf(holymackeral[yay]) == -1) {
                    stack.push(holymackeral[yay]);
                    System.out.println(holymackeral[yay]);
                } else {
                    double num1 = Integer.valueOf(stack.pop());
                    double num2 = Integer.valueOf(stack.pop());
                    switch (holymackeral[yay]) {
                        case "-":
                            System.out.println(num2-num1);
                        case "+":
                            System.out.println(num2+num1);
                        case "*":
                            System.out.println(num2*num1);
                        case "/":
                            System.out.println(num2/num1);
                    }
                }
            }
        }
    }
    
    public static void main() throws IOException { //2
        postfixSolver();
    }
}
