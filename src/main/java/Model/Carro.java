
package model;


public class Carro extends Veiculo implements Multa  {

    public Carro(String placa, String marca, String modelo, int km, boolean alugado, float precoDia) {
        super(placa, marca, modelo, km, alugado, precoDia);
    } 

    @Override
    public float calcularMultaVeiculo(int qtdDiasAtrasado) {
       return ((4*precoDia)*qtdDiasAtrasado);
    }

    @Override
    public String toString() {
        return "Carro: " + super.toString();
    }
}
