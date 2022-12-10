/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.catalogo;

import dao.CatalogoDAO;
import exceptions.PlacaExistenteException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Carro;
import model.Catalogo;
import model.Van;
import model.Veiculo;
import view.TelasCatalogo.AdicionarVeiculoView;

/**
 *
 * @author Filipe Zulian
 */
public class AdicionarVeiculoController {

    private AdicionarVeiculoView avv;

    public AdicionarVeiculoController(AdicionarVeiculoView avv) {
        this.avv = avv;
        adicionarAcaoBotao();
        popularComboBox();
        exibirTela();
    }

    public void adicionarAcaoBotao() {
        avv.adicionarAcaoBotaoCadastrar(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                Catalogo c = avv.getCatalogo();
                String placa = avv.getPlaca();
                String modelo = avv.getModelo();
                String marca = avv.getMarca();
                boolean alugado = false;
                float precoDia = avv.getPrecoDia();
                int km = avv.getKm();

                try {
                    Veiculo veiculo = criarVeiculo(c, placa, modelo, marca, precoDia, alugado, km);

                    c.addVeiculo(veiculo);

                    JOptionPane.showMessageDialog(null, "Veiculo adicionado com sucesso!");

                    if (veiculo.getID() == 1) {
                        c.addVeiculoMap(veiculo);
                    } else {
                        //TODO

                        c.addVeiculoMap(veiculo);
                    }

                } catch (PlacaExistenteException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });
    }

    private Veiculo criarVeiculo(Catalogo c, String placa, String modelo, String marca, float precoDia, boolean alugado, int km) throws PlacaExistenteException {
        if (c.getTipo().equalsIgnoreCase("carro")) {
            Veiculo v = new Carro(placa, marca, modelo, km, alugado, precoDia);
            return v;
        } else {
            Veiculo v = new Van(placa, marca, modelo, km, alugado, precoDia);
            return v;
        }
    }

    private void popularComboBox() {
        List<Catalogo> catalogo = new ArrayList<>();

        for (Catalogo cat : CatalogoDAO.recuperarTodosCatalogos()) {
            catalogo.add(cat);
        }

        this.avv.popularComboBox(catalogo);
    }

    public void exibirTela() {
        this.avv.exibir();
    }
}
