package model.modelAluguel;

import model.Aluguel;
import model.Carro;
import model.Van;

/**
 *
 * @author Filipe Zulian
 */
public class Diario extends Aluguel {
    //temq ter cliente e veiculo adicionado, quando "executar" um aluguel diario, vincular a um carro e a um cliente

    @Override
    public float calcularValorAluguel(int qtdTempo) {
        float valorAluguel = (this.veiculo.getPrecoDia() * qtdTempo);
        this.preco = valorAluguel;
        return valorAluguel;
    }
}
