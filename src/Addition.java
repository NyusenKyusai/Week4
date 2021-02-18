/**
 * Sums of two expressions
 */
public class Addition extends Expression {

    /**
     * The expressions to be added.
     */
    private Expression left, right;

    /**
     * Initialise left and right sides
     */
    public Addition(Expression l, Expression r) {
        left = l;
        right = r;
    }

    /**
     * The value
     * @return 
     */
    @Override
    public int getValue() {
        return left.getValue() + right.getValue(); // Fix this in Exercise 1.
    }

    /**
     * String representation in in-order notation
     * @return 
     */
    @Override
    public String toString() {
        return "(" + left.toString() + " + "
                + right.toString() + ")";
    }
    
    @Override
    public String toPost() {
        return "" + left.toPost() + " " + right.toPost() + " +";
    }
    
    @Override
    public String toPre() {
        return "sum(" + left.toPre() + "," + right.toPre() + ")";
    }
}
