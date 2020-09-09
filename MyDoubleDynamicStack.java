
/**
 * ADT MyStack: Private Part<br>
 * . The class implements all the operations available in MyStack<br>
 */
public class MyDoubleDynamicStack<T> implements MyStack<T> {

  // --------------------------------------------------
  // Attributes
  // --------------------------------------------------
  /*
   * head: Points to the first element in the stack. tail: Points to the last
   * element in the stack.
   */
  private MyDoubleLinkedNode<T> head;
  private MyDoubleLinkedNode<T> tail;

  // -------------------------------------------------------------------
  // Basic Operation --> Check if myStack is empty: myCreateEmpty
  // -------------------------------------------------------------------
  // public myStack myCreateEmpty(){}

  public MyDoubleDynamicStack() {
    head = null;
    tail = null;
  }

  // -------------------------------------------------------------------
  // Basic Operation --> Check if myStack is empty: isEmpty
  // -------------------------------------------------------------------

  public boolean isEmpty() {
    // -----------------------------
    // Output Variable --> InitialValue
    // -----------------------------
    // A boolean value is returned
    // -----------------------------
    // SET OF OPS
    // -----------------------------

    // -----------------------------
    // I. SCENARIO IDENTIFICATION
    // -----------------------------
    // Scenario 1: The stack is empty
    // Scenario 2: The stack is not empty
    // -----------------------------
    // II. SCENARIO IMPLEMENTATION
    // -----------------------------
    /*
     * Scenario 1: Checks to see if head and tail are null. If they are, it returns
     * True
     */

    /* Scenario 2: Checks to see if head and tail are not null, and returns False */
    // -----------------------------
    // Output Variable --> Return FinalValue
    // -----------------------------
    return head == null && tail == null;
  }

  // -------------------------------------------------------------------
  // Basic Operation (Partial) --> Get first element from front of MyStack: first
  // -------------------------------------------------------------------

  public T first() {
    // -----------------------------
    // Output Variable --> InitialValue
    // -----------------------------
    //Returns a generic type value
    // -----------------------------
    // SET OF OPS
    // -----------------------------

    // -----------------------------
    // I. SCENARIO IDENTIFICATION
    // -----------------------------
    /* Scenario 1: Stack is empty */
    /* Scenario 2: Stack is not empty */
    // -----------------------------
    // II. SCENARIO IMPLEMENTATION
    // -----------------------------
    /* Scenario 1: If isEmpty() evaluates to True, null value is returned */
    /*
     * Scenario 2: If isEmpty() evaluates to False, the information contained in the
     * object that head is pointing to is returned.
     */
    // -----------------------------
    // Output Variable --> Return FinalValue
    // -----------------------------
    return isEmpty() ? null : head.getInfo();
  }

  // -------------------------------------------------------------------
  // Basic Operation --> Add element to back of MyStack: addByFirst
  // -------------------------------------------------------------------

  public void addByFirst(T element) {
    // -----------------------------
    // SET OF OPS
    // -----------------------------

    // -----------------------------
    // I. SCENARIO IDENTIFICATION
    // -----------------------------
    /* Scenario 1: The stack is empty */
    /* Scenario 2: The stack is not empty */
    // -----------------------------
    // II. SCENARIO IMPLEMENTATION
    // -----------------------------
    /*
     * Scenario 1: If the stack is empty, a new head object is created. This head
     * points to null on both the left and right side as nothing else is in the
     * stack. The tail is equal to the head, because if there is only one element in
     * the stack, it is both the first AND last element, meaning it is both the head
     * And the tail.
     */
    if (isEmpty()) {
      head = new MyDoubleLinkedNode<T>(null, element, null);
      tail = head;
    }
    /*
     * Scenario 2: If the stack is not empty, another element is added to the front
     * of the stack and the head points to it. The previous elements next head is now the
     * newly added element instead of null.
     */
    else {
      MyDoubleLinkedNode<T> newHead = new MyDoubleLinkedNode<T>(null, element, head);
      head.setLeft(newHead);
      head = newHead;
    }
    System.out.println(element + " has been added to the head");
  }

  // -------------------------------------------------------------------
  // Basic Operation (Partial) --> Remove element from front of MyStack:
  // removeByFirst
  // -------------------------------------------------------------------

