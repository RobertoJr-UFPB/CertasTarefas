

package view;

import conector.ConectorDeTarefas;
import javax.swing.JOptionPane;
import model.Tarefa;
import table.TabelaDeTarefas;

/**
 *
 * @author Roberto
 */
public class TarefasView extends javax.swing.JFrame {
    Tarefa tarefa = new Tarefa();
    ConectorDeTarefas conectorTarefa = new ConectorDeTarefas();
    public TarefasView() {
        initComponents();
        setLocationRelativeTo(null);
        tbtarefas.setModel(new TabelaDeTarefas(new ConectorDeTarefas().listarTarefas()));
        btnExcluir.setEnabled(false);
    } 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        titulo = new javax.swing.JTextField();
        descricao = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbtarefas = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        pesquisar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Certas Tarefas");
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel2.setText("Titulo:");

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel3.setText("DescriÁ„o:");

        descricao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                descricaoMouseClicked(evt);
            }
        });

        btnSalvar.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnLimpar.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        tbtarefas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbtarefas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbtarefasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbtarefas);

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel4.setText("Pesquise Tarefas Cadastradas:");

        pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel1.setText("PosiÁ„o:");

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel5.setText("Cadastro de Tarefas");

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel6.setText("Tarefas Cadastradas");

        jLabel7.setText("Para editar uma tarefa, primeiro clique na tarefa salva na tabela e depois de editar os campos, clique em salvar. ");

        jLabel8.setText("Para salvar uma tarefa n„o se deve colocar uma posiÁ„o, ela È usada para facilitar buscas manuais na tabela. ");

        jLabel9.setText("Para realizar uma busca automatica, digite algo da descriÁ„o no campo \"Pesquise Tarefas Cadastradas\".");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel1))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jLabel5)))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(24, 24, 24)
                            .addComponent(pesquisar)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(jLabel6)
                        .addGap(186, 186, 186)))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSalvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLimpar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnExcluir))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//MÈtodo para implementar o bot√£o de salvar
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if(descricao.getText().equals("")|| titulo.getText().equals("")){
            JOptionPane.showMessageDialog(null,"H√° campos em branco, os preencha!","Campos em branco.",JOptionPane.WARNING_MESSAGE);
        }else{
             if(id.getText().equals("")){
            tarefa.setDescricao(descricao.getText());
            tarefa.setTitulo(titulo.getText());
            conectorTarefa.inserir(tarefa);
        } else{
            tarefa.setID(Integer.parseInt(id.getText()));
            tarefa.setDescricao(descricao.getText());
            
            tarefa.setTitulo(titulo.getText());
            conectorTarefa.editar(tarefa);
        }
        }
       
            
        tbtarefas.setModel(new TabelaDeTarefas(new ConectorDeTarefas().listarTarefas()));
        titulo.setText("");
        descricao.setText("");
       
        pesquisar.setText("");
    }//GEN-LAST:event_btnSalvarActionPerformed
//MÈtodo para implementar o bot√£o de limpar
    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        tbtarefas.setModel(new TabelaDeTarefas(new ConectorDeTarefas().listarTarefas()));
        titulo.setText("");
        id.setText("");
        descricao.setText("");
        pesquisar.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed
//MÈtodo para implementar o bot√£o de excluir
    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int escolha = JOptionPane.showConfirmDialog(null, "Certeza que quer exluir a linha?", "Confirma√ß√£o",JOptionPane.YES_NO_OPTION);
        if(escolha==0){
            int posicao = Integer.parseInt(id.getText()); 
            conectorTarefa.excluir(posicao);
            tbtarefas.setModel(new TabelaDeTarefas(new ConectorDeTarefas().listarTarefas()));
            titulo.setText("");
            id.setText("");
            descricao.setText("");
            pesquisar.setText("");
        }
        btnExcluir.setEnabled(false);
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void descricaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_descricaoMouseClicked
        
    }//GEN-LAST:event_descricaoMouseClicked
//MÈtodo para quando clicar na linha da tabela os campos de texto usarem os daddos da linha
    private void tbtarefasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbtarefasMouseClicked
        id.setText(tbtarefas.getValueAt(tbtarefas.getSelectedRow(), TabelaDeTarefas.COL_ID_TAREFA).toString());
        titulo.setText(tbtarefas.getValueAt(tbtarefas.getSelectedRow(), TabelaDeTarefas.COL_TITULO_TAREFA).toString());
        descricao.setText(tbtarefas.getValueAt(tbtarefas.getSelectedRow(), TabelaDeTarefas.COL_DESCRICAO_TAREFA).toString());
        btnExcluir.setEnabled(true);
    }//GEN-LAST:event_tbtarefasMouseClicked
//MÈtodo para pesuisar na tabela
    private void pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarActionPerformed
        String pesquisa = pesquisar.getText();
        tbtarefas.setModel(new TabelaDeTarefas(new ConectorDeTarefas().consultaDeTarefas(pesquisa)));
    }//GEN-LAST:event_pesquisarActionPerformed
//MÈtodo para implementar o ato de clicar em campo normal no formul√°rio
    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        btnExcluir.setEnabled(false);
        tbtarefas.setModel(new TabelaDeTarefas(new ConectorDeTarefas().listarTarefas()));
    }//GEN-LAST:event_formMouseClicked

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TarefasView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField descricao;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pesquisar;
    private javax.swing.JTable tbtarefas;
    private javax.swing.JTextField titulo;
    // End of variables declaration//GEN-END:variables
}
