package JDialog;
import classes.Professor;
import gerente.GerenteProfessor;
import javax.swing.JOptionPane;
public class JDProfessor extends javax.swing.JDialog {
    
    private GerenteProfessor professores;
    private Professor professor;
    private boolean edicao = false;
    
    public JDProfessor(java.awt.Frame parent, boolean modal, GerenteProfessor gerente) {
        super(parent, modal);
        initComponents();
        
        //Instanciando a classe professor/gerenteProfessor
        
        this.professor = new Professor();
        this.professores = new GerenteProfessor();
        
        //definindo o Objeto gerenteProfessor recebendo o gerente que foi passado como parametro.
        this.professores = gerente;
        
        this.TextAreaImprimir.setEnabled(false);
        this.TextAreaImprimir.setText(professores.toString());
        
        this.Limpar_Campos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTitle = new javax.swing.JPanel();
        jlbTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextAreaImprimir = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jblCPF = new javax.swing.JLabel();
        jblNome = new javax.swing.JLabel();
        jblGenero = new javax.swing.JLabel();
        edtCPF = new javax.swing.JTextField();
        edtNome = new javax.swing.JTextField();
        edtGenero = new javax.swing.JTextField();
        jblIdade = new javax.swing.JLabel();
        edtIdade = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jlbTitle.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jlbTitle.setText("Cadastro Professor");

        TextAreaImprimir.setColumns(20);
        TextAreaImprimir.setRows(5);
        jScrollPane1.setViewportView(TextAreaImprimir);

        jblCPF.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jblCPF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jblCPF.setText("CPF:");

        jblNome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jblNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jblNome.setText("Nome:");

        jblGenero.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jblGenero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jblGenero.setText("Gênero:");

        jblIdade.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jblIdade.setText("Idade:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jblCPF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jblNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jblGenero, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(edtGenero, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                        .addGap(530, 530, 530))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(edtCPF)
                                .addGap(170, 170, 170))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(edtNome)
                                .addGap(47, 47, 47)))
                        .addComponent(jblIdade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtIdade)))
                .addGap(39, 39, 39))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(edtCPF))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(edtIdade)
                                .addGap(4, 4, 4))
                            .addComponent(jblIdade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jblCPF))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(edtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                    .addComponent(jblNome))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(edtGenero))
                    .addComponent(jblGenero))
                .addGap(18, 18, 18))
        );

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/novo_32x32.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/edit3_32x32.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cancel_32x32.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/del_32x32.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/save_32x32.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(btnNovo, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                .addGap(105, 105, 105))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelTitleLayout = new javax.swing.GroupLayout(jPanelTitle);
        jPanelTitle.setLayout(jPanelTitleLayout);
        jPanelTitleLayout.setHorizontalGroup(
            jPanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTitleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(256, 256, 256))
            .addGroup(jPanelTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(21, 21, 21))
        );
        jPanelTitleLayout.setVerticalGroup(
            jPanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTitleLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jlbTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        this.Habilitar_Campos(true);
        this.Limpar_Campos();
        this.edicao = false;
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        
        this.Habilitar_Campos(false);
        Professor P1 = new Professor();
        
        //Será base do antigo objeto para localizar no btnSalvar
        professor = new Professor();
        
        //Métodos para LIMPAR/Habilitar os campos
        this.Limpar_Campos();
        
        this.edicao = true;
        String index_escolhido = JOptionPane.showInputDialog("Informe o CPF do professor a ser editado.");
        int CPF_Professor = Integer.parseInt(index_escolhido);
        P1 = this.professores.Busca_Professor(CPF_Professor);
        
        if(P1 != null){
            this.Habilitar_Campos_Edicao(true);
            this.Preencher_Campos(P1);
            professor = P1;
        }else{
            JOptionPane.showMessageDialog(this, "Professor não encontrado.");
            this.Limpar_Campos();
            this.Habilitar_Campos(false);
        }
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.Limpar_Campos();
        this.Habilitar_Campos(false);
        this.edicao = false;
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        this.Habilitar_Campos(false);
        this.edicao = false;
        
        //Convertendo de String para int
        int CPF = Integer.parseInt(JOptionPane.showInputDialog("Me informe o CPF do professor para ser excluido"));
        
        Professor localizacao_list = this.professores.Busca_Professor(CPF);
        
        if (localizacao_list != null) {
            this.professores.getProfessores().remove(localizacao_list);
            TextAreaImprimir.setText(this.professores.toString());
            this.Limpar_Campos();
            this.Habilitar_Campos(false);
            JOptionPane.showMessageDialog(this, "Professor Removido com sucesso.");
        }else{
            JOptionPane.showMessageDialog(this, "Error: Professor não localizado");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        
        Professor Teste = new Professor();
        
        if (edicao == false){
           this.Coletar_Campos(Teste);
           Professor P1 = professores.Busca_Professor(Teste.getCpf());
           if (P1 == null){
                professores.Adiciona_Professor(Teste);
                TextAreaImprimir.setText(professores.toString());
                this.Limpar_Campos();
                this.Habilitar_Campos(false);
            }else{
                JOptionPane.showMessageDialog(this, "Já existe um professor com este CPF.");
                this.Limpar_Campos();
                this.Habilitar_Campos(false);
            }
        }else{
            this.Coletar_Campos(Teste);
            this.professores.Atualizar(professor.getCpf(), Teste);
            JOptionPane.showMessageDialog(this, "Professor Atualizado com sucesso.");
            this.Limpar_Campos();
            this.Habilitar_Campos(false);
            TextAreaImprimir.setText(professores.toString());
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    public void Limpar_Campos(){
        edtCPF.setText("");
        edtGenero.setText("");
        edtIdade.setText("");
        edtNome.setText("");
    }
    
    public void Habilitar_Campos(boolean flag){
        edtCPF.setEnabled(flag);
        edtGenero.setEnabled(flag);
        edtIdade.setEnabled(flag);
        edtNome.setEnabled(flag);
    }
    
    public void Habilitar_Campos_Edicao(boolean flag){
        edtCPF.setEnabled(false);
        edtGenero.setEnabled(flag);
        edtIdade.setEnabled(flag);
        edtNome.setEnabled(flag);
    }
    
    public void Coletar_Campos(Professor A1){
        A1.setCpf(Integer.parseInt(edtCPF.getText()));
        A1.setIdade(Integer.parseInt(edtIdade.getText()));
        A1.setNome(edtNome.getText());
        A1.setSexo(edtGenero.getText());
    }
    
    public void Preencher_Campos(Professor P1){
        edtCPF.setText(String.valueOf(P1.getCpf()));
        edtIdade.setText(String.valueOf(P1.getIdade()));
        edtGenero.setText(P1.getSexo());
        edtNome.setText(P1.getNome());
    }
    
    /**
     * @param args the command line arguments
     */
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea TextAreaImprimir;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField edtCPF;
    private javax.swing.JTextField edtGenero;
    private javax.swing.JTextField edtIdade;
    private javax.swing.JTextField edtNome;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelTitle;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jblCPF;
    private javax.swing.JLabel jblGenero;
    private javax.swing.JLabel jblIdade;
    private javax.swing.JLabel jblNome;
    private javax.swing.JLabel jlbTitle;
    // End of variables declaration//GEN-END:variables
}
