
package corehealth;

/**
 *
 * Custom exception that will be thrown when there is an invalid entry when
 * the user is trying to sign up for class.
 * 
 * @author Andrew Gunn | amgunn1@hotmail.com
 */
public class IllegalCourseException extends Exception {

    private static final String ERR = "Invalid course ID. Please see front desk.";
    
    /**
     * Creates a new instance of <code>IllegalCourseException</code> without detail message.
     */
    public IllegalCourseException() {
        super(ERR);
    }

    /**
     * Constructs an instance of <code>IllegalCourseException</code> with the specified detail message.
     * @param msg the detail message.
     */
    public IllegalCourseException(String msg) {
        super(ERR);
    }
}
