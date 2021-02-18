/**
 * Constant expressions
 */
public class Constant extends Expression {
   
    /**
     * Initialise value
     */
    public Constant(int v) {
	value = v;
    }
   
    /**
     * The value
     */
    private int value;

    /**
     * The value
     * @return 
     */
    @Override
    public int getValue() {
	return value; // Fix this in Exercise 1.
    }
   
    /**
     * String representation in in-order notation
     * @return 
     */
    @Override
    public String toString() {
	return String.valueOf(value);
    }
    
    @Override
    public String toPost() {
        return String.valueOf(value);
    }
    
    @Override
    public String toPre() {
        return String.valueOf(value);
    }
}
