public class CalculatorStack{

	double top; 
<<<<<<< HEAD:13-Calculator/In_class/CalculatorStack.java
	int stackLength = 0; 
=======
	double stackLength = 0; 
>>>>>>> 707eea426425abab5f648624db7839dbb7c72728:13-Calculator/CalculatorStack.java
	double[] stackArray;

	public CalculatorStack(){
		stackArray = new double[10];
	}

<<<<<<< HEAD:13-Calculator/In_class/CalculatorStack.java
	public void STACK_ARRAY_EXTEND(){
		double[] tempArray = new double[stackArray.length + 10];
			////////For each of the elements in stackArray, it'll go through and add
			//////// to the temp array. It starts at 1 as 0 will be double
		int arrayCounter = 1;
		for (double s: stackArray) {
			tempArray[arrayCounter] = s;
			arrayCounter++;
		}
			//////////We are done with the catenation of the old array.
			//////////we replace stackArray with tempArray. 
		stackArray = tempArray;
	}

	private void STACK_SET_TOP(double DOUBLE){
		int arrayCounter = 1;
		double replacedE = stackArray[0];
		stackArray[0] = DOUBLE;
		for (double s: stackArray ) {
			double replacedEtemp = replacedE;
			replacedE = stackArray[arrayCounter+1];
			stackArray[arrayCounter] = replacedEtemp;
=======
	private void STACK_SET_TOP(double input){
		stackLength++;
		double[] origArray = stackArray;
		double[] newArray = new double[stackArray.length+1];
		newArray[0] = input;
		int newAPos = 1;
		for (double s:origArray) {
			newArray[newAPos] = s;
			newAPos++;
>>>>>>> 707eea426425abab5f648624db7839dbb7c72728:13-Calculator/CalculatorStack.java
		}
		stackArray=newArray;
	}
			
<<<<<<< HEAD:13-Calculator/In_class/CalculatorStack.java
	public void push(double DOUBLE){
		top = DOUBLE;
		//first case: array is too small to add another element
		if (stackLength == stackArray.length - 1){
			STACK_ARRAY_EXTEND();
			STACK_SET_TOP(DOUBLE);
		}
		else{
			STACK_SET_TOP(DOUBLE);
		}
		stackLength++;
=======
	public void push(double input){
		top = input;
		//first case: array is too small to add another element
		STACK_SET_TOP(input);
>>>>>>> 707eea426425abab5f648624db7839dbb7c72728:13-Calculator/CalculatorStack.java
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
		stackLength--;
		return retVar;
	}

	private double ADD_THEN_POP(){
		this.push(stackArray[0]);
		return (this.pop());
	}

	public double peek(){
<<<<<<< HEAD:13-Calculator/In_class/CalculatorStack.java
		return ADD_THEN_POP();
=======
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

	public static void main(String[] args){
		CalculatorStack test = new CalculatorStack();
		test.push(5.2);
		test.push(303);
		test.push(2.2);
		test.push(5.93294);
		test.push(5.93294);
		test.push(5.93294);
		test.push(5.93294);
		test.push(5.93294);
		test.push(5.93294);
		test.push(5.93294);
		System.out.println(test);
		System.out.println(test.peek());
		System.out.println(test.pop());
		System.out.println(test.pop());
>>>>>>> 707eea426425abab5f648624db7839dbb7c72728:13-Calculator/CalculatorStack.java
	}

	public String toString(){
		String retVar = "";
		for (int x = 0; x < stackLength; x++){
			retVar = retVar + stackArray[x];
		}
		return retVar;
	}

	
}