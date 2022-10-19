/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Model.Carro;
import Model.Catalogo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Filipe Zulian
 */
public class CatalogoDAO {
    private static List<Catalogo> catalogos = new ArrayList<>();
    
    public static void salvarCatalogo(Catalogo cat) {
        catalogos.add(cat);
    }

    public static List<Catalogo> recuperarTodosCatalogos() {
        return catalogos;
    }
    
    public static void removerCatalogo(Catalogo cat) {
        catalogos.remove(cat);
    }
}