  public void removeByFirst() {
    // -----------------------------
    // SET OF OPS
    // -----------------------------

    // -----------------------------
    // I. SCENARIO IDENTIFICATION
    // -----------------------------
    /* Scenario 1: The stack is empty */
    /* Scenario 2: The stack is not empty */
    /* Scenario 2.1: There is only one element in the stack */
    /* Sccenario 2.2: There are multiple elements in the stack */
    // -----------------------------
    // II. SCENARIO IMPLEMENTATION
    // -----------------------------
    /*Scenario 1: If the stack is empty, it prints an error message*/
    if (isEmpty()) {
      System.out.println("Cannot remove from head! Stack is empty");
    }

    /*Scenario 2: If the stack is not empty, an element is removed from the head.*/
    else {
      T removedElement = head.getInfo();
      /*Scenario 2.1: If there is only one element in the stack, it is deleted. Which means there is nothing left in the stack. Therefore, head will be made null and tail will be made null.*/
      if (head == tail) {
        head = null;
        tail = null;

      } 
      /*Scenario 2.2: If there are multiple items in the stack, then an element is added in the first position. The head shifts to the left and points to the newly created element. The newly created element then points to null on it's left side as it is at the top of the stack and nothing is there after it.*/
      else {
        head = head.getRight();
        head.setLeft(null);
      }
      System.out.println(removedElement + " has been removed from the tail");
    }
  }

  // -------------------------------------------------------------------
  // Basic Operation (Partial) --> Get first element from front of MyStack: last
  // -------------------------------------------------------------------

  public T last() {
    // -----------------------------
    // Output Variable --> InitialValue
    // -----------------------------
    //Returns a generic type value
    // -----------------------------
    // SET OF OPS
    // -----------------------------

    // -----------------------------
    // I. SCENARIO IDENTIFICATION
    // -----------------------------
    /* Scenario 1: Stack is empty */
    /* Scenario 2: Stack is not empty */
    // -----------------------------
    // II. SCENARIO IMPLEMENTATION
    // -----------------------------
    /* Scenario 1: If isEmpty() evaluates to True, null value is returned */
    /*
     * Scenario 2: If isEmpty() evaluates to False, the information contained in the object that tail is pointing to is returned.
     */
    // -----------------------------
    // Output Variable --> Return FinalValue
    // -----------------------------
    return isEmpty() ? null : tail.getInfo();
  }

  // -------------------------------------------------------------------
  // Basic Operation --> Add element to back of MyStack: addByLast
  // -------------------------------------------------------------------

  public void addByLast(T element) {
    // -----------------------------
    // SET OF OPS
    // -----------------------------

    // -----------------------------
    // I. SCENARIO IDENTIFICATION
    // -----------------------------
     /* Scenario 1: The stack is empty */
    /* Scenario 2: The stack is not empty */
    // -----------------------------
    // II. SCENARIO IMPLEMENTATION
    // -----------------------------
    /*
     * Scenario 1: If the stack is empty, a new tail object is created. This tail
     * points to null on both the left and right side as nothing else is in the
     * stack. The tail is equal to the head, because if there is only one element in
     * the stack, it is both the first AND last element, meaning it is both the head
     * And the tail.
     */
    if (isEmpty()) {
      tail = new MyDoubleLinkedNode<T>(null, element, null);
      head = tail;
    }
    /*
     * Scenario 2: If the stack is not empty, another element is added to the back
     * of the stack and the tail points to it. The previous elements next tail is now the
     * newly added element instead of null.
     */
    else {

      MyDoubleLinkedNode newTail = new MyDoubleLinkedNode<T>(tail, element, null);
      tail.setRight(newTail);
      tail = newTail;
    }
    System.out.println(element + " has been added to the tail.");
  }

  // -------------------------------------------------------------------
  // Basic Operation (Partial) --> Remove element from front of MyStack:
  // removeByFirst
  // -------------------------------------------------------------------

  public void removeByLast() {
    // -----------------------------
    // SET OF OPS
    // -----------------------------

    // -----------------------------
    // I. SCENARIO IDENTIFICATION
    // -----------------------------
    /* Scenario 1: The stack is empty */
    /* Scenario 2: The stack is not empty */
    /* Scenario 2.1: There is only one element in the stack */
    /* Sccenario 2.2: There are multiple elements in the stack */
    // -----------------------------
    // II. SCENARIO IMPLEMENTATION
    // -----------------------------
    /*Scenario 1: If the stack is empty, it prints an error message*/
    if (isEmpty()) {
      System.out.println("Cannot remove from tail! Stack is empty");
    }
    /*Scenario 2: If the stack is not empty, an element is removed from the head.*/
    else {
      T removedElement = tail.getInfo();
      /*Scenario 2.1: If there is only one element in the stack, it is deleted. Which means there is nothing left in the stack. Therefore, tail will be made null and head will be made null.*/
      if (head == tail) {
        tail = null;
        head = null;
      } 
       /*Scenario 2.2: If there are multiple items in the stack, then an element is added in the last position. The tail shifts to the right and points to the newly created element. The newly created element then points to null on it's right side as it is the last in the stack and nothing is there after it.*/
      else {
        tail = tail.getLeft();
        head.setRight(null);
      }
      System.out.println(removedElement + " has been removed from the tail.");
    }

  }

}
