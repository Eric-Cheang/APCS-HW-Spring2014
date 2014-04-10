public class CalculatorStack{

	double top; 
	int stackLength = 0; 
	double[] stackArray;

	public CalculatorStack(){
		stackArray = new double[10];
	}

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
		}
	}
			
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
		return ADD_THEN_POP();
	}

	public String toString(){
		String retVar = "";
		for (int x = 0; x < stackLength; x++){
			retVar = retVar + stackArray[x];
		}
		return retVar;
	}

	
}