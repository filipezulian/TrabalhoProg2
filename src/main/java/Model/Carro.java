
package model;

import dao.CatalogoDAO;
import exceptions.PlacaExistenteException;
import java.util.Objects;


public class Carro implements Veiculo {
   private String placa; //nao fiz set get
   private String marca;
   private String modelo;
   private int km;
   private float precoDia;

    public Carro(String placa, String marca, String modelo, int km, float precoDia) throws PlacaExistenteException {
        setPlaca(placa);
        this.marca = marca;
        this.modelo = modelo;
        this.km = km;
        this.precoDia = precoDia;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) throws PlacaExistenteException {
        for(Catalogo c : CatalogoDAO.recuperarTodosCatalogos()) {
            for(Veiculo v : c.getVeiculos()) {
                if(v instanceof Carro carro) {
                    if(carro.getPlaca().equals(placa)) {
                        throw new PlacaExistenteException();
                    }
                } else if(v instanceof Van van) {
                    if(van.getPlaca().equals(placa)) {
                        throw new PlacaExistenteException();
                    }
                }
            }
        }
        
        this.placa = placa;
    }

    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public float getPrecoDia() {
        return precoDia;
    }

    public void setPrecoDia(float precoDia) {
        this.precoDia = precoDia;
    }

    @Override
    public void calcularMultaVeiculo() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Carro other = (Carro) obj;
        if (!Objects.equals(this.placa, other.placa)) {
            return false;
        }
        return Objects.equals(this.modelo, other.modelo);
    }

    

    @Override
    public String toString() {
        return "Carro{" + "placa=" + placa + ", marca=" + marca + ", modelo=" + modelo + ", km=" + km + ", precoDia=" + precoDia + '}';
    }

  
   
   
   
}
