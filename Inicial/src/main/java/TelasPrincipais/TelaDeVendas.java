/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TelasPrincipais;

import DAO.VendasDAO;
import Tela_Relatorio.TelaRelatorioSintetico;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Cliente;
import model.Produto;
import model.Vendas;

/**
 *
 * @author csnas
 */
public class TelaDeVendas extends javax.swing.JFrame {

    /**
     * Creates new form TeladeVendas
     */
    public TelaDeVendas() {
        initComponents();
        habilitarCampos(false);
    }

    /**
     * função que habilita os campos necessários
     * @param evt 
     */
    private void habilitarCampos(boolean status) {
        btnIniciar.setEnabled(!status);
        btnConcluir.setEnabled(status);
        btnCancelar.setEnabled(status);
        txtCodProd.setEnabled(status);
        txtNomeProd.setEnabled(status);
        txtQnt.setEnabled(status);
        txtValorUnit.setEnabled(status);
        btnAdicionarItem.setEnabled(status);
        btnExcluirItem.setEnabled(status);
        tblItens.setEnabled(status);
        txtCpfCliente.setEnabled(status);
        txtCliente.setEnabled(status);
        boxQntParcelas.setEnabled(status);
        boxTipoPag.setEnabled(status);
        jdcDataVenda.setEnabled(status);

    }

    /**
     * Função que limpa os campos de texto
     * @param evt 
     */
    private void limpaCampos() {
        txtCodProd.setText("");
        txtNomeProd.setText("");
        txtQnt.setText("");
        txtValorUnit.setText("");
        txtCliente.setText("");
        txtCpfCliente.setText("");
        jdcDataVenda.setDate(null);
        boxQntParcelas.setSelectedIndex(0);
        boxTipoPag.setSelectedIndex(0);
        DefaultTableModel tbItens = (DefaultTableModel) tblItens.getModel();
        tbItens.setNumRows(0);
        lblValorFinal.setText("");
    }

