public class CalculatorStack{

	int top; 
	int stackLength = 0; 
	int[] stackArray;

	public CalculatorStack(){
		stackArray = new int[10];
	}

	public void STACK_ARRAY_EXTEND(){
		int[] tempArray = new int[stackArray.length + 10];
			////////For each of the elements in stackArray, it'll go through and add
			//////// to the temp array. It starts at 1 as 0 will be int
		int arrayCounter = 1;
		for (int s: stackArray) {
			tempArray[arrayCounter] = s;
			arrayCounter++;
		}
			//////////We are done with the catenation of the old array.
			//////////we replace stackArray with tempArray. 
		stackArray = tempArray;
	}

	private void STACK_SET_TOP(int INT){
		int arrayCounter = 1;
		int replacedE = stackArray[0];
		stackArray[0] = INT;
		for (int s: stackArray ) {
			int replacedEtemp = replacedE;
			replacedE = stackArray[arrayCounter+1];
			stackArray[arrayCounter] = replacedEtemp;
		}
	}
			
	public void push(int INT){
		top = INT;
		//first case: array is too small to add another element
		if (stackLength == stackArray.length - 1){
			STACK_ARRAY_EXTEND();
			STACK_SET_TOP(INT);
		}
		else{
			STACK_SET_TOP(INT);
		}
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

	public int pop(){
		int retVar = stackArray[0];
		STACK_REMOVE_TOP();
		return retVar;
	}

	private int ADD_THEN_POP(){
		this.push(stackArray[0]);
		return (this.pop());
	}

	public int peek(){
		return ADD_THEN_POP();
	}
}