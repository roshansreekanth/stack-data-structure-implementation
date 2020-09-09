
/**
* ADT MyStack: Private Part<br>. 
* The class implements all the operations available in MyStack<br>
*/
public class MyStaticStack implements MyStack {

	//--------------------------------------------------
	// Attributes
	//--------------------------------------------------
  /*
    items[]: Stores a list of items passed in.
    numItems: A counter that stores the number of items in the items[] list.
    maxItems: The maximum number of items that the list can hold.
  */
	private int items[]; 
	private int numItems;
	private int maxItems;

	//-------------------------------------------------------------------
	// Basic Operation --> Check if myStack is empty: myCreateEmpty
	//-------------------------------------------------------------------	
	//public myStack myCreateEmpty(){}

	public MyStaticStack(int m)
	{
		maxItems = m;
		items = new int[maxItems]; 
		numItems = -1; //The head that points to the first element of the stack
	}

	//-------------------------------------------------------------------
	// Basic Operation --> Check if MyStack is empty: isEmpty
	//-------------------------------------------------------------------	

	public boolean isEmpty(){
    //-----------------------------
		//Output Variable --> InitialValue
		//-----------------------------

    // A boolean value is returned

    //-----------------------------
		//SET OF OPS
		//-----------------------------

    //-----------------------------
		// I. SCENARIO IDENTIFICATION
		//-----------------------------
    
    /* 
      Scenario 1: The stack is empty
       Scenario 2: The stack is not empty
    */

    //-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------
    
    /* Scenario 1: Checks the head to see if it is -1 and returns True if it's empty.
       Scenario 2: Checks the head to see if it is -1 and returns False if not empty.
    */

    //-----------------------------
		//Output Variable --> Return FinalValue
		//-----------------------------
    // Retruns a boolean value based on the scenarios above.

		return numItems == -1;
	}
	
	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Get and remove first element from top of MyStack: pop
	//-------------------------------------------------------------------

	public int pop(){
		//-----------------------------
		//Output Variable --> InitialValue
		//-----------------------------

    /*
      popValue: Contains the value of the element that has been popped
    */

    //-----------------------------
		//SET OF OPS
		//-----------------------------

		//-----------------------------
		// I. SCENARIO IDENTIFICATION
		//-----------------------------
		/*
      Scenario 1: Stack is empty
      Scenario 2: Stack is not empty
      */
		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------
		/*
      Scenario 1: If stack is empty it returns an error
    */
		if (isEmpty())
		{
			System.out.println("Can't pop! Nothing left in stack" );
			return -1;
		}
		
    /* 
      Scenario 2: If it's not empty the head decrements by 1 and the popped item is returned
    */
  else
		{
			int popValue = items[numItems];
			numItems --;
			System.out.println(popValue + " has been popped from the top of the stack.");
     //-----------------------------
		 //Output Variable --> Return FinalValue
		 //-----------------------------
			return popValue;
		}
		
	}

		
	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Add element to the top of MyStack: push
	//-------------------------------------------------------------------

	public void push(int element){
    //-----------------------------
		//SET OF OPS
		//-----------------------------
	
		//-----------------------------
		// I. SCENARIO IDENTIFICATION
		//-----------------------------
    
    /* 
      Scenario 1: If the stack is full
      Scenario 2: If there is free space in the stack
    */

		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------
    /*
      Scenario 1: Returns an error if the stack is full
    */
		 if (numItems == maxItems - 1) // maxItems is subtracted by 1 to avoid out of bounds exception
		 {
			 System.out.println("Cannot push " + element + "! Stack is full");
		 }
		 
     /*
      Scenario 2: The head is incremented by 1 and a message is shown
    */
		 else
		 {
			 numItems ++;
			 items[numItems] = element;
			 System.out.println(element + " has been pushed to the top of the stack.");
		 }
		
	}
	
	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> prints all the elements from MyStack: print
	//-------------------------------------------------------------------

	public void print(){
		//-----------------------------
		//SET OF OPS
		//-----------------------------

		//-----------------------------
		// I. SCENARIO IDENTIFICATION
		//-----------------------------
		
    /*
      Scenario 1: The stack is not empty
      Scenario 2: The stack is empty
    */
    
		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------

    /*
      Scenario 1: Loops through the elements in the stack and prints them out

      Scenario 2: If the stack is empty, nothing prints out. An out of bounds error is prevented by making sure i is greater than or equal to 0
    */
    
		for(int i = numItems; i >= 0; i--)
		{
			System.out.print(items[i] + " ");
		}
	}
	
}
