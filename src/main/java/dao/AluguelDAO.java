
package dao;

import model.Aluguel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Filipe Zulian
 */
public class AluguelDAO {
    
    private static List<Aluguel> alugueis = new ArrayList<>();
    
    public static void salvarAluguel (Aluguel alug) {
        alugueis.add(alug);
    }

    public static List<Aluguel> recuperarTodosAlugueis() {
        return alugueis;
    }
    
    public static void removerAluguel(Aluguel alug) {
        alugueis.remove(alug);
    }
}
