
package dao;

import model.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Filipe Zulian
 */
public class ClienteDAO {
    private static List<Cliente> clientes = new ArrayList<>();
    
    public static void salvarCliente(Cliente c) {
        clientes.add(c);
    }

    public static List<Cliente> recuperarTodosClientes() {
        return clientes;
    }
    
    public static void removerCliente(Cliente c) {
        clientes.remove(c);
    }
}
