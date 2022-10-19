
package dao;

import model.Cnh;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Filipe Zulian
 */
public class CnhDAO {
    private static List<Cnh> cnhs = new ArrayList<>();
    
    public static void salvarCnh(Cnh cnh) {
        cnhs.add(cnh);
    }

    public static List<Cnh> recuperarTodasCnhs() {
        return cnhs;
    }
    
    public static void removerCnh(Cnh cnh) {
        cnhs.remove(cnh);
    }
}
