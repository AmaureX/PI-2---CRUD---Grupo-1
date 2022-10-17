package TelasPrincipais;

import TelasPrincipais.TelaDeVendas;
import com.sun.imageio.plugins.jpeg.JPEG;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;
import jdk.nashorn.internal.ir.BreakNode;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author cilucena
 */
public class Tela_Produto extends javax.swing.JFrame {

    /**
     * Creates new form produto
     */
    public Tela_Produto() {
        initComponents();

        tblProduto.getColumnModel().getColumn(0).setPreferredWidth(2);
        tblProduto.getColumnModel().getColumn(1).setPreferredWidth(100);
        tblProduto.getColumnModel().getColumn(2).setPreferredWidth(2);
        tblProduto.getColumnModel().getColumn(3).setPreferredWidth(20);

        pack();

    }

    private void corLabel() {
        lblNome.setForeground(Color.black);
        lblQuantidade.setForeground(Color.black);
        lblSecao.setForeground(Color.black);
        lblPrecoCompra.setForeground(Color.black);
        lblLucro.setForeground(Color.black);
        lblPcVenda.setForeground(Color.black);
        lblPcTotalCompra.setForeground(Color.black);
        lblFornecedor.setForeground(Color.black);
        lblMarca.setForeground(Color.black);
        ftfDataRecebimento.setForeground(Color.black);

    }

