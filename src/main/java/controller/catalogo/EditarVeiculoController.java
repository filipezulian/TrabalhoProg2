package controller.catalogo;

import dao.CatalogoDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Catalogo;
import model.Veiculo;
import view.TelasCatalogo.EditarVeiculoView;

public class EditarVeiculoController {

    private EditarVeiculoView evv;

    public EditarVeiculoController(EditarVeiculoView evv) {
        this.evv = evv;
        popularComboBox();
        exibirTela();
        adicionarAcaoBotao();
    }

    public void exibirTela() {
        this.evv.exibir();
    }

    private void popularComboBox() {
        List<Veiculo> veiculos = new ArrayList<>();
        
         for (Catalogo c : CatalogoDAO.recuperarTodosCatalogos()) {
            for (Veiculo v : c.getVeiculos()) {
                veiculos.add(v);
            }
         }
    }

    public void atualizarVeiculo(Veiculo v, float precoDia, int km) {
        if (!evv.getPreco().isBlank()) {
            v.setPrecoDia(Float.parseFloat(evv.getPreco()));
        } else {
            v.setPrecoDia(precoDia);
        }

        if (!evv.getKm().isBlank()) {
            v.setKm(Integer.parseInt(evv.getKm()));
        } else {
            v.setKm(km);
        }
    }

    public void adicionarAcaoBotao() {
        evv.adicionarAcaoBotaoAdicionar(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Veiculo v = (Veiculo) evv.getVeiculos();

                float precoDia = v.getPrecoDia();
                int km = v.getKm();
                atualizarVeiculo(v, precoDia, km);

                JOptionPane.showMessageDialog(null, "Veículo atualizado com sucesso!");
                popularComboBox();
                evv.limparTela();
            }  
        });
    }


}
