package model.modelAluguel;

import model.Aluguel;
import model.Carro;
import model.Van;

/**
 *
 * @author Filipe Zulian
 */
public class Mensal extends Aluguel {

    @Override
    public float calcularValorAluguel(int qtdTempo) {

        //como chegar nessa monstruosidade: O desconto mensal são 6 dias a cada mês alugado, 6 dias equivale a 20% de 30 dias
        float desconto = (((qtdTempo * 30) * this.veiculo.getPrecoDia()) * 0.20f);

        float valorAluguel = (((qtdTempo * 30)*this.veiculo.getPrecoDia()) - desconto);
        this.preco = valorAluguel;
        return valorAluguel;

    }

    //temq ter cliente e veiculo adicionado, quando "executar" um aluguel mensal, vincular a um carro e a um cliente
}