    /**
     * Função que demonstra o valor total
     * @param status 
     */
    private void Total(boolean status) {
        double valorTotal = 0;
        int cont = tblItens.getRowCount();

        if (status = true) {
            for (int i = 0; i < cont; i++) {
                valorTotal += Double.parseDouble(tblItens.getValueAt(i, 4).toString());
            }

            lblValorFinal.setText(String.valueOf(valorTotal));
        } else {
            for (int i = 0; i < cont; i++) {
                valorTotal -= Double.parseDouble(tblItens.getValueAt(i, 4).toString());
            }

            lblValorFinal.setText(String.valueOf(valorTotal));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnIniciar = new javax.swing.JButton();
        btnConcluir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblCodVenda = new javax.swing.JLabel();
        lbldataVenda = new javax.swing.JLabel();
        jdcDataVenda = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        lblCodProd = new javax.swing.JLabel();
        txtCodProd = new javax.swing.JTextField();
        lblNomeProd = new javax.swing.JLabel();
        txtNomeProd = new javax.swing.JTextField();
        lblQnt = new javax.swing.JLabel();
        txtQnt = new javax.swing.JTextField();
        lblValorUnit = new javax.swing.JLabel();
        txtValorUnit = new javax.swing.JTextField();
        btnBusca = new javax.swing.JButton();
        btnExcluirItem = new javax.swing.JButton();
        btnAdicionarItem = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblItens = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        lblValor = new javax.swing.JLabel();
        lblValorFinal = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lblCpfCliente = new javax.swing.JLabel();
        lblCliente = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        btnBuscarCli = new javax.swing.JButton();
        txtCpfCliente = new javax.swing.JFormattedTextField();
        jPanel6 = new javax.swing.JPanel();
        boxTipoPag = new javax.swing.JComboBox<>();
        panelParcelamento = new javax.swing.JPanel();
        lblParcelas = new javax.swing.JLabel();
        boxQntParcelas = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCliente = new javax.swing.JMenu();
        mnuCliente = new javax.swing.JMenuItem();
        menuProduto = new javax.swing.JMenu();
        mnuproduto = new javax.swing.JMenuItem();
        menuRelatorio = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        Principal = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnIniciar.setText("Iniciar Venda");
        btnIniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIniciarMouseClicked(evt);
            }
        });
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        btnConcluir.setText("Concluir Venda");
        btnConcluir.setEnabled(false);
        btnConcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConcluirActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel2.setText("Cod Venda: ");

        lblCodVenda.setText("0");

        lbldataVenda.setText("Data da Venda:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnIniciar)
                .addGap(18, 18, 18)
                .addComponent(btnConcluir)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar)
                .addGap(87, 87, 87)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCodVenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbldataVenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jdcDataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConcluir)
                    .addComponent(btnIniciar)
                    .addComponent(btnCancelar)
                    .addComponent(jLabel1))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbldataVenda)
                        .addComponent(jLabel2)
                        .addComponent(lblCodVenda))
                    .addComponent(jdcDataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblCodProd.setText("Cód do Produto:");

        txtCodProd.setEnabled(false);
        txtCodProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodProdActionPerformed(evt);
            }
        });
        txtCodProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodProdKeyTyped(evt);
            }
        });

        lblNomeProd.setText("Nome do Produto:");

        txtNomeProd.setEnabled(false);
        txtNomeProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeProdActionPerformed(evt);
            }
        });

        lblQnt.setText("Quantidade:");

        txtQnt.setEnabled(false);
        txtQnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQntActionPerformed(evt);
            }
        });
        txtQnt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtQntKeyTyped(evt);
            }
        });

        lblValorUnit.setText("Valor Unitário:");

        txtValorUnit.setEnabled(false);
        txtValorUnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorUnitActionPerformed(evt);
            }
        });

        btnBusca.setText("...");
        btnBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaActionPerformed(evt);
            }
        });

        btnExcluirItem.setText("Excluir Item");
        btnExcluirItem.setEnabled(false);
        btnExcluirItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirItemActionPerformed(evt);
            }
        });

        btnAdicionarItem.setText("Adicionar Item");
        btnAdicionarItem.setEnabled(false);
        btnAdicionarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarItemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(lblQnt)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtQnt, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(lblCodProd)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtCodProd, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lblValorUnit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValorUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblNomeProd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomeProd, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAdicionarItem, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluirItem, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodProd)
                    .addComponent(txtCodProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNomeProd)
                    .addComponent(txtNomeProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBusca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQnt)
                    .addComponent(txtQnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValorUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblValorUnit)
                    .addComponent(btnAdicionarItem, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluirItem, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Itens Adicionados:"));

        tblItens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cód Produto", "Produto", "Quantidade", "Valor Unitário", "Valor Total"
            }
        ));
        tblItens.setEnabled(false);
        jScrollPane2.setViewportView(tblItens);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblValor.setText("Valor Final: ");

        lblValorFinal.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblValorFinal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblValorFinal.setText("0");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addComponent(lblValor)
                .addGap(119, 119, 119))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(lblValorFinal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblValor)
                .addGap(18, 18, 18)
                .addComponent(lblValorFinal)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Selecionar Cliente:"));

        lblCpfCliente.setText("CPF do Cliente:");

        lblCliente.setText("Cliente: ");

        txtCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteActionPerformed(evt);
            }
        });

        btnBuscarCli.setText("Buscar");
        btnBuscarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCliActionPerformed(evt);
            }
        });

        try {
            txtCpfCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpfCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfClienteActionPerformed(evt);
            }
        });
        txtCpfCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCpfClienteKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCpfCliente)
                    .addComponent(lblCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(txtCpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscarCli, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCpfCliente)
                    .addComponent(txtCpfCliente)
                    .addComponent(btnBuscarCli, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Tipo de Pagamento:"));

        boxTipoPag.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione uma opção>", "Dinheiro", "Cartão de Débito", "Cartão de Crédito á Vista", "Cartão de Crédito Parcelado" }));
        boxTipoPag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxTipoPagActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(boxTipoPag, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(76, 76, 76))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(boxTipoPag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        panelParcelamento.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Parcelamento:"));

        boxQntParcelas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "2x ", "3x ", "4x", "5x ", "6x " }));
        boxQntParcelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxQntParcelasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelParcelamentoLayout = new javax.swing.GroupLayout(panelParcelamento);
        panelParcelamento.setLayout(panelParcelamentoLayout);
        panelParcelamentoLayout.setHorizontalGroup(
            panelParcelamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelParcelamentoLayout.createSequentialGroup()
                .addComponent(lblParcelas)
                .addGap(18, 18, 18)
                .addComponent(boxQntParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelParcelamentoLayout.setVerticalGroup(
            panelParcelamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelParcelamentoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelParcelamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxQntParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblParcelas))
                .addGap(18, 18, 18))
        );

        menuCliente.setText("Cliente");

        mnuCliente.setText("Tela do Cliente");
        mnuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuClienteActionPerformed(evt);
            }
        });
        menuCliente.add(mnuCliente);

        jMenuBar1.add(menuCliente);

        menuProduto.setText("Produto");

        mnuproduto.setText("Tela de Produto");
        mnuproduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuprodutoActionPerformed(evt);
            }
        });
        menuProduto.add(mnuproduto);

        jMenuBar1.add(menuProduto);

        menuRelatorio.setText("Relatório");

        jMenuItem3.setText("Sintético");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        menuRelatorio.add(jMenuItem3);

        jMenuBar1.add(menuRelatorio);

        Principal.setText("Principal");
        Principal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrincipalActionPerformed(evt);
            }
        });

        jMenuItem4.setText("Principal");
        jMenuItem4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem4MouseClicked(evt);
            }
        });
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        Principal.add(jMenuItem4);

        jMenuBar1.add(Principal);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(panelParcelamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelParcelamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(111, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Função que inicia a colocação das informações
     * @param evt 
     */
    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        habilitarCampos(true);
        limpaCampos();


    }//GEN-LAST:event_btnIniciarActionPerformed

    /**
     * Inverso aos btnIniciarActionPerfomed 
     * @param evt 
     */
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        habilitarCampos(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    /**
     * Função que conclui a venda usando o botão Concluir
     * @param evt 
     */
    private void btnConcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConcluirActionPerformed

        if (tblItens.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this,"Insira ao menos 1 produto");
            return;
        }
        
        if(jdcDataVenda.getDate() == null) {
           JOptionPane.showMessageDialog(this, "Insira a data da venda");
            return;
        }
        
        if(txtCpfCliente.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Insira o cpf do cliente");
            return;
        }
        
        if(boxTipoPag.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(this, "Selecione o tipo de pagamento");
            return;
        }
        try {
            ArrayList<Vendas> listaItens = new ArrayList<Vendas>();

            if (tblItens.getRowCount() > 0) {
                for (int i = 0; i < tblItens.getRowCount(); i++) {
                    Vendas v = new Vendas();

                    v.setCodProduto(Integer.parseInt(tblItens.getValueAt(i, 0).toString()));
                    v.setNomeProduto(tblItens.getValueAt(i, 1).toString());
                    v.setQuantidade(Integer.parseInt(tblItens.getValueAt(i, 2).toString()));
                    v.setValorUnitario(Double.parseDouble(tblItens.getValueAt(i, 3).toString()));
                    v.setValorTotal(Double.parseDouble(tblItens.getValueAt(i, 4).toString()));

                    listaItens.add(v);
                }
            }

            Date data = jdcDataVenda.getDate();
            String nome = txtCliente.getText();
            String cpf = txtCpfCliente.getText().replace(".", "").replace(".", "").replace("-", "");
            String tipoPag = boxTipoPag.getSelectedItem().toString();
            String parcelamento = boxQntParcelas.getSelectedItem().toString();
            Double valorFinal = Double.parseDouble(lblValorFinal.getText());

            Vendas objVendas = new Vendas();

            objVendas.setListaItens(listaItens);
            objVendas.setDataVenda(data);
            objVendas.setNome(nome);
            objVendas.setCpf(cpf);
            objVendas.setTipo_pag(tipoPag);
            objVendas.setParcelamento(parcelamento);
            objVendas.setFinal(valorFinal);

            VendasDAO salvarVendasDAO = new VendasDAO();
            salvarVendasDAO.Salvar(objVendas);

        
            
        } catch (NumberFormatException e) {

        }
        limpaCampos();

    }//GEN-LAST:event_btnConcluirActionPerformed

    private void txtCodProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodProdActionPerformed

    }//GEN-LAST:event_txtCodProdActionPerformed

    private void txtQntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQntActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQntActionPerformed

    private void txtValorUnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorUnitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorUnitActionPerformed

    /**
     * Método de validação do botão AdicionarItem
     * @param evt 
     */
    private void btnAdicionarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarItemActionPerformed
        if (txtCodProd.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Digite o código do produto");
            return;
        }
        if (txtQnt.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Digite a quantidade do produto");
            return;
        }
        if (txtValorUnit.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Digite o valor unitário do Produto");
            return;
        }

        String codProd = txtCodProd.getText().trim();
        String nomeProd = txtNomeProd.getText().trim();
        String qnt = txtQnt.getText().trim();
        String valorUnit = txtValorUnit.getText().trim();

        DefaultTableModel tbItens = (DefaultTableModel) tblItens.getModel();

        tbItens.addRow(new String[]{codProd, nomeProd, qnt, valorUnit});

        txtCodProd.setText("");
        txtNomeProd.setText("");
        txtQnt.setText("");
        txtValorUnit.setText("");

        txtCodProd.requestFocus();

        double qnt1;
        double valorUnit1;

        int cont = tblItens.getRowCount();

        for (int i = 0; i < cont; i++) {
            qnt1 = Double.parseDouble(tblItens.getValueAt(i, 2).toString());
            valorUnit1 = Double.parseDouble(tblItens.getValueAt(i, 3).toString());
            double ValorTotal = qnt1 * valorUnit1;
            tblItens.setValueAt(String.valueOf(ValorTotal), i, 4);
        }
        Total(true);

    }//GEN-LAST:event_btnAdicionarItemActionPerformed

    private void txtNomeProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeProdActionPerformed
        
    }//GEN-LAST:event_txtNomeProdActionPerformed

    private void btnIniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarMouseClicked

    }//GEN-LAST:event_btnIniciarMouseClicked

    /**
     * Método de validação do botão Busca
     * @param evt 
     */
    private void btnBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaActionPerformed
        if (txtCodProd.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Digite o código do produto para busca-lo");
        }

        try {
            int cod = Integer.parseInt(txtCodProd.getText());

            VendasDAO v = new VendasDAO();

            Produto busca = (v.PesquisarProdutoCod(cod));

            txtNomeProd.setText(busca.getNome());
            txtValorUnit.setText(String.valueOf(busca.getPcVenda()));
        } catch (NumberFormatException e) {

        }


    }//GEN-LAST:event_btnBuscaActionPerformed

    /**
     * Função que chama a tela de produtos
     * @param evt 
     */
    private void mnuprodutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuprodutoActionPerformed
        Tela_Produto Produto = new Tela_Produto();
        Produto.setVisible(true);
    }//GEN-LAST:event_mnuprodutoActionPerformed

    /**
     * Função que chama a tela de clientes
     * @param evt 
     */
    private void mnuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuClienteActionPerformed
        Tela_Cliente Cliente = new Tela_Cliente();
        Cliente.setVisible(true);
    }//GEN-LAST:event_mnuClienteActionPerformed
    private void btnExcluirItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirItemActionPerformed
        ((DefaultTableModel) tblItens.getModel()).removeRow(tblItens.getSelectedRow());

        Total(false);
    }//GEN-LAST:event_btnExcluirItemActionPerformed

    /**
     * Método de validação do campo de texto CodProd
     * @param evt 
     */
    private void txtCodProdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodProdKeyTyped
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9') && (c != KeyEvent.VK_BACK_SPACE && c != KeyEvent.VK_DELETE
                && c != KeyEvent.VK_ENTER)) {

            evt.consume();
            JOptionPane.showMessageDialog(this, "Digite apenas números");

            txtCodProd.setText("");
        }
    }//GEN-LAST:event_txtCodProdKeyTyped

    /**
     * Método de validação do campo de texto Qnt
     * @param evt 
     */
    private void txtQntKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQntKeyTyped
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9') && (c != KeyEvent.VK_BACK_SPACE && c != KeyEvent.VK_DELETE
                && c != KeyEvent.VK_ENTER)) {

            evt.consume();
            JOptionPane.showMessageDialog(this, "Digite apenas números");

            txtQnt.setText("");
        }
    }//GEN-LAST:event_txtQntKeyTyped

    private void txtClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteActionPerformed
        
    }//GEN-LAST:event_txtClienteActionPerformed

    /**
     * Função que busca um cliente já cadastrado
     * @param evt 
     */
    private void btnBuscarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCliActionPerformed

        String cpf = txtCpfCliente.getText().replace(".", "").replace(".", "").replace("-", "");

        VendasDAO pg = new VendasDAO();

        Cliente busca = (pg.PesquisarCliente(cpf));

        if (busca == null) {
            JOptionPane.showMessageDialog(rootPane, "Cliente não cadastrado");
        } else {
            txtCliente.setText(busca.getNome());

        }

    }//GEN-LAST:event_btnBuscarCliActionPerformed

    private void txtCpfClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfClienteActionPerformed

    }//GEN-LAST:event_txtCpfClienteActionPerformed

    /**
     * Método de validação do campo de texto CpfCliente
     * @param evt 
     */
    private void txtCpfClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCpfClienteKeyTyped
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9') && (c != KeyEvent.VK_BACK_SPACE && c != KeyEvent.VK_DELETE
                && c != KeyEvent.VK_ENTER)) {

            evt.consume();
            JOptionPane.showMessageDialog(this, "Digite apenas números");

            txtCpfCliente.setText("");
        }
    }//GEN-LAST:event_txtCpfClienteKeyTyped

    /**
     * Função que mostra os tipos de pagamentos possíveis
     * @param evt 
     */
    private void boxTipoPagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxTipoPagActionPerformed

        if (boxTipoPag.getSelectedItem().equals("Cartão de Crédito Parcelado")) {
            boxQntParcelas.setEnabled(true);
        }

    }//GEN-LAST:event_boxTipoPagActionPerformed

    private void boxQntParcelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxQntParcelasActionPerformed


    }//GEN-LAST:event_boxQntParcelasActionPerformed

    private void PrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrincipalActionPerformed
      Tela_principal principal = new Tela_principal();
      principal.setVisible(true);
      
    }//GEN-LAST:event_PrincipalActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
