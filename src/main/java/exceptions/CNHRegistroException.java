
package exceptions;

/**
 *
 * @author Filipe Zulian
 */
public class CNHRegistroException extends Exception {
    
    public CNHRegistroException() {
        super("CNH ja cadastrada!");
    }
    
}
