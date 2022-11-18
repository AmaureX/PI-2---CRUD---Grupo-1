/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import static com.mysql.cj.conf.PropertyKey.logger;
import static DAO.ProdutoDAO.login;
import static DAO.ProdutoDAO.senha;
import static DAO.ProdutoDAO.url;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import model.Produto;

/**
 *
 * @author cilucena
 */
public class ProdutoDAO {

    public static String url = "jdbc:mysql://localhost:3306/teste_tela_produto";
    public static String login = "root";
    public static String senha = "Cacajuju14.";

    public static boolean salvar(Produto obj) {
        boolean retorno = false;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexao = DriverManager.getConnection(url, login, senha);
            retorno = true;
            PreparedStatement comandoSQL = conexao.prepareStatement("INSERT INTO Produto (nome_produto,marca, secao, quantidade, preco_compra, lucro, fornecedor,preco_venda, data_recebimento) VALUES (?,?,?,?,?,?,?,?,?)",
                    Statement.RETURN_GENERATED_KEYS);

            comandoSQL.setString(1, obj.getNome());
            comandoSQL.setString(2, obj.getMarca());
            comandoSQL.setString(3, obj.getSecao());
            comandoSQL.setInt(4, obj.getQuantidade());
            comandoSQL.setDouble(5, obj.getPcCompra());
            comandoSQL.setDouble(6, obj.getLucro());
            comandoSQL.setString(7, obj.getFornecedor());
            comandoSQL.setDouble(8, obj.getPcVenda());
            comandoSQL.setDate(9, new java.sql.Date(obj.getDataRecebimento().getTime()));

            int NumeroLinhas = comandoSQL.executeUpdate();
            if (NumeroLinhas > 0) {
                retorno = true;
            }

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }

        return retorno;
    }

    public static boolean Alterar(Produto obj) {
        boolean retorno = false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexao = DriverManager.getConnection(url, login, senha);
            PreparedStatement ComandoSQL = conexao.prepareStatement("UPDATE produto SET codigo = ?, nome_produto = ?, marca = ?, secao = ?, quantidade = ?, preco_compra = ?, lucro = ?, fornecedor = ?,preco_venda = ?, data_recebimento = ? WHERE codigo = ?", Statement.RETURN_GENERATED_KEYS);

            ComandoSQL.setInt(1, obj.getIdCod());
            ComandoSQL.setString(2, obj.getNome());
            ComandoSQL.setString(3, obj.getMarca());
            ComandoSQL.setString(4, obj.getSecao());
            ComandoSQL.setInt(5, obj.getQuantidade());
            ComandoSQL.setDouble(6, obj.getPcCompra());
            ComandoSQL.setInt(7, obj.getLucro());
            ComandoSQL.setString(8, obj.getFornecedor());
            ComandoSQL.setDate(10, new java.sql.Date(obj.getDataRecebimento().getTime()));

            int numeroLinha = ComandoSQL.executeUpdate();
            if (numeroLinha > 0) {
                retorno = true;
            }
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");

        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showConfirmDialog(null, e.getMessage());
        }
        return retorno;

    }

    public List<Produto> ListarProdutos() {
        List<Produto> listaProdutos = new ArrayList<>();

        try {
            Class.forName("com.mysql.cj.jdbc.DRiver");
            Connection Conexao = DriverManager.getConnection(url, login, senha);
            ResultSet rs = null;

            PreparedStatement ComandoSQL = Conexao.prepareStatement("SELECT * FROM produtos");
            rs = ComandoSQL.executeQuery();

            while (rs.next()) {
                Produto Produto = new Produto();

                Produto.setIdCod(rs.getInt("codigo"));
                Produto.setNome(rs.getString("nome_produto"));
                Produto.setMarca(rs.getString("marca"));
                Produto.setSecao(rs.getString("secao"));
                Produto.setQuantidade(rs.getInt("quantidade"));
                Produto.setPcCompra(rs.getDouble("preco_compra"));
                Produto.setLucro(rs.getInt("lucro"));
                Produto.setPcVenda(rs.getDouble("preco_venda"));
                Produto.setFornecedor(rs.getString("fornecedor"));
                Produto.setDataRecebimento(rs.getDate("data_recebimento"));

                listaProdutos.add(Produto);

            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        }
        return listaProdutos;
    }
}
