
/**
 * ADT MyStack: Private Part<br>
 * . The class implements all the operations available in MyStack<br>
 */
public class MyDynamicStack implements MyStack {

  // --------------------------------------------------
  // Attributes
  // --------------------------------------------------
  /*
     head: Points to the top element in the stack and hold's info on the data and the element that is next in the stack.
  */
  private MyNode head;
  // -------------------------------------------------------------------
  // Basic Operation --> Check if MyStack is empty: myCreateEmpty
  // -------------------------------------------------------------------
  // public myStack myCreateEmpty(){}

  public MyDynamicStack() {
    head = null;
  }

  // -------------------------------------------------------------------
  // Basic Operation --> Check if MyStack is empty: isEmpty
  // -------------------------------------------------------------------

  public boolean isEmpty() {
    //-----------------------------
		//Output Variable --> InitialValue
		//-----------------------------
    
    //A boolean value is returned
    
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
      Scenario 1: Checks if head points to null it returns False
      Scenario 2: If head does not point to null it returns true
    */

    // -----------------------------
    // Output Variable --> Return FinalValue
    // -----------------------------
    // Returns a boolean value
    return head == null;
  }

  // -------------------------------------------------------------------
  // Basic Operation (Partial) --> Get first element from the top of MyStack and
  // removes it: pop
  // -------------------------------------------------------------------

  public int pop() {
  //-----------------------------
  //Output Variable --> InitialValue
  //-----------------------------

  /*
    poppedNumber: Contains the information on the head that is going to be popped.
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
    Scenario 1: If it's empty it returns an error
  */
    if (isEmpty()) {
      System.out.println("Cannot pop! Nothing left in stack.");
      return -1;
    }
  
  /* 
    Scenario 2: If it's not empty the head points to the next element in the stack using the getNext() method, and the previous node is dereferenced.
  */
    else {
      int poppedNumber = head.getInfo();
      head = head.getNext();
      System.out.println(poppedNumber + " has been removed from the stack!");
     //-----------------------------
		 //Output Variable --> Return FinalValue
		 //-----------------------------
      return poppedNumber;
    }
  }

  // -------------------------------------------------------------------
  // Basic Operation (Partial) --> Add element to the top of MyStack: push
  // -------------------------------------------------------------------

  public void push(int element) {
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
      Scenario 1: Returns an error if the head is null
    */
    if (head == null) {
      head = new MyNode(element, null);
    }
     /*
      Scenario 2: The head is made to point to the new element and a message is shown
    */
    else {

      MyNode nextHead = new MyNode(element, head);
      head = nextHead;
    }
    System.out.println(element + " has been pushed to the stack");
  }

  // -------------------------------------------------------------------
  // Basic Operation (Partial) --> prints all the elements from MyStack: print
  // -------------------------------------------------------------------

  public void print() {
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

    /*
      Scenario 1: If the head is null, it skips execution of the function so it returns nothing.

      Scenario 2: The head node appends it's information to a string and then moves on to the next node. This goes on until head is null, and then the string of elements is printed.
    */
    if (head != null) // If the stack is already empty it skips excecution (avoids NullPointerException)
    {
      MyNode printNode = new MyNode(head.getInfo(), head.getNext());
      /*
        A deep copy is created because changing the value of printNode shouldn't change the value of head
       */
      while (printNode != null) {
        System.out.print(printNode.getInfo() + " ");
        printNode = printNode.getNext();
      }
    }
  }
}
