/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.catalogo;

import dao.CatalogoDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import model.Catalogo;
import model.Veiculo;
import view.TelasCatalogo.ApagarVeiculoView;

/**
 *
 * @author Filipe Zulian
 */
public class ApagarVeiculoController {

    private ApagarVeiculoView avv;

    public ApagarVeiculoController(ApagarVeiculoView avv) {
        this.avv = avv;
        adicionarAcaoBotao();
        popularComboBox();
        exibirTela();
    }

    public void exibirTela() {
        this.avv.exibir();
    }

    private void popularComboBox() {
        List<Veiculo> veiculos = new ArrayList<>();

        for (Catalogo cat : CatalogoDAO.recuperarTodosCatalogos()) {
            for (Veiculo veic : cat.getVeiculos()) {
                veiculos.add(veic);
            }
        }

        this.avv.popularComboBox(veiculos);
    }

  public void adicionarAcaoBotao() {
        avv.adicionarAcaoBotaoApagar(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Veiculo veic = avv.getVeiculo();

                if (veic == null) {
                    avv.exibirMensagem("Não ha nada para remover.");
                } else {
                    for (Catalogo cat : CatalogoDAO.recuperarTodosCatalogos()) {
                        cat.removerVeiculo(veic);
                        avv.exibirMensagem("Veículo removido com sucesso!");

                    }
                }
                avv.limparcb();
                popularComboBox();
            }

        });  

    }

}
