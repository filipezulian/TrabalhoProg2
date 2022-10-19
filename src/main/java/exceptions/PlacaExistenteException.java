
package exceptions;

/**
 *
 * @author Filipe Zulian
 */
public class PlacaExistenteException extends Exception {
    
    public PlacaExistenteException() {
        super("Já existe essa placa");
    }
}
