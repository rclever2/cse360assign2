/**
 * @author Russell Cleverly
 * Class ID: 70642
 * Assignment #: 2
 * 
 * This class is an object which stores a value 'total'
 * and a string 'history'. 'total' can be updated by using
 * the 'add' or 'subtract' methods. When performing any
 * operations, a record of them is stored in 'history' and
 * can be printed with the 'toString' method.
 * 
 */



package cse360assign2;

public class AddingMachine {
	
	private int total;
	private String history = "0";

	public AddingMachine () 
	{
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * @return total, value after all operations
	 */
	public int getTotal ()
	{
		return total;
	}
	
	/**
	 * Adds value 'value' to 'total'
	 * @param value: to add to 'total'
	 */
	public void add (int value) 
	{
		total += value;
		history += " + " + value;
	}
	
	/**
	 * Subtracts value 'value' from 'total'
	 * @param value: to subtract from 'total'
	 */
	public void subtract (int value) 
	{
		total -= value;
		history += " - " + value;
	}
	
	/**
	 * Prints a history of the operations performed
	 * @return history, a history of operations performed
	 */
	public String toString () 
	{
		return history;
	}
	
	/**
	 * Clears 'history'
	 */
	public void clear() 
	{
		history = "";
	}
}