    private void limparTexto() {

        txtNome.setText("");
        txtLucro.setText("");
        txtPcCompra.setText("");
        txtQuantidade.setText("");
        lblPrecoVenda.setText("");
        lblPrecoTotalCompra.setText("");
        cbxSecao.setSelectedItem("");
        cbxFornecedor.setSelectedItem("");
        lblLucroTotal.setText("");
        txtMarca.setText("");
        lblPrecoTotalVenda.setText("");
        ftfDataRecebimento.setText("");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        cadastroProduto = new javax.swing.JLabel();
        plProduto = new javax.swing.JPanel();
        lblCod = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblQuantidade = new javax.swing.JLabel();
        lblPrecoCompra = new javax.swing.JLabel();
        lblPcVenda = new javax.swing.JLabel();
        lblFornecedor = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProduto = new javax.swing.JTable();
        btnExcluir = new javax.swing.JButton();
        lblCodProduto = new javax.swing.JLabel();
        cbxFornecedor = new javax.swing.JComboBox<>();
        btnEditar = new javax.swing.JButton();
        txtQuantidade = new javax.swing.JTextField();
        btnVoltar = new javax.swing.JButton();
        lblLucro = new javax.swing.JLabel();
        txtLucro = new javax.swing.JTextField();
        lblPcTotalCompra = new javax.swing.JLabel();
        cbxSecao = new javax.swing.JComboBox<>();
        lblSecao = new javax.swing.JLabel();
        lblPrecoVenda = new javax.swing.JLabel();
        lblPrecoTotalCompra = new javax.swing.JLabel();
        txtPcCompra = new javax.swing.JTextField();
        lblMarca = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        lblPcTotalVenda = new javax.swing.JLabel();
        lblPrecoTotalVenda = new javax.swing.JLabel();
        lblLcrTotal = new javax.swing.JLabel();
        lblLucroTotal = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblBuscaProduto = new javax.swing.JLabel();
        txtBuscaProduto = new javax.swing.JTextField();
        rbtCodigo = new javax.swing.JRadioButton();
        rbtNome = new javax.swing.JRadioButton();
        btnPesquisar = new javax.swing.JButton();
        lblDataRecebimento = new javax.swing.JLabel();
        ftfDataRecebimento = new javax.swing.JFormattedTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnuSintetico = new javax.swing.JMenuItem();
        mnuAnalitico = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Produto");

        cadastroProduto.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        cadastroProduto.setText("Cadastro Produto");
        cadastroProduto.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        lblCod.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblCod.setText("Cod:");

        lblNome.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblNome.setText("Nome:");

        txtNome.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
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

        lblQuantidade.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblQuantidade.setText("Quantidade:");

        lblPrecoCompra.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblPrecoCompra.setText("Preço Compra: ");

        lblPcVenda.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblPcVenda.setText("Preço de Venda: ");

        lblFornecedor.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblFornecedor.setText("Fornecedor: ");

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

        tblProduto.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tblProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod", "Nome", "Marca", "Seção"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblProduto);

        btnExcluir.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        lblCodProduto.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        cbxFornecedor.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cbxFornecedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione uma opção>", "Bim Distribuidora de Cosméticos Importados", "Official Distribuidora de Perfumes e Cosméticos", "Distribuidora Paris", "Arte dos Aromas", "Herbia Distribuidora" }));
        cbxFornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbxFornecedorMouseClicked(evt);
            }
        });
        cbxFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxFornecedorActionPerformed(evt);
            }
        });
        cbxFornecedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbxFornecedorKeyPressed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        txtQuantidade.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
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

        btnVoltar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        lblLucro.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblLucro.setText("Lucro:");

        txtLucro.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
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

        lblPcTotalCompra.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblPcTotalCompra.setText("Preço total compra:");

        cbxSecao.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cbxSecao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione uma opção>", "Cosméticos", "Perfumaria", "Higiene", "Unhas", "Cabelo", "Bijuterias" }));
        cbxSecao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbxSecaoMouseClicked(evt);
            }
        });
        cbxSecao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbxSecaoKeyPressed(evt);
            }
        });

        lblSecao.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblSecao.setText("Seção:");

        lblPrecoVenda.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblPrecoVenda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lblPrecoVendaKeyPressed(evt);
            }
        });

        lblPrecoTotalCompra.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblPrecoTotalCompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lblPrecoTotalCompraKeyPressed(evt);
            }
        });

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

        lblMarca.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblMarca.setText("Marca:");

        txtMarca.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaActionPerformed(evt);
            }
        });
        txtMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMarcaKeyPressed(evt);
            }
        });

        lblPcTotalVenda.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblPcTotalVenda.setText("Preço total venda:");

        lblLcrTotal.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblLcrTotal.setText("Lucro Total:");

        lblLucroTotal.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        lblBuscaProduto.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblBuscaProduto.setText("Busca de Produtos:");

        txtBuscaProduto.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtBuscaProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscaProdutoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscaProdutoKeyTyped(evt);
            }
        });

        buttonGroup1.add(rbtCodigo);
        rbtCodigo.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        rbtCodigo.setText("Código");
        rbtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtCodigoActionPerformed(evt);
            }
        });
        rbtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rbtCodigoKeyTyped(evt);
            }
        });

        buttonGroup1.add(rbtNome);
        rbtNome.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        rbtNome.setText("Nome");
        rbtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtNomeActionPerformed(evt);
            }
        });
        rbtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rbtNomeKeyTyped(evt);
            }
        });

        btnPesquisar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtBuscaProduto)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbtNome)
                            .addComponent(rbtCodigo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 251, Short.MAX_VALUE)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblBuscaProduto)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblBuscaProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(rbtCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbtNome)))
                .addGap(0, 22, Short.MAX_VALUE))
        );

        lblDataRecebimento.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblDataRecebimento.setText("Data recebimento:");

        try {
            ftfDataRecebimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftfDataRecebimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftfDataRecebimentoActionPerformed(evt);
            }
        });
        ftfDataRecebimento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ftfDataRecebimentoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ftfDataRecebimentoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout plProdutoLayout = new javax.swing.GroupLayout(plProduto);
        plProduto.setLayout(plProdutoLayout);
        plProdutoLayout.setHorizontalGroup(
            plProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(plProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(plProdutoLayout.createSequentialGroup()
                        .addComponent(lblCod)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCodProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblMarca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(lblSecao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxSecao, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(plProdutoLayout.createSequentialGroup()
                        .addGroup(plProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(plProdutoLayout.createSequentialGroup()
                                .addComponent(lblPcVenda)
                                .addGap(18, 18, 18)
                                .addComponent(lblPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32))
                            .addGroup(plProdutoLayout.createSequentialGroup()
                                .addComponent(lblQuantidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(plProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(plProdutoLayout.createSequentialGroup()
                                .addComponent(lblPrecoCompra)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPcCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(plProdutoLayout.createSequentialGroup()
                                .addComponent(lblPcTotalCompra)
                                .addGap(18, 18, 18)
                                .addComponent(lblPrecoTotalCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(plProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(plProdutoLayout.createSequentialGroup()
                                .addComponent(lblPcTotalVenda)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblPrecoTotalVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(plProdutoLayout.createSequentialGroup()
                                .addComponent(lblLucro)
                                .addGap(29, 29, 29)
                                .addComponent(txtLucro, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(lblFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbxFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(plProdutoLayout.createSequentialGroup()
                        .addGroup(plProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(plProdutoLayout.createSequentialGroup()
                                .addGroup(plProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1018, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(61, 61, 61)
                                .addGroup(plProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(plProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnExcluir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(plProdutoLayout.createSequentialGroup()
                                .addComponent(lblLcrTotal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblLucroTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(88, 88, 88)
                                .addComponent(lblDataRecebimento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ftfDataRecebimento, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plProdutoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        plProdutoLayout.setVerticalGroup(
            plProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plProdutoLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(plProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(plProdutoLayout.createSequentialGroup()
                        .addGroup(plProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNome)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCodProduto)
                            .addComponent(lblCod)
                            .addComponent(lblSecao)
                            .addComponent(cbxSecao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMarca)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(plProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblQuantidade)
                            .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPrecoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPcCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLucro)
                            .addComponent(txtLucro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFornecedor))
                        .addGroup(plProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(plProdutoLayout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(lblPcVenda))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plProdutoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(plProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblPcTotalCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblPrecoTotalCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblPcTotalVenda)
                                        .addComponent(lblPrecoTotalVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addComponent(lblPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(plProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(plProdutoLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(plProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLcrTotal)
                            .addComponent(lblLucroTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plProdutoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(plProdutoLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(plProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDataRecebimento)
                            .addComponent(ftfDataRecebimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(plProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, plProdutoLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(btnEditar)
                        .addGap(58, 58, 58)
                        .addComponent(btnExcluir)
                        .addGap(53, 53, 53)
                        .addComponent(btnSalvar)))
                .addGap(26, 26, 26)
                .addComponent(btnVoltar)
                .addContainerGap())
        );

        jMenu1.setText("Cliente");

        jMenuItem2.setText("Tela Cliente");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Vendas");

        jMenuItem4.setText("Tela Venda");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Relatórios");

        mnuSintetico.setText("Sintético");
        mnuSintetico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSinteticoActionPerformed(evt);
            }
        });
        jMenu3.add(mnuSintetico);

        mnuAnalitico.setText("Analitico");
        mnuAnalitico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAnaliticoActionPerformed(evt);
            }
        });
        jMenu3.add(mnuAnalitico);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(cadastroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(plProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(cadastroProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(plProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLucroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLucroKeyTyped
        char c = evt.getKeyChar();

        if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE) && (c != KeyEvent.VK_ENTER) && (c != KeyEvent.VK_DELETE)) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Digite apenas números!");
            txtLucro.setText("");
        }
    }//GEN-LAST:event_txtLucroKeyTyped

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed

    }//GEN-LAST:event_btnVoltarActionPerformed

    private void txtQuantidadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantidadeKeyTyped
        char c = evt.getKeyChar();

        if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE) && (c != KeyEvent.VK_ENTER) && (c != KeyEvent.VK_DELETE)) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Digite apenas números!");
            txtQuantidade.setText("");
        }
    }//GEN-LAST:event_txtQuantidadeKeyTyped

    private void txtQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantidadeActionPerformed

    }//GEN-LAST:event_txtQuantidadeActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        limparTexto();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        if (rbtNome.isSelected()) {
            if (txtBuscaProduto.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(this, "Digite o nome do produto para busca-lo");
            }
            return;
        }
        if (rbtCodigo.isSelected()) {

            if (txtBuscaProduto.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(this, "Digite o código do produto para busca-lo");
            }

        }

    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void cbxFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxFornecedorActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        switch (JOptionPane.showConfirmDialog(null, "Deseja excluir?", "Mensagem", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)) {
            case 0:
                if (tblProduto.getSelectedRow() != -1) {
                    DefaultTableModel model = (DefaultTableModel) tblProduto.getModel();
                    model.removeRow(tblProduto.getSelectedRow());
                } else {
                    JOptionPane.showMessageDialog(null, "Selecione um Produto!");
                }
                break;
            case 1:
                break;
        }
        limparTexto();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        String Fornecedor = "", Secao = "";

        Fornecedor = String.valueOf(cbxFornecedor.getSelectedItem());
        Secao = String.valueOf(cbxSecao.getSelectedItem());

        corLabel();

        if (txtNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite o nome do Produto!");
            lblNome.setForeground(Color.red);
            txtNome.requestFocus();
            return;
        }
        if (txtMarca.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite a marca do Produto!");
            lblMarca.setForeground(Color.red);
            txtMarca.requestFocus();
            return;
        }
        if (cbxSecao.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Selecione a seção!");
            lblSecao.setForeground(Color.red);
            cbxSecao.requestFocus();
            return;
        }
        if (txtQuantidade.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite a quantidade!");
            lblQuantidade.setForeground(Color.red);
            lblQuantidade.requestFocus();
            return;
        }
        if (txtPcCompra.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite o preço da compra!");
            lblPrecoCompra.setForeground(Color.red);
            txtPcCompra.requestFocus();
            return;
        }
        if (txtLucro.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite o lucro para a venda!");
            lblLucro.setForeground(Color.red);
            txtLucro.requestFocus();
            return;
        }
        if (cbxFornecedor.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Selecione um fornecedor!");
            lblFornecedor.setForeground(Color.red);
            cbxFornecedor.requestFocus();
            return;
        }
        if (ftfDataRecebimento.getText().replace("/", "").trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Digite a data de recebimento!");
            lblDataRecebimento.setForeground(Color.red);
            ftfDataRecebimento.requestFocus();
            return;
        }

        JOptionPane.showConfirmDialog(null, "Deseja Salvar?", "Mensagem", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        lblPrecoVenda.getText();
        lblPrecoTotalCompra.getText();
        txtLucro.getText();
        lblPrecoVenda.getText();
        lblPrecoTotalCompra.getText();
        lblPrecoTotalVenda.getText();
        cbxSecao.getSelectedItem();
        cbxFornecedor.getSelectedItem();
        txtMarca.getText();
        lblLucroTotal.getText();
        ftfDataRecebimento.getText();
        limparTexto();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyTyped
        if (txtNome.getText().length() >= 40) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Máximo de 40 caracteres atigindos!");
        }
    }//GEN-LAST:event_txtNomeKeyTyped

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed

    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtLucroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLucroActionPerformed
        double cent = 0.00, rst = 0.00, preco = 0.00, precoTotal = 0.00, preso = 0.00, presoTotal = 0.00, totalVenda = 0.00, totalCompra = 0.00, lucroTotal = 0.00;
        try {
            double p1 = Double.parseDouble(txtPcCompra.getText());
            cent = Double.parseDouble((String) txtLucro.getText());
            rst = (p1 * cent / 100);
            String a = String.valueOf(rst + p1);
            lblPrecoVenda.setText(a);

            int quantidade = Integer.parseInt(txtQuantidade.getText());
            preco = Double.parseDouble((String) txtPcCompra.getText());
            precoTotal = quantidade * preco;
            String b = String.valueOf(precoTotal);
            lblPrecoTotalCompra.setText(b);

            preso = Double.parseDouble((String) lblPrecoVenda.getText());
            presoTotal = quantidade * preso;
            String c = String.valueOf(presoTotal);
            lblPrecoTotalVenda.setText(c);

            totalVenda = Double.parseDouble((String) lblPrecoTotalVenda.getText());
            totalCompra = Double.parseDouble((String) lblPrecoTotalCompra.getText());
            lucroTotal = totalVenda - totalCompra;
            String d = String.valueOf(lucroTotal);
            lblLucroTotal.setText(d);

        } catch (NumberFormatException e) {

        }

    }//GEN-LAST:event_txtLucroActionPerformed

    private void txtLucroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLucroMouseExited
        double cent = 0.00, rst = 0.00, preco = 0.00, precoTotal = 0.00, preso = 0.00, presoTotal = 0.00, totalVenda = 0.00, totalCompra = 0.00, lucroTotal = 0.00;
        try {
            double p1 = Double.parseDouble(txtPcCompra.getText());
            cent = Double.parseDouble((String) txtLucro.getText());
            rst = (p1 * cent / 100);
            String a = String.valueOf(rst + p1);
            lblPrecoVenda.setText(a);

            int quantidade = Integer.parseInt(txtQuantidade.getText());
            preco = Double.parseDouble((String) txtPcCompra.getText());
            precoTotal = quantidade * preco;
            String b = String.valueOf(precoTotal);
            lblPrecoTotalCompra.setText(b);

            preso = Double.parseDouble((String) lblPrecoVenda.getText());
            presoTotal = quantidade * preso;
            String c = String.valueOf(presoTotal);
            lblPrecoTotalVenda.setText(c);

            totalVenda = Double.parseDouble((String) lblPrecoTotalVenda.getText());
            totalCompra = Double.parseDouble((String) lblPrecoTotalCompra.getText());
            lucroTotal = totalVenda - totalCompra;
            String d = String.valueOf(lucroTotal);
            lblLucroTotal.setText(d);

        } catch (NumberFormatException e) {

        }


    }//GEN-LAST:event_txtLucroMouseExited

    private void txtPcCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPcCompraActionPerformed

    }//GEN-LAST:event_txtPcCompraActionPerformed

    private void txtPcCompraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPcCompraKeyTyped
        char c = evt.getKeyChar();

        if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE) && (c != KeyEvent.VK_ENTER) && (c != KeyEvent.VK_DELETE)) {
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

    private void txtQuantidadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantidadeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtPcCompra.requestFocus();
        }
    }//GEN-LAST:event_txtQuantidadeKeyPressed

    private void cbxSecaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbxSecaoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtQuantidade.requestFocus();
        }
    }//GEN-LAST:event_cbxSecaoKeyPressed

    private void cbxSecaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxSecaoMouseClicked

    }//GEN-LAST:event_cbxSecaoMouseClicked

    private void txtLucroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLucroKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            cbxFornecedor.requestFocus();
        }
    }//GEN-LAST:event_txtLucroKeyPressed

    private void cbxFornecedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxFornecedorMouseClicked

    }//GEN-LAST:event_cbxFornecedorMouseClicked

    private void cbxFornecedorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbxFornecedorKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            ftfDataRecebimento.requestFocus();
        }
    }//GEN-LAST:event_cbxFornecedorKeyPressed

    private void lblPrecoVendaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblPrecoVendaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            lblPrecoTotalCompra.requestFocus();
        }
    }//GEN-LAST:event_lblPrecoVendaKeyPressed

    private void lblPrecoTotalCompraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblPrecoTotalCompraKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            cbxFornecedor.requestFocus();
        }
    }//GEN-LAST:event_lblPrecoTotalCompraKeyPressed

    private void txtMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaActionPerformed

    }//GEN-LAST:event_txtMarcaActionPerformed

    private void txtMarcaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMarcaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            cbxSecao.requestFocus();
        }
    }//GEN-LAST:event_txtMarcaKeyPressed

    private void rbtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtCodigoActionPerformed

    private void txtBuscaProdutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaProdutoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscaProdutoKeyPressed

    private void txtBuscaProdutoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaProdutoKeyTyped
        if (rbtNome.isSelected()) {

            if (txtBuscaProduto.getText().length() >= 50) {
                evt.consume();
                JOptionPane.showMessageDialog(this, "Número máximo de caracteres digitados!");
                txtBuscaProduto.setText("");
            }
        }

        if (rbtCodigo.isSelected()) {
            String caracteres = "0987654321";
            if (!caracteres.contains(evt.getKeyChar() + "")) {
                evt.consume();

            }
        }
    }//GEN-LAST:event_txtBuscaProdutoKeyTyped

    private void rbtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rbtCodigoKeyTyped
        if (rbtCodigo.getText().length() >= 15) {
            evt.consume();

    }//GEN-LAST:event_rbtCodigoKeyTyped
    }
    private void rbtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtNomeActionPerformed

    private void rbtNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rbtNomeKeyTyped
        if (rbtNome.getText().length() >= 40) {
            evt.consume();
        }
    }//GEN-LAST:event_rbtNomeKeyTyped

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Tela_Cliente cliente = new Tela_Cliente();
        cliente.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void mnuAnaliticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAnaliticoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuAnaliticoActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        TelaDeVendas venda = new TelaDeVendas();
        venda.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void mnuSinteticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSinteticoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuSinteticoActionPerformed

    private void ftfDataRecebimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftfDataRecebimentoActionPerformed

    }//GEN-LAST:event_ftfDataRecebimentoActionPerformed

    private void ftfDataRecebimentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ftfDataRecebimentoKeyTyped
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnSalvar.requestFocus();
        }
    }//GEN-LAST:event_ftfDataRecebimentoKeyTyped

    private void ftfDataRecebimentoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ftfDataRecebimentoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnSalvar.requestFocus();
        }
    }//GEN-LAST:event_ftfDataRecebimentoKeyPressed

    private void btnSalvarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSalvarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            JOptionPane.showConfirmDialog(null, "Deseja Salvar?", "Mensagem", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            lblPrecoVenda.getText();
            lblPrecoTotalCompra.getText();
            txtLucro.getText();
            lblPrecoVenda.getText();
            lblPrecoTotalCompra.getText();
            lblPrecoTotalVenda.getText();
            cbxSecao.getSelectedItem();
            cbxFornecedor.getSelectedItem();
            txtMarca.getText();
            lblLucroTotal.getText();
            ftfDataRecebimento.getText();
            limparTexto();
        }
    }//GEN-LAST:event_btnSalvarKeyPressed
    public static void main(String args[]) {

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
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel cadastroProduto;
    private javax.swing.JComboBox<String> cbxFornecedor;
    private javax.swing.JComboBox<String> cbxSecao;
    private javax.swing.JFormattedTextField ftfDataRecebimento;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBuscaProduto;
    private javax.swing.JLabel lblCod;
    private javax.swing.JLabel lblCodProduto;
    private javax.swing.JLabel lblDataRecebimento;
    private javax.swing.JLabel lblFornecedor;
    private javax.swing.JLabel lblLcrTotal;
    private javax.swing.JLabel lblLucro;
    private javax.swing.JLabel lblLucroTotal;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPcTotalCompra;
    private javax.swing.JLabel lblPcTotalVenda;
    private javax.swing.JLabel lblPcVenda;
    private javax.swing.JLabel lblPrecoCompra;
    private javax.swing.JLabel lblPrecoTotalCompra;
    private javax.swing.JLabel lblPrecoTotalVenda;
    private javax.swing.JLabel lblPrecoVenda;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JLabel lblSecao;
    private javax.swing.JMenuItem mnuAnalitico;
    private javax.swing.JMenuItem mnuSintetico;
    private javax.swing.JPanel plProduto;
    private javax.swing.JRadioButton rbtCodigo;
    private javax.swing.JRadioButton rbtNome;
    private javax.swing.JTable tblProduto;
    private javax.swing.JTextField txtBuscaProduto;
    private javax.swing.JTextField txtLucro;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPcCompra;
    private javax.swing.JTextField txtQuantidade;
    // End of variables declaration//GEN-END:variables

    private void ftfDataRecebimentoActionPerformed() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
