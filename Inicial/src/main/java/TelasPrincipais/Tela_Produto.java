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
       // jTabbedPane2.setEnabledAt(1, false);

       // this.setLocationRelativeTo(null);

    }

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
        lblCodigo = new javax.swing.JLabel();
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
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuCliente = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuVenda = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnuSintetico = new javax.swing.JMenuItem();
        mnuanalitico = new javax.swing.JMenuItem();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        buttonGroup1.add(rbnCodigo);
        rbnCodigo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        rbnCodigo.setText("Código");
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
                .addGroup(pnlBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBuscaLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblBuscaProduto))
                    .addGroup(pnlBuscaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtBuscaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(195, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBuscaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbnNome)
                    .addComponent(rbnCodigo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        pnlBuscaLayout.setVerticalGroup(
            pnlBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBuscaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBuscaProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBuscaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPesquisar)
                        .addGap(21, 21, 21))
                    .addGroup(pnlBuscaLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(rbnNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbnCodigo)
                        .addContainerGap())))
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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlConsultaProdutoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(pnlConsultaProdutoLayout.createSequentialGroup()
                        .addGroup(pnlConsultaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlConsultaProdutoLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(pnlBusca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(95, 95, 95)
                                .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE))
                            .addGroup(pnlConsultaProdutoLayout.createSequentialGroup()
                                .addGap(264, 264, 264)
                                .addGroup(pnlConsultaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(163, 163, 163)))
                        .addGap(90, 90, 90)))
                .addContainerGap())
        );
        pnlConsultaProdutoLayout.setVerticalGroup(
            pnlConsultaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlConsultaProdutoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnlConsultaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlConsultaProdutoLayout.createSequentialGroup()
                        .addComponent(pnlBusca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(pnlConsultaProdutoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                        .addComponent(btnExcluir)
                        .addGap(40, 40, 40)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
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

        lblCodigo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblCodigo.setText("0");

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
                .addGroup(pnlCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCadastroProdutoLayout.createSequentialGroup()
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCadastroProdutoLayout.createSequentialGroup()
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
                                .addComponent(lblQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(21, 21, 21)
                                .addComponent(txtQuantidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblPcCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPcCompra)
                                .addGap(47, 47, 47)
                                .addComponent(lblLucro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtLucro)
                                .addGap(45, 45, 45)))
                        .addGroup(pnlCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCadastroProdutoLayout.createSequentialGroup()
                                .addComponent(lblPcVenda, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                                .addGap(30, 30, 30)
                                .addComponent(lblPrecoVenda, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                .addGap(75, 75, 75))
                            .addGroup(pnlCadastroProdutoLayout.createSequentialGroup()
                                .addComponent(jdcDataRecebimento, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCadastroProdutoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pnlCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlCadastroProdutoLayout.createSequentialGroup()
                        .addComponent(lblCod)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCodigo)
                        .addGap(33, 33, 33)
                        .addComponent(lblNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNome))
                    .addGroup(pnlCadastroProdutoLayout.createSequentialGroup()
                        .addComponent(lblMarca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(lblSecao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbxSecao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(23, 23, 23))
        );
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
                            .addComponent(lblCodigo)
                            .addComponent(lblNome)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62)
                        .addGroup(pnlCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxSecao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSecao)
                            .addComponent(lblMarca)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)
                        .addGroup(pnlCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblPcVenda))
                            .addGroup(pnlCadastroProdutoLayout.createSequentialGroup()
                                .addGroup(pnlCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtLucro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblLucro)
                                    .addComponent(txtPcCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPcCompra)
                                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblQuantidade))
                                .addGap(4, 4, 4)))
                        .addGap(58, 58, 58)
                        .addGroup(pnlCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbldtRecebimento)
                            .addGroup(pnlCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cbxFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblFornecedor))))
                    .addComponent(jdcDataRecebimento, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(219, 219, 219)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

        mnuanalitico.setText("Analitico");
        mnuanalitico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuanaliticoActionPerformed(evt);
            }
        });
        jMenu3.add(mnuanalitico);

        jMenuBar1.add(jMenu3);

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

    private void mnuanaliticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuanaliticoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuanaliticoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Tela_Cliente cliente = new Tela_Cliente();
        cliente.setVisible(true);

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void mnuVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuVendaActionPerformed
        TelaDeVendas venda = new TelaDeVendas();
        venda.setVisible(true);
    }//GEN-LAST:event_mnuVendaActionPerformed

    private void txtBuscaProdutoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaProdutoKeyTyped
        if (txtNome.getText().length() >= 60) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Máximo de caracteres atigindos!");
        }
    }//GEN-LAST:event_txtBuscaProdutoKeyTyped

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
     


    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed
       
    }//GEN-LAST:event_btnCadastroActionPerformed

    private void txtBuscaProdutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaProdutoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnPesquisar.requestFocus();
        }
    }//GEN-LAST:event_txtBuscaProdutoKeyPressed

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
            }

            try {

                String nome = txtNome.getText();
                String marca = txtMarca.getText();
                String secao = cbxSecao.getSelectedItem().toString();
                int quantidade = Integer.parseInt(txtQuantidade.getText());
                double pcCompra = Double.parseDouble(txtPcCompra.getText().replace(".", ","));
                double pcVenda = Double.parseDouble(lblPrecoVenda.getText());
                int lucro = Integer.parseInt(txtLucro.getText());
                String fornecedor = cbxFornecedor.getSelectedItem().toString();
                Date dataRecebimento = jdcDataRecebimento.getDate();

                Produto objProduto = new Produto();
                objProduto.setNome(nome);
                objProduto.setMarca(marca);
                objProduto.setSecao(secao);
                objProduto.setQuantidade(quantidade);
                objProduto.setPcCompra(pcCompra);
                objProduto.setPcVenda(pcVenda);
                objProduto.setLucro(lucro);
                objProduto.setFornecedor(fornecedor);
                objProduto.setDataRecebimento(dataRecebimento);

                ProdutoDAO salvarProduto = new ProdutoDAO();
                salvarProduto.salvar(objProduto);

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());

            }
            limparTexto();

        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyTyped
        if (txtNome.getText().length() >= 60) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Máximo de caracteres atigindos!");
        }
    }//GEN-LAST:event_txtNomeKeyTyped

    private void txtLucroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLucroKeyTyped
        char c = evt.getKeyChar();

        if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE) && (c != KeyEvent.VK_ENTER) && (c != KeyEvent.VK_DELETE)) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Digite apenas números!");
            txtLucro.setText("");
        }
    }//GEN-LAST:event_txtLucroKeyTyped

    private void txtQuantidadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantidadeKeyTyped
        char c = evt.getKeyChar();

        if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE) && (c != KeyEvent.VK_ENTER) && (c != KeyEvent.VK_DELETE)) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Digite apenas números!");
            txtQuantidade.setText("");
        }
    }//GEN-LAST:event_txtQuantidadeKeyTyped

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

    private void txtPcCompraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPcCompraKeyTyped
        char c = evt.getKeyChar();

        if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE) && (c != KeyEvent.VK_ENTER) &&
                (c != KeyEvent.VK_DELETE) && c != KeyEvent.VK_PERIOD) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Digite apenas números!");
            txtPcCompra.setText("");
        }
    }//GEN-LAST:event_txtPcCompraKeyTyped

    private void txtPcCompraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPcCompraKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtLucro.requestFocus();
        }
    }//GEN-LAST:event_txtPcCompraKeyPressed

    private void txtNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtMarca.requestFocus();
        }
    }//GEN-LAST:event_txtNomeKeyPressed

    private void txtMarcaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMarcaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            cbxSecao.requestFocus();
        }
    }//GEN-LAST:event_txtMarcaKeyPressed

    private void cbxSecaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbxSecaoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtQuantidade.requestFocus();
        }
    }//GEN-LAST:event_cbxSecaoKeyPressed

    private void txtLucroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLucroKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            cbxFornecedor.requestFocus();
        }
    }//GEN-LAST:event_txtLucroKeyPressed

    private void cbxFornecedorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbxFornecedorKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jdcDataRecebimento.requestFocus();
        }
    }//GEN-LAST:event_cbxFornecedorKeyPressed

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

    private void txtMarcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMarcaKeyTyped
        if (txtMarca.getText().length() >= 30) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Máximo de caracteres atigindos!");
        }
    }//GEN-LAST:event_txtMarcaKeyTyped

    private void txtQuantidadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantidadeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtPcCompra.requestFocus();
        }
    }//GEN-LAST:event_txtQuantidadeKeyPressed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        int LinhaSelecionada = tblProduto.getSelectedRow();

        try {
            lblCod.setText(tblProduto.getModel().getValueAt(LinhaSelecionada, 0).toString());
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
        jTabbedPane2.setSelectedIndex(1);
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed


    }//GEN-LAST:event_btnExcluirActionPerformed

    private void rbnCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rbnCodigoKeyTyped
        if (rbnCodigo.getText().length() >= 15) {
            evt.consume();
        }
    }//GEN-LAST:event_rbnCodigoKeyTyped

    private void txtBuscaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscaProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscaProdutoActionPerformed

    private void txtPcCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPcCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPcCompraActionPerformed

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
    private javax.swing.JLabel lblCodigo;
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
    private javax.swing.JMenuItem mnuVenda;
    private javax.swing.JMenuItem mnuanalitico;
    private javax.swing.JPanel pnlBusca;
    private javax.swing.JPanel pnlCadastroProduto;
    private javax.swing.JPanel pnlConsultaProduto;
    private javax.swing.JRadioButton rbnCodigo;
    private javax.swing.JRadioButton rbnNome;
    private javax.swing.JTable tblProduto;
    private javax.swing.JTabbedPane tpProduto;
    private javax.swing.JTextField txtBuscaProduto;
    private javax.swing.JTextField txtLucro;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPcCompra;
    private javax.swing.JTextField txtQuantidade;
    // End of variables declaration//GEN-END:variables
