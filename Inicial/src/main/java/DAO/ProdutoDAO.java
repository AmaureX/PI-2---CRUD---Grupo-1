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


    public static String url = "jdbc:mysql://localhost:3306/Perfumaria_encantus";
    public static String login = "root";
    public static String senha = "root";

    public static boolean salvar(Produto obj) {
        boolean retorno = false;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexao = DriverManager.getConnection(url, login, senha);
            retorno = true;

            PreparedStatement comandoSQL = conexao.prepareStatement("INSERT INTO Produtos (nome_produto,marca, secao, quantidade, preco_compra, lucro, fornecedor,preco_venda, data_recebimento) VALUES (?,?,?,?,?,?,?,?,?)",Statement.RETURN_GENERATED_KEYS);

            comandoSQL.setString(1, obj.getNome());
            comandoSQL.setString(2, obj.getMarca());
            comandoSQL.setString(3, obj.getSecao());
            comandoSQL.setString(4, obj.getQuantidade());
            comandoSQL.setString(5, obj.getPcCompra());
            comandoSQL.setString(6, obj.getLucro());
            comandoSQL.setString(7, obj.getFornecedor());
            comandoSQL.setString(8, obj.getPcVenda());
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
            PreparedStatement ComandoSQL = conexao.prepareStatement("UPDATE produtos SET nome_produto = ?, marca = ?, secao = ?, quantidade = ?, preco_compra = ?, lucro = ?, fornecedor = ?,preco_venda = ?, data_recebimento = ? WHERE codigo =?", Statement.RETURN_GENERATED_KEYS);
            
            
            ComandoSQL.setString(1, obj.getNome());
            ComandoSQL.setString(2, obj.getMarca());
            ComandoSQL.setString(3, obj.getSecao());
            ComandoSQL.setString(4, obj.getQuantidade());
            ComandoSQL.setString(5, obj.getPcCompra());
            ComandoSQL.setString(6, obj.getLucro());
            ComandoSQL.setString(7, obj.getFornecedor());
            ComandoSQL.setString(8, obj.getPcVenda());
            ComandoSQL.setDate(9, new java.sql.Date(obj.getDataRecebimento().getTime()));
            ComandoSQL.setString(10, obj.getIdCod());

            int numeroLinha = ComandoSQL.executeUpdate();
            
            if (numeroLinha > 0) {
                retorno = true;
            }
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
        } catch (ClassNotFoundException | SQLException erro) {
            JOptionPane.showConfirmDialog(null, erro.getMessage());
        }
        return retorno;

    }

    public List<Produto> ListarProdutos() {
        List<Produto> listaProdutos = new ArrayList<>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection Conexao = DriverManager.getConnection(url, login, senha);
            ResultSet rs = null;

            PreparedStatement ComandoSQL = Conexao.prepareStatement("SELECT * FROM produtos");
            rs = ComandoSQL.executeQuery();

            while (rs.next()) {
                Produto Produto = new Produto();

                Produto.setIdCod(rs.getString("codigo"));
                Produto.setNome(rs.getString("nome_produto"));
                Produto.setMarca(rs.getString("marca"));
                Produto.setSecao(rs.getString("secao"));
                Produto.setQuantidade(rs.getString("quantidade"));
                Produto.setPcCompra(rs.getString("preco_compra"));
                Produto.setLucro(rs.getString("lucro"));
                Produto.setPcVenda(rs.getString("preco_venda"));
                Produto.setFornecedor(rs.getString("fornecedor"));
                Produto.setDataRecebimento(rs.getDate("data_recebimento"));

                listaProdutos.add(Produto);

            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        }
        return listaProdutos;
    }

    public List<Produto> BuscarCodProd(String Busca) {
        List<Produto> listaProduto = new ArrayList<>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection Conexao = DriverManager.getConnection(url, login, senha);
            ResultSet rs = null;

            PreparedStatement ComandoSQL = Conexao.prepareStatement("SELECT * FROM produtos WHERE codigo LIKE ?");
            ComandoSQL.setString(1,"%" +Busca);
            rs = ComandoSQL.executeQuery();

            while (rs.next()) {
                Produto Produto = new Produto();

                Produto.setIdCod(rs.getString("codigo"));
                Produto.setNome(rs.getString("nome_produto"));
                Produto.setMarca(rs.getString("marca"));
                Produto.setSecao(rs.getString("secao"));
                Produto.setQuantidade(rs.getString("quantidade"));
                Produto.setPcCompra(rs.getString("preco_compra"));
                Produto.setLucro(rs.getString("lucro"));
                Produto.setPcVenda(rs.getString("preco_venda"));
                Produto.setFornecedor(rs.getString("fornecedor"));
                Produto.setDataRecebimento(rs.getDate("data_recebimento"));

                listaProduto.add(Produto);
            }
        } catch (ClassNotFoundException | SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        }
        return listaProduto;

    }

    public List<Produto> BuscarNomeProd(String Busca) {
        List<Produto> listaProduto = new ArrayList<>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection Conexao = DriverManager.getConnection(url, login, senha);
            ResultSet rs = null;

            PreparedStatement ComandoSQL = Conexao.prepareStatement("SELECT * FROM produtos WHERE nome_produto LIKE ?");
            ComandoSQL.setString(1, "%" + Busca + "%");
            rs = ComandoSQL.executeQuery();

            while (rs.next()) {
                Produto Produto = new Produto();

                Produto.setIdCod(rs.getString("codigo"));
                Produto.setNome(rs.getString("nome_produto"));
                Produto.setMarca(rs.getString("marca"));
                Produto.setSecao(rs.getString("secao"));
                Produto.setQuantidade(rs.getString("quantidade"));
                Produto.setPcCompra(rs.getString("preco_compra"));
                Produto.setLucro(rs.getString("lucro"));
                Produto.setPcVenda(rs.getString("preco_venda"));
                Produto.setFornecedor(rs.getString("fornecedor"));
                Produto.setDataRecebimento(rs.getDate("data_recebimento"));

                listaProduto.add(Produto);
            }
        } catch (ClassNotFoundException | SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        }
        return listaProduto;
    }

    public static boolean Excluir(String codProd) {
        boolean Retorno = false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection Conexao = DriverManager.getConnection(url, login, senha);
            PreparedStatement ComandoSQL = Conexao.prepareStatement("DELETE FROM produtos WHERE codigo = ?");

            ComandoSQL.setString(1, codProd);

            int NumeroLinha = ComandoSQL.executeUpdate();
            if (NumeroLinha > 0) {
                Retorno = true;
            }
            JOptionPane.showMessageDialog(null, "Excluido com Sucesso!");
        } catch (ClassNotFoundException | SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        }
        return Retorno;
    }
}
