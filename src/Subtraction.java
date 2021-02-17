/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jonah
 */
public class Subtraction extends Expression{
    /**
     * The expressions to be added.
     */
    private Expression left, right;
   
    /**
     * Initialise left and right sides
     */
    public Subtraction(Expression l, Expression r) {
	left = l;
	right = r;
    }
   
    /**
     * The value
     * @return 
     */
    @Override
    public int getValue() {
	return left.getValue() - right.getValue(); // Fix this in Exercise 1.
    }
    
    /**
     * String representation in in-order notation
     * @return 
     */
    @Override
    public String toString() {
	return "(" + left.toString() + " - " +
	    right.toString() + ")";
    }
}
