package PointCardGame;
/** class of objects thrown when an operation to
  * access an element of an empty stack is attempted
  */
class EmptyStackException extends StackException 
{
    public EmptyStackException()
    {
        //there is an implicit call to the parent class exception
        System.out.println("");
    }
}
