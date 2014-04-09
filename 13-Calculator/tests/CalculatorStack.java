public class CalculatorStack{

	double top; 
	double stackLength = 0; 
	double[] stackArray;

	public CalculatorStack(){
		stackArray = new double[10];
	}

	private void STACK_SET_TOP(double input){
		stackLength++;
		double[] origArray = stackArray;
		double[] newArray = new double[stackArray.length+1];
		newArray[0] = input;
		int newAPos = 1;
		for (double s:origArray) {
			newArray[newAPos] = s;
			newAPos++;
		}
		stackArray=newArray;
	}
			
	public void push(double input){
		top = input;
		//first case: array is too small to add another element
		STACK_SET_TOP(input);
	}

	private void STACK_REMOVE_TOP(){
		top = stackArray[1];
		stackArray[0] = stackArray[1];
		for (int arrayCounter = 1; arrayCounter < stackArray.length; arrayCounter++){
			if (arrayCounter != stackArray.length - 1){
				stackArray[arrayCounter] = stackArray[arrayCounter+1];
			}
		}
	}

	public double pop(){
		double retVar = stackArray[0];
		STACK_REMOVE_TOP();
		return retVar;
	}

	private double ADD_THEN_POP(){
		this.push(stackArray[0]);
		return (this.pop());
	}

	public double peek(){
		return stackArray[0];
	}

	private String WHOLE_STACK_PRINT(){
		String retVar = "Stack: \n";
		for (double d : stackArray ) {
			retVar = retVar + " " + d +"\n_____\n";
		}
		return retVar;
	}

	public String toString(){
		return WHOLE_STACK_PRINT();
	}
}