Tela_principal principal = new Tela_principal();
      principal.setVisible(true);    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem4MouseClicked
          }//GEN-LAST:event_jMenuItem4MouseClicked

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
Tela_Relatorio.TelaRelatorioSintetico relatorio = new TelaRelatorioSintetico();
        relatorio.setVisible(true);    }//GEN-LAST:event_jMenuItem3ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaDeVendas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDeVendas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDeVendas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDeVendas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDeVendas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Principal;
    private javax.swing.JComboBox<String> boxQntParcelas;
    private javax.swing.JComboBox<String> boxTipoPag;
    private javax.swing.JButton btnAdicionarItem;
    private javax.swing.JButton btnBusca;
    private javax.swing.JButton btnBuscarCli;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConcluir;
    private javax.swing.JButton btnExcluirItem;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private com.toedter.calendar.JDateChooser jdcDataVenda;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblCodProd;
    private javax.swing.JLabel lblCodVenda;
    private javax.swing.JLabel lblCpfCliente;
    private javax.swing.JLabel lblNomeProd;
    private javax.swing.JLabel lblParcelas;
    private javax.swing.JLabel lblQnt;
    private javax.swing.JLabel lblValor;
    private javax.swing.JLabel lblValorFinal;
    private javax.swing.JLabel lblValorUnit;
    private javax.swing.JLabel lbldataVenda;
    private javax.swing.JMenu menuCliente;
    private javax.swing.JMenu menuProduto;
    private javax.swing.JMenu menuRelatorio;
    private javax.swing.JMenuItem mnuCliente;
    private javax.swing.JMenuItem mnuproduto;
    private javax.swing.JPanel panelParcelamento;
    private javax.swing.JTable tblItens;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtCodProd;
    private javax.swing.JFormattedTextField txtCpfCliente;
    private javax.swing.JTextField txtNomeProd;
    private javax.swing.JTextField txtQnt;
    private javax.swing.JTextField txtValorUnit;
    // End of variables declaration//GEN-END:variables

    private int setCodVenda(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
