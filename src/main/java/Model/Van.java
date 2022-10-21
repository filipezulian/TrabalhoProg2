
package model;

/**
 *
 * @author Filipe Zulian
 */
public class Van extends Veiculo implements Multa {  

    public Van(String placa, String marca, String modelo, int km, boolean alugado, float precoDia) {
        super(placa, marca, modelo, km, alugado, precoDia);
    }
    
    @Override
      public float calcularMultaVeiculo(int qtdDiasAtrasado){
           return ((2*precoDia)*qtdDiasAtrasado);
}


    @Override
    public String toString() {
        return "Van " + super.toString();
    }
    
}
