package model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;



/**
 *
 * @author Filipe Zulian
 */
public class Catalogo {
    private int id;
    private String tipo;
    //lista carro e van, hashset, hashmap.
    
    Map<String, Veiculo> mapVeiculos;
    Set<Veiculo> veiculos;

    public Catalogo() {
       veiculos = new HashSet<>();
       mapVeiculos = new HashMap<>();
    }
    
    public void addVeiculoMap(Veiculo v) {
        mapVeiculos.put(v.getPlaca(), v);
    }
    
    public Veiculo buscarVeiculosCatalogo(String placa) {      
        return this.mapVeiculos.get(placa);
    }
    
    public void addVeiculo(Veiculo v) {
        this.veiculos.add(v);
    }
    
    public void removerVeiculo(Veiculo v) {
        this.veiculos.remove(v);
    }

    public Set<Veiculo> getVeiculos() {
        return veiculos;
    }
    
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Catalogo de " + tipo;
    }

   
    public List<Veiculo> ordenarCatalogoCarros() {
        List<Veiculo> listaVeiculos = new ArrayList<>();
        
        for(Veiculo v : this.veiculos) {
            listaVeiculos.add(v);
        }
        
        listaVeiculos.sort(new Comparator<Veiculo>() {
            @Override
            public int compare(Veiculo o1, Veiculo o2) {
                return o1.getMarca().compareTo(o2.getMarca());
            }
        });
        
        
        return listaVeiculos;
    }
    
}
