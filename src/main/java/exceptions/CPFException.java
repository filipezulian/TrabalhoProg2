
package exceptions;

/**
 *
 * @author Filipe Zulian
 */
public class CPFException extends Exception {
    public CPFException() {
        super("CPF já existe!");
    }
}
