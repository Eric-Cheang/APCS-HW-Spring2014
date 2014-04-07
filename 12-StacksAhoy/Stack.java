public class Stack{

	String top; 
	int stackLength = 0; 
	String[] stackArray;

	public Stack(){
		stackArray = new String[10];
	}

	public void STACK_ARRAY_EXTEND(){
		String[] tempArray = new String[stackArray.length + 10];
			////////For each of the elements in stackArray, it'll go through and add
			//////// to the temp array. It starts at 1 as 0 will be STRING
		int arrayCounter = 1;
		for (String s: stackArray) {
			tempArray[arrayCounter] = s;
			arrayCounter++;
		}
			//////////We are done with the catenation of the old array.
			//////////we replace stackArray with tempArray. 
		stackArray = tempArray;
	}

	private void STACK_SET_TOP(String STRING){
		int arrayCounter = 1;
		String replacedE = stackArray[0];
		stackArray[0] = STRING;
		for (String s: stackArray ) {
			String replacedEtemp = replacedE;
			replacedE = stackArray[arrayCounter+1];
			stackArray[arrayCounter] = replacedEtemp;
		}
	}
			


	public void push(String STRING){
		top = STRING;
		//first case: array is too small to add another element
		if (stackLength == stackArray.length - 1){
			STACK_ARRAY_EXTEND();
			STACK_SET_TOP(STRING);
		}
		else{
			STACK_SET_TOP(STRING);
		}
	}

	private void STACK_REMOVE_TOP(){
		top = stackarray[1];
		stackArray[0] = stackArray[1];
		for (int arrayCounter = 1; arrayCounter < stackArray.length; arrayCounter++){
			stackArray[arrayCounter] = stackArray[arrayCounter+1];
		}
	}

	public void pop(){
		STACK_REMOVE_TOP();
	}


}