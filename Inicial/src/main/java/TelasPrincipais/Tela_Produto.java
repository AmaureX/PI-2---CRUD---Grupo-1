/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TelasPrincipais;

import DAO.ProdutoDAO;
import TelasPrincipais.TelaDeVendas;
import TelasPrincipais.Tela_Cliente;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Produto;

/**
 *
 * @author cilucena
 */
public class Tela_Produto extends javax.swing.JFrame {

    /**
     * Creates new form Produto
     */
    public Tela_Produto() {
        initComponents();
        tpProduto.setEnabledAt(1, false);

        //this.setLocationRelativeTo(null);
    }

    /**
     * Função que deixa as lables na cor preta
     * @param evt 
     */
    private void corLabel() {
        lblNome.setForeground(Color.black);
        lblQuantidade.setForeground(Color.black);
        lblSecao.setForeground(Color.black);
        lblPcCompra.setForeground(Color.black);
        lblLucro.setForeground(Color.black);
        lblPcVenda.setForeground(Color.black);
        lblFornecedor.setForeground(Color.black);
        lblMarca.setForeground(Color.black);
        lbldtRecebimento.setForeground(Color.black);

    }

    /**
     * Função que limpa os campos 
     * @param evt 
     */
    private void limparTexto() {

        txtBuscaProduto.setText("");
        txtNome.setText("");
        txtLucro.setText("");
        txtPcCompra.setText("");
        txtQuantidade.setText("");
        lblPrecoVenda.setText("");
        txtMarca.setText("");
        cbxFornecedor.setSelectedIndex(0);
        cbxSecao.setSelectedIndex(0);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        tpProduto = new javax.swing.JTabbedPane();
        pnlConsultaProduto = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProduto = new javax.swing.JTable();
        pnlBusca = new javax.swing.JPanel();
        lblBuscaProduto = new javax.swing.JLabel();
        txtBuscaProduto = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        rbnNome = new javax.swing.JRadioButton();
        rbnCodigo = new javax.swing.JRadioButton();
        btnExcluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnCadastro = new javax.swing.JButton();
        pnlCadastroProduto = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblCod = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblSecao = new javax.swing.JLabel();
        cbxSecao = new javax.swing.JComboBox();
        lblQuantidade = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        lblPcCompra = new javax.swing.JLabel();
        txtPcCompra = new javax.swing.JTextField();
        lblLucro = new javax.swing.JLabel();
        txtLucro = new javax.swing.JTextField();
        lblPcVenda = new javax.swing.JLabel();
        lblPrecoVenda = new javax.swing.JLabel();
        lblFornecedor = new javax.swing.JLabel();
        cbxFornecedor = new javax.swing.JComboBox();
        lbldtRecebimento = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        lblMarca = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        jdcDataRecebimento = new com.toedter.calendar.JDateChooser();
        btnAlterarProd = new javax.swing.JButton();
        txtIdCod = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuCliente = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuVenda = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnuSintetico = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        mnuTelaPrincipal = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel3.setText("jLabel3");

        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tblProduto.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tblProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Marca", "Seção", "Quantidade", "Preço Compra", "Lucro", "Preço Venda", "Fornecedor", "Data Recebimento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblProduto);

        pnlBusca.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblBuscaProduto.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblBuscaProduto.setText("Busca do Produto");

        txtBuscaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscaProdutoActionPerformed(evt);
            }
        });
        txtBuscaProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscaProdutoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscaProdutoKeyTyped(evt);
            }
        });

        btnPesquisar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbnNome);
        rbnNome.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        rbnNome.setText("Nome");
        rbnNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnNomeActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbnCodigo);
        rbnCodigo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        rbnCodigo.setText("Código");
        rbnCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnCodigoActionPerformed(evt);
            }
        });
        rbnCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rbnCodigoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pnlBuscaLayout = new javax.swing.GroupLayout(pnlBusca);
        pnlBusca.setLayout(pnlBuscaLayout);
        pnlBuscaLayout.setHorizontalGroup(
            pnlBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBuscaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBuscaLayout.createSequentialGroup()
                        .addComponent(rbnNome)
                        .addContainerGap(520, Short.MAX_VALUE))
                    .addGroup(pnlBuscaLayout.createSequentialGroup()
                        .addComponent(rbnCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))))
            .addGroup(pnlBuscaLayout.createSequentialGroup()
                .addGroup(pnlBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBuscaLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblBuscaProduto))
                    .addGroup(pnlBuscaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtBuscaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlBuscaLayout.setVerticalGroup(
            pnlBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBuscaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBuscaProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rbnNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbnCodigo)
                    .addComponent(btnPesquisar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnExcluir.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnAlterar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnCadastro.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnCadastro.setText("Novo Cadastro");
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlConsultaProdutoLayout = new javax.swing.GroupLayout(pnlConsultaProduto);
        pnlConsultaProduto.setLayout(pnlConsultaProdutoLayout);
        pnlConsultaProdutoLayout.setHorizontalGroup(
            pnlConsultaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConsultaProdutoLayout.createSequentialGroup()
                .addGroup(pnlConsultaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlConsultaProdutoLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(pnlBusca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(95, 95, 95)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE))
                    .addGroup(pnlConsultaProdutoLayout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addGroup(pnlConsultaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(163, 163, 163)))
                .addGap(96, 96, 96))
            .addGroup(pnlConsultaProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addGap(80, 80, 80))
        );
        pnlConsultaProdutoLayout.setVerticalGroup(
            pnlConsultaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlConsultaProdutoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnlConsultaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlBusca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlConsultaProdutoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                        .addComponent(btnExcluir)
                        .addGap(34, 34, 34)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnAlterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCadastro)
                .addGap(15, 15, 15))
        );

        tpProduto.addTab("Consulta Produto", pnlConsultaProduto);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("Cadastro Produto");

        lblCod.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblCod.setText("Código:");

        lblNome.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblNome.setText("Nome:");

        txtNome.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomeKeyTyped(evt);
            }
        });

        lblSecao.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblSecao.setText("Secão:");

        cbxSecao.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cbxSecao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Selecione uma opção>", "Cosméticos", "Perfumaria", "Higiene", "Unhas", "Cabelo", "Bijuterias" }));
        cbxSecao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbxSecaoKeyPressed(evt);
            }
        });

        lblQuantidade.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblQuantidade.setText("Quantidade:");

        txtQuantidade.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantidadeActionPerformed(evt);
            }
        });
        txtQuantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtQuantidadeKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtQuantidadeKeyTyped(evt);
            }
        });

        lblPcCompra.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblPcCompra.setText("Preço Compra:");

        txtPcCompra.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtPcCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPcCompraActionPerformed(evt);
            }
        });
        txtPcCompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPcCompraKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPcCompraKeyTyped(evt);
            }
        });

        lblLucro.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblLucro.setText("Lucro:");

        txtLucro.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtLucro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtLucroMouseExited(evt);
            }
        });
        txtLucro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLucroActionPerformed(evt);
            }
        });
        txtLucro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLucroKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLucroKeyTyped(evt);
            }
        });

        lblPcVenda.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblPcVenda.setText("Preço Venda:");

        lblPrecoVenda.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        lblFornecedor.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblFornecedor.setText("Fornecedor:");

        cbxFornecedor.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cbxFornecedor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Selecione uma Opção>", "Bim Distribuidora de Cosméticos Importados", "Official Distribuidora de Perfumes e Cosméticos", "Distribuidora Paris", "Arte dos Aromas", "Herbia Distribuidora" }));
        cbxFornecedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbxFornecedorKeyPressed(evt);
            }
        });

        lbldtRecebimento.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbldtRecebimento.setText("Data Recebimento:");

        btnSalvar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        btnSalvar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSalvarKeyPressed(evt);
            }
        });

        lblMarca.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblMarca.setText("Marca:");

        txtMarca.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMarcaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMarcaKeyTyped(evt);
            }
        });

        jdcDataRecebimento.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        btnAlterarProd.setText("Alterar");
        btnAlterarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarProdActionPerformed(evt);
            }
        });

        txtIdCod.setEnabled(false);
        txtIdCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdCodActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCadastroProdutoLayout = new javax.swing.GroupLayout(pnlCadastroProduto);
        pnlCadastroProduto.setLayout(pnlCadastroProdutoLayout);
        pnlCadastroProdutoLayout.setHorizontalGroup(
            pnlCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastroProdutoLayout.createSequentialGroup()
                .addGap(355, 355, 355)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCadastroProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlCadastroProdutoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                        .addComponent(lblFornecedor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(lbldtRecebimento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(pnlCadastroProdutoLayout.createSequentialGroup()
                        .addComponent(lblQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                        .addGap(21, 21, 21)
                        .addComponent(txtQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblPcCompra, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPcCompra, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                        .addGap(47, 47, 47)
                        .addComponent(lblLucro, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtLucro, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                        .addGap(45, 45, 45)))
                .addGroup(pnlCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCadastroProdutoLayout.createSequentialGroup()
                        .addComponent(lblPcVenda, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPrecoVenda, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                        .addGap(99, 99, 99))
                    .addGroup(pnlCadastroProdutoLayout.createSequentialGroup()
                        .addComponent(jdcDataRecebimento, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(163, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCadastroProdutoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pnlCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMarca)
                    .addComponent(lblCod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlCadastroProdutoLayout.createSequentialGroup()
                        .addComponent(txtIdCod, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNome))
                    .addGroup(pnlCadastroProdutoLayout.createSequentialGroup()
                        .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(lblSecao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbxSecao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCadastroProdutoLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(btnAlterarProd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );

        pnlCadastroProdutoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAlterarProd, btnSalvar});

        pnlCadastroProdutoLayout.setVerticalGroup(
            pnlCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastroProdutoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(pnlCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlCadastroProdutoLayout.createSequentialGroup()
                        .addGroup(pnlCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCod)
                            .addComponent(lblNome)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62)
                        .addGroup(pnlCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxSecao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSecao)
                            .addComponent(lblMarca)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)
                        .addGroup(pnlCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPcVenda)
                            .addGroup(pnlCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtLucro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblLucro)
                                .addComponent(txtPcCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblPcCompra)
                                .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblQuantidade))))
                    .addComponent(lblPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(pnlCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbldtRecebimento, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbxFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblFornecedor))
                    .addComponent(jdcDataRecebimento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(219, 219, 219)
                .addGroup(pnlCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterarProd))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlCadastroProdutoLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAlterarProd, btnSalvar});

        tpProduto.addTab("Cadastro", pnlCadastroProduto);

        mnuCliente.setText("Cliente");

        jMenuItem1.setText("Cliente");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnuCliente.add(jMenuItem1);

        jMenuBar1.add(mnuCliente);

        jMenu2.setText("Venda");

        mnuVenda.setText("Venda");
        mnuVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuVendaActionPerformed(evt);
            }
        });
        jMenu2.add(mnuVenda);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Relatórios");

        mnuSintetico.setText("Sintético");
        jMenu3.add(mnuSintetico);

        jMenuBar1.add(jMenu3);

        jMenu1.setText("Principal");

        mnuTelaPrincipal.setText("Tela Principal");
        mnuTelaPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuTelaPrincipalActionPerformed(evt);
            }
        });
        jMenu1.add(mnuTelaPrincipal);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tpProduto)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tpProduto)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Chama a tela de clientes
     * @param evt 
     */
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Tela_Cliente cliente = new Tela_Cliente();
        cliente.setVisible(true);

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * Chama a tela de vendas
     * @param evt 
     */
    private void mnuVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuVendaActionPerformed
        TelaDeVendas venda = new TelaDeVendas();
        venda.setVisible(true);
    }//GEN-LAST:event_mnuVendaActionPerformed

    /**
     * Método de validação do campo de texto Busca
     * @param evt 
     */
    private void txtBuscaProdutoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaProdutoKeyTyped
        if (rbnNome.isSelected()) {

            if (txtBuscaProduto.getText().length() >= 60) {
                evt.consume();
                JOptionPane.showMessageDialog(this, "Máximo de caracteres atigindos!");
                txtBuscaProduto.setText("");
            }
        }
        if (rbnCodigo.isSelected()) {
            String carac = "0123456789";
            if (!carac.contains(evt.getKeyChar() + "")) {
                evt.consume();
            }
            if (txtBuscaProduto.getText().length() >= 4) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtBuscaProdutoKeyTyped

    /**
     * Método de validação do botão Pesquisar
     * @param evt 
     */
    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        
        if (rbnNome.isSelected()) {
            if (txtBuscaProduto.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(this, "Digite o nome do produto para busca-lo");
            }
            BuscaNomeProd(txtBuscaProduto.getText());
            return;
        }
        if (rbnCodigo.isSelected()) {
            if (txtBuscaProduto.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(this, "Digite o codigo do produto para busca-lo");
            }
            if (txtBuscaProduto.getText().trim().length() > 5) {
                JOptionPane.showMessageDialog(this, "Digite o codigo do produto para busca-lo");
                txtBuscaProduto.setText("");
            }
            BuscaCodProd(txtBuscaProduto.getText());
        }
        String procurar = (txtBuscaProduto.getText());


    }//GEN-LAST:event_btnPesquisarActionPerformed

    /**
     * Mostra a tela de produtos
     * @param evt 
     */
    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed
        tpProduto.setEnabledAt(1, true);
        tpProduto.setSelectedIndex(1);

    }//GEN-LAST:event_btnCadastroActionPerformed

    /**
     * Função que faz a pesquisa dos produtos
     * @param evt 
     */
    private void txtBuscaProdutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaProdutoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnPesquisar.requestFocus();
        }
    }//GEN-LAST:event_txtBuscaProdutoKeyPressed

    /**
     * Método de validação do botão Salvar e também salva os produtos
     * @param evt 
     */
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        ArrayList<String> erros = new ArrayList();

        String Fornecedor = "", Secao = "";

        Fornecedor = String.valueOf(cbxFornecedor.getSelectedItem());
        Secao = String.valueOf(cbxSecao.getSelectedItem());

        corLabel();

        if (txtNome.getText().isEmpty()) {
            lblNome.setForeground(Color.red);
            erros.add("Insira o Nome");

        }
        if (txtMarca.getText().isEmpty()) {
            lblMarca.setForeground(Color.red);
            erros.add("Insira a marca do produto");

        }

        if (txtQuantidade.getText().isEmpty()) {
            lblQuantidade.setForeground(Color.red);
            erros.add("Insira a quantidade que foi comprada");

        }
        if (txtPcCompra.getText().replace(".", ",").trim().equals("")) {
            lblPcCompra.setForeground(Color.red);
            erros.add("Insira o valor da compra");

        }
        if (txtLucro.getText().isEmpty()) {
            lblLucro.setForeground(Color.red);
            erros.add("Insira o lucro");

        }

        if (cbxFornecedor.getSelectedIndex() == 0) {
            lblFornecedor.setForeground(Color.red);
            erros.add("Insira o fornecedor do produto");
        }
        if (cbxSecao.getSelectedIndex() == 0) {
            lblSecao.setForeground(Color.red);
            erros.add("Insira a seção em qual o produto pertence");

        }
        if (jdcDataRecebimento.getDate() == null) {
            lbldtRecebimento.setForeground(Color.red);
            erros.add("Insira a data de recebimento do produto");
        }

        String texto = "";

        if (erros.size() > 0) {
            for (int i = 0; i < erros.size(); i++) {
                texto += erros.get(i) + "\n";
            }
            JOptionPane.showMessageDialog(rootPane, texto);
        } else if (erros.size() <= 0) {
            int resposta = JOptionPane.showConfirmDialog(null, "Deseja Salvar?", "Salvar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (resposta == 0) {

                try {

                    String nome_produto = txtNome.getText();
                    String marca = txtMarca.getText();
                    String secao = cbxSecao.getSelectedItem().toString();
                    String quantidade = txtQuantidade.getText();
                    String preco_compra = txtPcCompra.getText();
                    String preco_venda = lblPrecoVenda.getText();
                    String lucro = txtLucro.getText();
                    String fornecedor = cbxFornecedor.getSelectedItem().toString();
                    Date dataRecebimento = jdcDataRecebimento.getDate();

                    Produto objProduto = new Produto();

                    objProduto.setNome(nome_produto);
                    objProduto.setMarca(marca);
                    objProduto.setSecao(secao);
                    objProduto.setQuantidade(quantidade);
                    objProduto.setPcCompra(preco_compra);
                    objProduto.setPcVenda(preco_venda);
                    objProduto.setLucro(lucro);
                    objProduto.setFornecedor(fornecedor);
                    objProduto.setDataRecebimento(dataRecebimento);

                    ProdutoDAO salvarProduto = new ProdutoDAO();
                    salvarProduto.salvar(objProduto);

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage());

                }

            }
            limparTexto();

        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    /**
     * Método de validação do campo de texto Nome
     * @param evt 
     */
    private void txtNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyTyped
        if (txtNome.getText().length() >= 60) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Máximo de caracteres atigindos!");
        }
    }//GEN-LAST:event_txtNomeKeyTyped

    /**
     * Método de validação do campo de texto Lucro
     * @param evt 
     */
    private void txtLucroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLucroKeyTyped
        char c = evt.getKeyChar();

        if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE) && (c != KeyEvent.VK_ENTER) && (c != KeyEvent.VK_DELETE)) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Digite apenas números!");
            txtLucro.setText("");
        }
    }//GEN-LAST:event_txtLucroKeyTyped

    /**
     * Método de validação do campo de texto Quantidade
     * @param evt 
     */
    private void txtQuantidadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantidadeKeyTyped
        char c = evt.getKeyChar();

        if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE) && (c != KeyEvent.VK_ENTER) && (c != KeyEvent.VK_DELETE)) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Digite apenas números!");
            txtQuantidade.setText("");
        }
    }//GEN-LAST:event_txtQuantidadeKeyTyped

    /**
     * Faz a conta do lucro obtido
     * @param evt 
     */
    private void txtLucroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLucroActionPerformed
        double cent = 0.00, rst = 0.00;
        try {
            double p1 = Double.parseDouble(txtPcCompra.getText());
            cent = Double.parseDouble((String) txtLucro.getText());
            rst = (p1 * cent / 100);
            String a = String.valueOf(rst + p1);
            lblPrecoVenda.setText(a);

        } catch (NumberFormatException e) {

        }
    }//GEN-LAST:event_txtLucroActionPerformed

    /**
     * Faz a conta do lucro obtido
     * @param evt 
     */
    private void txtLucroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLucroMouseExited
        double cent = 0.00, rst = 0.00;
        try {
            double p1 = Double.parseDouble(txtPcCompra.getText());
            cent = Double.parseDouble((String) txtLucro.getText());
            rst = (p1 * cent / 100);
            String a = String.valueOf(rst + p1);
            lblPrecoVenda.setText(a);

        } catch (NumberFormatException e) {

        }
    }//GEN-LAST:event_txtLucroMouseExited

    /**
     * Método de validação do campo de texto PcCompra
     * @param evt 
     */
    private void txtPcCompraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPcCompraKeyTyped
        char c = evt.getKeyChar();

        if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE) && (c != KeyEvent.VK_ENTER) &&
                (c != KeyEvent.VK_DELETE) && c != KeyEvent.VK_PERIOD) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Digite apenas números!");
            txtPcCompra.setText("");
        }
    }//GEN-LAST:event_txtPcCompraKeyTyped

    /**
     * Deixa em foco o campo de texto PcCompra
     * @param evt 
     */
    private void txtPcCompraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPcCompraKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtLucro.requestFocus();
        }
    }//GEN-LAST:event_txtPcCompraKeyPressed

    /**
     * Deixa em foco o campo de texto Nome
     * @param evt 
     */
    private void txtNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtMarca.requestFocus();
        }
    }//GEN-LAST:event_txtNomeKeyPressed

    /**
     * Deixa em foco o campo de texto Marca
     * @param evt 
     */
    private void txtMarcaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMarcaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            cbxSecao.requestFocus();
        }
    }//GEN-LAST:event_txtMarcaKeyPressed

    /**
     * Deixa em foco o combobox Secao
     * @param evt 
     */
    private void cbxSecaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbxSecaoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtQuantidade.requestFocus();
        }
    }//GEN-LAST:event_cbxSecaoKeyPressed

    /**
     * Deixa em foco o campo de texto Lucro
     * @param evt 
     */
    private void txtLucroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLucroKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            cbxFornecedor.requestFocus();
        }
    }//GEN-LAST:event_txtLucroKeyPressed

    /**
     * Deixa em foco o combobox Fornecedor
     * @param evt 
     */
    private void cbxFornecedorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbxFornecedorKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jdcDataRecebimento.requestFocus();
        }
    }//GEN-LAST:event_cbxFornecedorKeyPressed

    /**
     * Salva o produto
     * @param evt 
     */
    private void btnSalvarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSalvarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            JOptionPane.showConfirmDialog(null, "Deseja Salvar?", "Mensagem", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

            txtQuantidade.getText();
            lblPrecoVenda.getText();
            txtLucro.getText();
            txtNome.getText();
            txtMarca.getText();

            limparTexto();
            cbxFornecedor.setSelectedIndex(0);
            cbxSecao.setSelectedIndex(0);
        }
    }//GEN-LAST:event_btnSalvarKeyPressed

    /**
     * Metódo de validação do campo de texto Marca
     * @param evt 
     */
    private void txtMarcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMarcaKeyTyped
        if (txtMarca.getText().length() >= 30) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Máximo de caracteres atigindos!");
        }
    }//GEN-LAST:event_txtMarcaKeyTyped

    /**
     * Deixa em foco o campo de texto Quantidade
     * @param evt 
     */
    private void txtQuantidadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantidadeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtPcCompra.requestFocus();
        }
    }//GEN-LAST:event_txtQuantidadeKeyPressed

    /**
     * Altera o produto selecionado
     * @param evt 
     */
    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        int LinhaSelecionada = tblProduto.getSelectedRow();

        try {
            txtIdCod.setText(tblProduto.getModel().getValueAt(LinhaSelecionada, 0).toString());
            txtNome.setText(tblProduto.getModel().getValueAt(LinhaSelecionada, 1).toString());
            txtMarca.setText(tblProduto.getModel().getValueAt(LinhaSelecionada, 2).toString());
            cbxSecao.setSelectedItem(tblProduto.getModel().getValueAt(LinhaSelecionada, 3).toString());
            txtQuantidade.setText(tblProduto.getModel().getValueAt(LinhaSelecionada, 4).toString());
            txtPcCompra.setText(tblProduto.getModel().getValueAt(LinhaSelecionada, 5).toString());
            txtLucro.setText(tblProduto.getModel().getValueAt(LinhaSelecionada, 6).toString());
            lblPrecoVenda.setText(tblProduto.getModel().getValueAt(LinhaSelecionada, 7).toString());
            cbxFornecedor.setSelectedItem(tblProduto.getModel().getValueAt(LinhaSelecionada, 8).toString());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        try {
            Date data = new SimpleDateFormat("yyyy-MM-dd").parse((String) tblProduto.getValueAt(LinhaSelecionada, 9));
            jdcDataRecebimento.setDate(data);

        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        tpProduto.setSelectedIndex(1);


    }//GEN-LAST:event_btnAlterarActionPerformed

    /**
     * Exclui o produto selecionado
     * @param evt 
     */
    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int linhaSelecionada = tblProduto.getSelectedRow();
        String cod = tblProduto.getValueAt(linhaSelecionada, 0).toString();
        ProdutoDAO.Excluir(cod);
        ListarTabela();

    }//GEN-LAST:event_btnExcluirActionPerformed

    /**
     * Metodo de validação para o radiobutton Codigo
     * @param evt 
     */
    private void rbnCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rbnCodigoKeyTyped
        if (rbnCodigo.getText().length() >= 15) {
            evt.consume();
        }
    }//GEN-LAST:event_rbnCodigoKeyTyped

    private void txtBuscaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscaProdutoActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_txtBuscaProdutoActionPerformed

    private void rbnCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbnCodigoActionPerformed

    /**
     * Faz a alteração dos produtos
     * @param evt 
     */
    private void btnAlterarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarProdActionPerformed
        alterarProduto();
        ListarTabela();
        limparCamposP();

    }//GEN-LAST:event_btnAlterarProdActionPerformed

    private void rbnNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbnNomeActionPerformed

    private void txtIdCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdCodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdCodActionPerformed

    private void txtQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantidadeActionPerformed

    private void txtPcCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPcCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPcCompraActionPerformed

    /**
     * Chama a tela principal
     * @param evt 
     */
    private void mnuTelaPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuTelaPrincipalActionPerformed
       Tela_principal principal = new Tela_principal();
       principal.setVisible(true);
    }//GEN-LAST:event_mnuTelaPrincipalActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Produto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnAlterarProd;
    private javax.swing.JButton btnCadastro;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JComboBox cbxFornecedor;
    private javax.swing.JComboBox cbxSecao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private com.toedter.calendar.JDateChooser jdcDataRecebimento;
    private javax.swing.JLabel lblBuscaProduto;
    private javax.swing.JLabel lblCod;
    private javax.swing.JLabel lblFornecedor;
    private javax.swing.JLabel lblLucro;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPcCompra;
    private javax.swing.JLabel lblPcVenda;
    private javax.swing.JLabel lblPrecoVenda;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JLabel lblSecao;
    private javax.swing.JLabel lbldtRecebimento;
    private javax.swing.JMenu mnuCliente;
    private javax.swing.JMenuItem mnuSintetico;
    private javax.swing.JMenuItem mnuTelaPrincipal;
    private javax.swing.JMenuItem mnuVenda;
    private javax.swing.JPanel pnlBusca;
    private javax.swing.JPanel pnlCadastroProduto;
    private javax.swing.JPanel pnlConsultaProduto;
    private javax.swing.JRadioButton rbnCodigo;
    private javax.swing.JRadioButton rbnNome;
    private javax.swing.JTable tblProduto;
    private javax.swing.JTabbedPane tpProduto;
    private javax.swing.JTextField txtBuscaProduto;
    private javax.swing.JTextField txtIdCod;
    private javax.swing.JTextField txtLucro;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPcCompra;
    private javax.swing.JTextField txtQuantidade;
    // End of variables declaration//GEN-END:variables

    /**
     * Mostra uma lista de produtos
     * @param evt 
     */
    public void ListarTabela() {

        DefaultTableModel Modelo = (DefaultTableModel) tblProduto.getModel();
        Modelo.setNumRows(0);
        ProdutoDAO produtoDAO = new ProdutoDAO();

        for (Produto p : produtoDAO.ListarProdutos()) {
            Modelo.addRow(new String[]{
                p.getIdCod(),
                p.getNome(),
                p.getMarca(),
                p.getSecao(),
                p.getQuantidade(),
                p.getPcCompra(),
                p.getLucro(),
                p.getPcVenda(),
                p.getFornecedor(),
                p.getDataRecebimento().toString()
            });

        }
    }

    /**
     * Oculta os campos selecionados da tabela Produto
     * @param evt 
     */
    public void OcultarCampos() {
        tblProduto.getColumnModel().getColumn(5).setMinWidth(0);
        tblProduto.getColumnModel().getColumn(5).setMaxWidth(0);
        tblProduto.getColumnModel().getColumn(6).setMinWidth(0);
        tblProduto.getColumnModel().getColumn(6).setMaxWidth(0);
        tblProduto.getColumnModel().getColumn(7).setMinWidth(0);
        tblProduto.getColumnModel().getColumn(7).setMaxWidth(0);
        tblProduto.getColumnModel().getColumn(8).setMinWidth(0);
        tblProduto.getColumnModel().getColumn(8).setMaxWidth(0);
        tblProduto.getColumnModel().getColumn(9).setMinWidth(0);
        tblProduto.getColumnModel().getColumn(9).setMaxWidth(0);
        tblProduto.getColumnModel().getColumn(10).setMinWidth(0);
        tblProduto.getColumnModel().getColumn(10).setMaxWidth(0);

    }

    /**
     * Pega os dados para fazer a alteração dos produtos
     * @param evt 
     */
    private void alterarProduto() {

        try {
               
            String codigo = txtIdCod.getText();
            String nome_produto = txtNome.getText();
            String marca = txtMarca.getText();
            String secao = cbxSecao.getSelectedItem().toString();
            String quantidade = txtQuantidade.getText();
            String preco_compra = txtPcCompra.getText();
            String preco_venda = lblPrecoVenda.getText();
            String lucro = txtLucro.getText();
            String fornecedor = cbxFornecedor.getSelectedItem().toString();
            Date dataRecebimento = jdcDataRecebimento.getDate();

            Produto objProduto = new Produto();
            
            objProduto.setIdCod(codigo);
            objProduto.setNome(nome_produto);
            objProduto.setMarca(marca);
            objProduto.setSecao(secao);
            objProduto.setQuantidade(quantidade);
            objProduto.setPcCompra(preco_compra);
            objProduto.setPcVenda(preco_venda);
            objProduto.setLucro(lucro);
            objProduto.setFornecedor(fornecedor);
            objProduto.setDataRecebimento(dataRecebimento);

            
            ProdutoDAO.Alterar(objProduto);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());

        }
    }

    /**
     * Faz a busca dos produtos pelo Nome
     * @param evt 
     */
    public void BuscaNomeProd(String Busca) {
        DefaultTableModel Modelo = (DefaultTableModel) tblProduto.getModel();
        Modelo.setNumRows(0);
        ProdutoDAO produtoDAO = new ProdutoDAO();

        for (Produto p : produtoDAO.BuscarNomeProd(Busca)) {
            Modelo.addRow(new String[]{
                p.getIdCod(),
                p.getNome(),
                p.getMarca(),
                p.getSecao(),
                p.getQuantidade(),
                p.getPcCompra(),
                p.getLucro(),
                p.getPcVenda(),
                p.getFornecedor(),
                p.getDataRecebimento().toString()
            });

        }
    }

    /**
     * Faz a busca dos produtos pelo Cod
     * @param evt 
     */
    public void BuscaCodProd(String Busca) {
        DefaultTableModel Modelo = (DefaultTableModel) tblProduto.getModel();
        Modelo.setNumRows(0);
        ProdutoDAO produtoDAO = new ProdutoDAO();

        for (Produto p : produtoDAO.BuscarCodProd(Busca)) {
            Modelo.addRow(new String[]{
                p.getIdCod(),
                p.getNome(),
                p.getMarca(),
                p.getSecao(),
                p.getQuantidade(),
                p.getPcCompra(),
                p.getLucro(),
                p.getPcVenda(),
                p.getFornecedor(),
                p.getDataRecebimento().toString()
            });

        }
    }

    /**
     * Limpa os campos
     * @param evt 
     */
    public void limparCamposP() {
        txtNome.setText("");
        txtMarca.setText("");
        cbxSecao.setSelectedIndex(0);
        txtQuantidade.setText("");
        txtPcCompra.setText("");
        txtPcCompra.setText("");
        cbxFornecedor.setSelectedIndex(0);
        jdcDataRecebimento.setDate(null);
    }

}
