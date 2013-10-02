
package corehealth;

/**
 *
 * Custom exception that will be thrown when an input member id either doesn't 
 * exist, or is invalid.
 * 
 * @author Andrew Gunn | amgunn1@hotmail.com
 */
public class IllegalMemberException extends Exception {

    
    private static final String ERR = "Invalid Member Id. Please see front desk.";
    /**
     * Creates a new instance of <code>IllegalMemberException</code> without detail message.
     */
    public IllegalMemberException() {
        super(ERR);
    }


    /**
     * Constructs an instance of <code>IllegalMemberException</code> with the specified detail message.
     * @param msg the detail message.
     */
    public IllegalMemberException(String msg) {
        super(ERR);
    }
}