public void ListarTabela() {

        DefaultTableModel Modelo = (DefaultTableModel) tblProduto.getModel();
        Modelo.setNumRows(0);
        ProdutoDAO produtoDAO = new ProdutoDAO();

        for (Produto product : produtoDAO.ListarProdutos()) {
            Modelo.addRow(new String[]{
                String.valueOf(product.getIdCod()),
                product.getNome(),
                product.getMarca(),
                product.getSecao(),
                String.valueOf(product.getQuantidade()),
                String.valueOf(product.getPcCompra()),
                String.valueOf(product.getLucro()),
                String.valueOf(product.getPcVenda()),
                product.getFornecedor(),
                product.getDataRecebimento().toString()
            });

        }
    }

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

    private void alterarProduto() {

        try {

            String nome = txtNome.getText();
            String marca = txtMarca.getText();
            String secao = cbxSecao.getSelectedItem().toString();
            int quantidade = Integer.parseInt(txtQuantidade.getText());
            double pcCompra = Double.parseDouble(txtPcCompra.getText().replace(".", ","));
            double pcVenda = Double.parseDouble(lblPrecoVenda.getText());
            int lucro = Integer.parseInt(txtLucro.getText());
            String fornecedor = cbxFornecedor.getSelectedItem().toString();
            Date dataRecebimento = jdcDataRecebimento.getDate();

            Produto objProduto = new Produto();
            objProduto.setNome(nome);
            objProduto.setMarca(marca);
            objProduto.setSecao(secao);
            objProduto.setQuantidade(quantidade);
            objProduto.setPcCompra(pcCompra);
            objProduto.setPcVenda(pcVenda);
            objProduto.setLucro(lucro);
            objProduto.setFornecedor(fornecedor);
            objProduto.setDataRecebimento(dataRecebimento);

            ProdutoDAO alterProdutoDAO = new ProdutoDAO();
            alterProdutoDAO.Alterar(objProduto);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());

        }
    }
}
