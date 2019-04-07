
package projeto_werton;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class telaGaus extends javax.swing.JFrame {

    public telaGaus() {
        initComponents();
        txtCampo.setEnabled(false);
    }

    
//    public void imprimirMatriz(int matriz[][],int n){
//        DefaultTableModel model = (DefaultTableModel) tableMatriz.getModel();
//        model.setRowCount(n);//numero de colunas
//        model.setColumnCount(n);//numero de filas
//        
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                tableMatriz.setValueAt(matriz[i][j], i, j);
//            }
//        }
//    }
     
    public void Gaus(float m[][],int n){
        int ordem = 3;
        float pivo = 0;
        float fmult, soma = 0;
        float[] solucao = new float[ordem];
        
        for (int i = 0; i < ordem - 1; i++) {
            pivo = m[i][i];
            for (int j = i + 1; j < ordem; j++) {
                fmult = -(m[j][i] / pivo);
                //System.out.println(mult);
                for (int k = 0; k < ordem + 1; k++) {
                    m[j][k] = m[j][k] + (m[i][k] * fmult);
                    //System.out.print(m[j][k]+" ");
                }
                System.out.println();
            }
        }
        getDados(n);

        solucao[ordem - 1] = (float) Math.ceil(m[ordem - 1][ordem] / m[ordem - 1][ordem - 1]);

        for (int i = ordem - 2; i >= 0; i--) {
            for (int j = i + 1; j < ordem; j++) {
                soma = soma - solucao[j] * m[i][j];
                //System.out.println(soma);
            }
            solucao[i] = (float) Math.ceil((m[i][ordem] + soma) / m[i][i]);
            soma = 0;
        }
        System.out.print("\nVetor solução: ");
        for (int j = 0; j < ordem; j++) {
            System.out.print(solucao[j] + " ");
        }
        System.out.println();
    }
    
    
    public float[][] matriz(){
        DefaultTableModel model = (DefaultTableModel) tableMatriz.getModel();
        int n = Integer.parseInt(txt_matriz.getText());
        float[][] matriz = new float[n][n+1];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n+1;j++){
                matriz[i][j] = Integer.parseInt((String) model.getValueAt(i, j));
            }
        }
        return matriz;
    }
    
    public void imprimir(int n){
        float[][] m = new float[n][n+1];
        m = matriz();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n + 1; j++) {
                if (j == n) {
                    System.out.print("| " + m[i][j]);
                } else {
                    System.out.print(m[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }
    
    public void CriaTabela(int n){
        DefaultTableModel model = (DefaultTableModel) tableMatriz.getModel();
        model.setRowCount(n);//numero de colunas
        model.setColumnCount(n+1);//numero de filas
    }
    
    public void getDados(int n){
        DefaultTableModel model = (DefaultTableModel) tableMatriz.getModel();
        //JOptionPane.showMessageDialog(null, "Linhas: "+model.getColumnCount()+"\nColunas: "+model.getColumnCount());
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n+1; j++) {
                if (j == n) {
                    txtCampo.append("| "+model.getValueAt(i, j));
                } else {
                    txtCampo.append(model.getValueAt(i, j)+"\t");
                }
            }
            txtCampo.append("\n");
        }
    }
    
    public void clearDados(){
        DefaultTableModel model = (DefaultTableModel) tableMatriz.getModel();
        int x = model.getRowCount();
        
        for (int i = 0; i <x; i++) {
            model.removeRow(0);
        }
    }
    
//    public int[][] gerarMatriz(int n){
//    int[][] matriz = new int[n][n];
//    int limite = n-1;
//    int inicio = 0;
//    int c = 1;
//    //matriz caracol ou espiral
//    while(c<=(n*n)){
//        for(int i=inicio;i<=limite;i++){
//            matriz[inicio][i] = c++;
//        }
//        for(int i=inicio+1;i<=limite;i++){
//            matriz[i][limite] = c++;
//        }
//        for(int i=limite-1;i>=inicio;i--){
//            matriz[limite][i] = c++;
//        }
//        for(int i=limite-1;i>=inicio+1;i--){
//            matriz[i][inicio] = c++;
//        }
//        limite = limite - 1;
//        inicio = inicio + 1;
//    }
//    
//    return matriz;
//    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_matriz = new javax.swing.JTextField();
        bnt_gerarMatriz = new javax.swing.JButton();
        bnt_Limpar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMatriz = new javax.swing.JTable();
        bnt_calcular = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtCampo = new javax.swing.JTextArea();
        btn_clearMatriz = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Gaus");

        jLabel1.setText("Informe a ordem da matriz: ");

        txt_matriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_matrizActionPerformed(evt);
            }
        });

        bnt_gerarMatriz.setText("Gerar");
        bnt_gerarMatriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt_gerarMatrizActionPerformed(evt);
            }
        });

        bnt_Limpar.setText("Limpar");
        bnt_Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt_LimparActionPerformed(evt);
            }
        });

        tableMatriz.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableMatriz);

        bnt_calcular.setText("Calcular");
        bnt_calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt_calcularActionPerformed(evt);
            }
        });

        txtCampo.setColumns(20);
        txtCampo.setRows(5);
        jScrollPane2.setViewportView(txtCampo);

        btn_clearMatriz.setText("Apagar Matriz");
        btn_clearMatriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearMatrizActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_matriz, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bnt_gerarMatriz, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bnt_Limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_clearMatriz)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bnt_calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_matriz, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnt_gerarMatriz, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnt_Limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bnt_calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_clearMatriz))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(988, 529));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_matrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_matrizActionPerformed

    }//GEN-LAST:event_txt_matrizActionPerformed

    private void bnt_gerarMatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt_gerarMatrizActionPerformed

        
        int n = Integer.parseInt(txt_matriz.getText());
        int[][] matriz = new int[10][10];
        //matriz = this.gerarMatriz(n);
        CriaTabela(n);
    }//GEN-LAST:event_bnt_gerarMatrizActionPerformed

    private void bnt_LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt_LimparActionPerformed
        txt_matriz.setText(null);
        txtCampo.setText(null);
    }//GEN-LAST:event_bnt_LimparActionPerformed

    private void bnt_calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt_calcularActionPerformed
        //JOptionPane.showMessageDialog(null, 0);
        int n = Integer.parseInt(txt_matriz.getText());
        getDados(n);
        imprimir(n);
    }//GEN-LAST:event_bnt_calcularActionPerformed

    private void btn_clearMatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearMatrizActionPerformed
        clearDados();
    }//GEN-LAST:event_btn_clearMatrizActionPerformed

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
            java.util.logging.Logger.getLogger(telaGaus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaGaus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaGaus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaGaus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaGaus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnt_Limpar;
    private javax.swing.JButton bnt_calcular;
    private javax.swing.JButton bnt_gerarMatriz;
    private javax.swing.JButton btn_clearMatriz;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableMatriz;
    private javax.swing.JTextArea txtCampo;
    private javax.swing.JTextField txt_matriz;
    // End of variables declaration//GEN-END:variables
}
