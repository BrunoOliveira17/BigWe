/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Scorpion
 */
public class TelaJordan extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaJordan
     */
    DecimalFormat formato = new DecimalFormat("#.####");
    int numIncog;
    DefaultTableModel modelo = new DefaultTableModel();
    boolean controle = false;

    public TelaJordan() {
        this.setLocation(230, 30);
        initComponents();
    }

    public int getNumIncog() {
        return numIncog;
    }

    public void setNumIncog(int numIncog) {
        this.numIncog = numIncog;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNumIncog = new javax.swing.JTextField();
        btnGerarMatriz = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        btnResolver = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        btnLimpar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnZerarTabela = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Método de Jordan");
        setPreferredSize(new java.awt.Dimension(885, 520));

        jLabel1.setText("Informe o número de incognitas:");

        btnGerarMatriz.setText("Gerar Matriz");
        btnGerarMatriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarMatrizActionPerformed(evt);
            }
        });

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "X"
            }
        ));
        tabela.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabela);

        btnResolver.setText("Resolver o Sistema");
        btnResolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResolverActionPerformed(evt);
            }
        });

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane2.setViewportView(textArea);

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Processo");

        btnZerarTabela.setText("Zerar Tabela");
        btnZerarTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZerarTabelaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelLayout = new javax.swing.GroupLayout(painel);
        painel.setLayout(painelLayout);
        painelLayout.setHorizontalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(painelLayout.createSequentialGroup()
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelLayout.createSequentialGroup()
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNumIncog, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 427, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelLayout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(btnZerarTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnResolver, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(painelLayout.createSequentialGroup()
                    .addGap(320, 320, 320)
                    .addComponent(btnGerarMatriz, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(20, 20, 20)
                    .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(painelLayout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jScrollPane2))
                        .addGroup(painelLayout.createSequentialGroup()
                            .addGap(186, 186, 186)
                            .addComponent(jLabel2)
                            .addGap(0, 173, Short.MAX_VALUE)))
                    .addContainerGap()))
        );
        painelLayout.setVerticalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumIncog, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnZerarTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnResolver, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(99, 99, 99)
                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(painelLayout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnGerarMatriz, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(painelLayout.createSequentialGroup()
                            .addGap(8, 8, 8)
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(64, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGerarMatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarMatrizActionPerformed
        try {
            this.setNumIncog(Integer.parseInt(txtNumIncog.getText()));
            numIncog = this.getNumIncog();
            if (numIncog <= 1) {
                throw new Exception("Número de incognitas invalido!");
            }
            Object coluna[] = new Object[numIncog + 1];
            for (int i = 0; i < numIncog + 1; i++) {
                if (i < numIncog) {
                    coluna[i] = "X" + (i + 1);
                } else {
                    coluna[i] = "S";
                }
            }
            modelo = new DefaultTableModel(coluna, numIncog);
            tabela.setModel(modelo);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnGerarMatrizActionPerformed

    private void btnResolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResolverActionPerformed
        // TODO add your handling code here:
        try {
            int n = this.getNumIncog();
            double matCoef[][] = new double[n][n];//Armazena os numeros dos coeficientes inseridos na tabela
            double solucoes[] = new double[n];//Armazena os valores das solucoes de cada equacao
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matCoef[i][j] = Double.parseDouble(String.valueOf(tabela.getValueAt(i, j)));
                }
                solucoes[i] = Double.parseDouble(String.valueOf(tabela.getValueAt(i, n)));
            }
            solucoes = this.calcular(matCoef, solucoes);
            for (int i = 0; i < n; i++) {
                textArea.append("X" + (i + 1) + " = " + solucoes[i] + "\n");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro na leitura dos dados da tabela!");
        }

    }//GEN-LAST:event_btnResolverActionPerformed
    
     public int tratandoMatriz(double[][] matriz, int ordem, int posicao) {
        int qtdTrocas = 0;//o retorno é quantidade de trocas(de colunas) que ele faz em cada linha
        for (int j = 1; j < ordem - posicao; j++) {
            if (matriz[posicao][posicao] == 0) {
                qtdTrocas++;
                for (int i = 0; i < ordem; i++) {
                    double aux = matriz[i][posicao];
                    matriz[i][posicao] = matriz[i][posicao + j];
                    matriz[i][posicao + j] = aux;
                }
            }
        }
        return qtdTrocas;
    }
    
    public double formata(double num) {
        return Double.parseDouble(formato.format(num).replace(',', '.'));
    }

    private double[] calcular(double[][] matCoef, double[] solucoes) {
        int n = this.getNumIncog();
        int[] qtdTrocas = new int[n];
        for (int i = 0; i < n; i++) {
            qtdTrocas[i] = tratandoMatriz(matCoef, n, i);
            double pivo, aux = 0;
            pivo = matCoef[i][i];//Selecionar o pivo 
            //double num = Double.parseDouble(formato.format(2.1617).replace(',','.'));
            textArea.append(formata(1 / pivo) + "Eq" + (i + 1) + "\n");
            for (int j = 0; j < n; j++) {
                matCoef[i][j] = formata(matCoef[i][j] / pivo);
            }
            solucoes[i] = formata(solucoes[i] / pivo);
            //Imprimir o processo na area de texto
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    textArea.append(Double.toString(matCoef[j][k]) + "    ");
                }
                textArea.append("|    " + Double.toString(solucoes[j]) + "\n");
            }
            textArea.append("\n\n");

            for (int x = 0; x < n; x++) {
                if (i != x) {
                    aux = matCoef[x][i];
                    textArea.append("-" + Double.toString(aux) + "* Eq" + (i + 1) + "+ Eq" + (x + 1) + "\n");
                    for (int y = 0; y < n; y++) {
                        matCoef[x][y] = formata(matCoef[x][y] - (aux * matCoef[i][y]));
                    }
                    solucoes[x] = formata(solucoes[x] - (aux * solucoes[i]));
                    //Imprime o processo na area de texto
                    for (int j = 0; j < n; j++) {
                        for (int k = 0; k < n; k++) {
                           textArea.append(Double.toString(matCoef[j][k]) + "    ");
                        }
                        textArea.append("|    " + Double.toString(solucoes[j]) + "\n");
                    }
                    textArea.append("\n\n");
                }

            }

        }
        /*A partir desse ponto são feitas as trocas dos valores de x[i], da maneira correta,
		pois ao decorrer da execução dos programa podem ter sido alterado algumas colunas
		para a finalização do calculo*/
        for (int i = n - 1; i >= 0; i--) {
            if (qtdTrocas[i] > 0) {
                for (int a = 0; a < qtdTrocas[i]; a++) {
                    //System.out.println("x[" + i + "] = x[" + (i + qtdTrocas[i] - a) + "]");
                    double aux = solucoes[i];
                    solucoes[i] = solucoes[i + qtdTrocas[i] - a];
                   solucoes[i + qtdTrocas[i] - a] = aux;
                }
            }
        }
        return solucoes;
    }

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // TODO add your handling code here:
        textArea.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnZerarTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZerarTabelaActionPerformed
        // TODO add your handling code here:
        modelo.setColumnCount(0);
        modelo.setRowCount(0);
    }//GEN-LAST:event_btnZerarTabelaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGerarMatriz;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnResolver;
    private javax.swing.JButton btnZerarTabela;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel painel;
    private javax.swing.JTable tabela;
    private javax.swing.JTextArea textArea;
    private javax.swing.JTextField txtNumIncog;
    // End of variables declaration//GEN-END:variables
}
