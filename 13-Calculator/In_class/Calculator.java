import java.io.*;
import java.util.*;

public class Calculator{

	private void CALCULATOR_PSEUDO_WAIT_TIME(int TIME){
		try{
			Thread.sleep(TIME);
		} catch (Exception e){}
	}

	public void calculatorMode(){
		MyStack calStack = new MyStack();
		boolean quitMode = false;
		Scanner scan = new Scanner(System.in);
		while (!quitMode){
			try{
				String input = scan.nextLine();
				if (input.equals("quit") || input.equals("Quit") || input.equals("Q")
					|| input.equals("q") || input.equals("die") || input.equals("Die")){
					quitMode = true;
				}
				if (input.equals("+")){
					calStack.push(calStack.pop() + calStack.pop());
					System.out.println("WORKSSSS?");
				}
				if(input.equalsIgnoreCase("view")){
					System.out.println(calStack);
				}
			} catch(Exception e){
				double input = scan.nextDouble();
				calStack.push((int)Math.round(input));
			}


		}

	}



		public static void main(String[] args){

			CalculatorStack test = new CalculatorStack();
			test.push(20);
			test.push(50);
			System.out.println(test);
			
			Calculator calculator = new Calculator();


			int y = 20;
			while (y != 0){
				System.out.println("\n");
				y--;
			}
			System.out.println("Starting Calculator...");
			System.out.println("Loading Calculator Stack..."); 
			calculator.CALCULATOR_PSEUDO_WAIT_TIME(100);
			System.out.println(" Completed.");
			System.out.println("Operations...") ;
			calculator.CALCULATOR_PSEUDO_WAIT_TIME(350);
			System.out.println(" Completed.");
			System.out.println("Private Functions...") ;
			calculator.CALCULATOR_PSEUDO_WAIT_TIME(125);
			System.out.println(" Completed.");
		 	System.out.println("Magical Backend Stuff...") ;
			calculator.CALCULATOR_PSEUDO_WAIT_TIME(500);
			System.out.println(" Completed.");
			System.out.println("Making Toast...") ;
			calculator.CALCULATOR_PSEUDO_WAIT_TIME(1000);
			System.out.println(" Completed.");
			System.out.println("Buttering Toast...") ;
			calculator.CALCULATOR_PSEUDO_WAIT_TIME(500);
			System.out.println(" Completed.");
			System.out.println("Loading Calculator Pseudo Wait Time") ;
			calculator.CALCULATOR_PSEUDO_WAIT_TIME(500);
			System.out.println(" Completed.");
			int x = 100;
			while (x != 0){
				System.out.println("very important things that make you look and seem cool") ;
				calculator.CALCULATOR_PSEUDO_WAIT_TIME(1);
				System.out.println(" Completed.");
				x--; 
			}	
			int z = 20;
			while (z != 0){
				System.out.println("\n");
				z--;
			}
			System.out.println("Welcome to CalculatorStack.");
			System.out.println("Enter numbers or functions.");
			System.out.println("This is a postfix calculator");
			calculator.calculatorMode();
	}
}