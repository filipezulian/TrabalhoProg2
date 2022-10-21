package model.modelAluguel;

import model.Aluguel;

/**
 *
 * @author Filipe Zulian
 */
public class Semanal extends Aluguel {

    @Override
    public float calcularValorAluguel(int qtdTempo) {
        float valorAluguel = (((qtdTempo * 7) - qtdTempo) * this.veiculo.getPrecoDia());
        this.preco = valorAluguel;
        return valorAluguel;
    }

    //temq ter cliente e veiculo adicionado, quando "executar" um aluguel semanal, vincular a um carro e a um cliente
}
