/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TelaHome;

import model.Catalogo;
import view.TelasAluguel.AlugarView;
import view.TelasAluguel.DevolucaoView;
import view.TelasCatalogo.AdicionarVeiculoView;
import view.TelasCatalogo.ApagarVeiculoView;
import view.TelasCliente.AdicionarClienteView;
import view.TelasCliente.ApagarClienteView;
import view.TelasCliente.EditarClienteView;
import dao.CatalogoDAO;
import view.TelasCatalogo.EditarVeiculoView;
import view.TelasCatalogo.PesquisarVeiculoView;

/**
 *
 * @author Filipe Zulian
 */
public class HomeView extends javax.swing.JFrame {

    /**
     * Creates new form HomeView
     */
    public HomeView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MnCatálogo = new javax.swing.JMenu();
        miAddVeiculo = new javax.swing.JMenuItem();
        miPesquisar = new javax.swing.JMenuItem();
        miEditarVeiculo = new javax.swing.JMenuItem();
        miApagarVeiculo = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        miAlugar = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        miDevolver = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        miAddCliente = new javax.swing.JMenuItem();
        miEditarCliente = new javax.swing.JMenuItem();
        miApagarCliente = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel1.setText("\"O melhor, desde 2007\"");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bmw.jpg"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel3.setText("Mauricio's Aluguel");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jLabel1)))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel3)
                .addGap(37, 37, 37)
                .addComponent(jLabel2)
                .addGap(57, 57, 57)
                .addComponent(jLabel1)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        jMenuBar1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jMenuBar1.setPreferredSize(new java.awt.Dimension(246, 50));

        MnCatálogo.setText("Catálogo");
        MnCatálogo.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N

        miAddVeiculo.setText("Adicionar Veículo");
        miAddVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAddVeiculoActionPerformed(evt);
            }
        });
        MnCatálogo.add(miAddVeiculo);

        miPesquisar.setText("Pesquisar Catálogo");
        miPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miPesquisarActionPerformed(evt);
            }
        });
        MnCatálogo.add(miPesquisar);

        miEditarVeiculo.setText("Editar Veículo");
        miEditarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miEditarVeiculoActionPerformed(evt);
            }
        });
        MnCatálogo.add(miEditarVeiculo);

        miApagarVeiculo.setText("Apagar Veículo");
        miApagarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miApagarVeiculoActionPerformed(evt);
            }
        });
        MnCatálogo.add(miApagarVeiculo);

        jMenuBar1.add(MnCatálogo);

        jMenu2.setText("Aluguel");
        jMenu2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N

        miAlugar.setText("Alugar");
        miAlugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAlugarActionPerformed(evt);
            }
        });
        jMenu2.add(miAlugar);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Devolução");
        jMenu3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N

        miDevolver.setText("Devolver");
        miDevolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miDevolverActionPerformed(evt);
            }
        });
        jMenu3.add(miDevolver);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Cliente");
        jMenu4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N

        miAddCliente.setText("Adicionar Cliente");
        miAddCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAddClienteActionPerformed(evt);
            }
        });
        jMenu4.add(miAddCliente);

        miEditarCliente.setText("Editar Cliente");
        miEditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miEditarClienteActionPerformed(evt);
            }
        });
        jMenu4.add(miEditarCliente);

        miApagarCliente.setText("Apagar Cliente");
        miApagarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miApagarClienteActionPerformed(evt);
            }
        });
        jMenu4.add(miApagarCliente);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miPesquisarActionPerformed
        PesquisarVeiculoView pv = new PesquisarVeiculoView();
        
        pv.setVisible(true);
    }//GEN-LAST:event_miPesquisarActionPerformed

    private void miEditarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miEditarVeiculoActionPerformed
        EditarVeiculoView ev = new EditarVeiculoView();
      
      ev.setVisible(true);
    }//GEN-LAST:event_miEditarVeiculoActionPerformed

    private void miAddVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAddVeiculoActionPerformed
      AdicionarVeiculoView av = new AdicionarVeiculoView();
      
      av.setVisible(true);
    }//GEN-LAST:event_miAddVeiculoActionPerformed

    private void miApagarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miApagarVeiculoActionPerformed
      ApagarVeiculoView apv = new ApagarVeiculoView();
      
      apv.setVisible(true);
    }//GEN-LAST:event_miApagarVeiculoActionPerformed

    private void miAlugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAlugarActionPerformed
      AlugarView av = new AlugarView();
      
      av.setVisible(true);
    }//GEN-LAST:event_miAlugarActionPerformed

    private void miDevolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miDevolverActionPerformed
       DevolucaoView dv = new DevolucaoView();
       
       dv.setVisible(true);
    }//GEN-LAST:event_miDevolverActionPerformed

    private void miAddClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAddClienteActionPerformed
        AdicionarClienteView ac = new AdicionarClienteView();
        
        ac.setVisible(true);
    }//GEN-LAST:event_miAddClienteActionPerformed

    private void miEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miEditarClienteActionPerformed
        EditarClienteView ec = new EditarClienteView();
        
        ec.setVisible(true);
    }//GEN-LAST:event_miEditarClienteActionPerformed

    private void miApagarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miApagarClienteActionPerformed
       ApagarClienteView ac = new ApagarClienteView();
       
       ac.setVisible(true);
    }//GEN-LAST:event_miApagarClienteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                Catalogo c1 = new Catalogo();
                
                c1.setTipo("carro");
                
                Catalogo c2 = new Catalogo();
                
                c2.setTipo("van");
                
                CatalogoDAO.salvarCatalogo(c1);
                CatalogoDAO.salvarCatalogo(c2);
                
                new HomeView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MnCatálogo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem miAddCliente;
    private javax.swing.JMenuItem miAddVeiculo;
    private javax.swing.JMenuItem miAlugar;
    private javax.swing.JMenuItem miApagarCliente;
    private javax.swing.JMenuItem miApagarVeiculo;
    private javax.swing.JMenuItem miDevolver;
    private javax.swing.JMenuItem miEditarCliente;
    private javax.swing.JMenuItem miEditarVeiculo;
    private javax.swing.JMenuItem miPesquisar;
    // End of variables declaration//GEN-END:variables
}
