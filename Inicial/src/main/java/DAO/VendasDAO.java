/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import static DAO.ClienteDAO.Login;
import static DAO.ClienteDAO.Senha;
import static DAO.ProdutoDAO.login;
import static DAO.ProdutoDAO.senha;
import static DAO.ProdutoDAO.url;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import model.Cliente;
import model.Produto;
import model.Vendas;

/**
 *
 * @author csnas
 */
public class VendasDAO {

    static String URL = "jdbc:mysql://localhost:3306/Perfumaria_encantus";
    static String login = "root";
    static String senha = "root";

    public static boolean Salvar(Vendas obj) {
        boolean retorno = false;
        Integer generatedID = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexao = DriverManager.getConnection(URL, login, senha);

            for (Vendas item : obj.getListaItens()) {

                PreparedStatement ComandoSQL;
                ComandoSQL = conexao.prepareStatement("INSERT INTO vendas (quantidade,"
                        + "cod_produto, nome_produto, valor_unitario, valor_total, cpf, nome, tipo_pag,"
                        + " parcelamento, valor_final, data_venda) VALUES (?,?,?,?,?,?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
                ComandoSQL.setInt(1, item.getQuantidade());
                ComandoSQL.setInt(2, item.getCodProduto());
                ComandoSQL.setString(3, item.getNomeProduto());
                ComandoSQL.setDouble(4, item.getValorUnitario());
                ComandoSQL.setDouble(5, item.getValorTotal());
                ComandoSQL.setString(6, obj.getCpf());
                ComandoSQL.setString(7, obj.getNome());
                ComandoSQL.setString(8, obj.getTipo_pag());
                ComandoSQL.setString(9, obj.getParcelamento());
                ComandoSQL.setDouble(10, obj.getFinal());
                ComandoSQL.setDate(11, new java.sql.Date(obj.getDataVenda().getTime()));

                int linhasAfetadas = ComandoSQL.executeUpdate();
                if (linhasAfetadas > 0) {
                    ResultSet rs = ComandoSQL.getGeneratedKeys();
                    if (rs.next()) {
                        int generateID = rs.getInt(1);
                    }
                }

            }

         JOptionPane.showMessageDialog(null, "Salvo com Sucesso!");
        } catch (ClassNotFoundException | SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        }
        return retorno;
    }

    public Produto PesquisarProdutoCod(int cod) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection Conexao = DriverManager.getConnection(URL, Login, Senha);

            PreparedStatement ComandoSQL = Conexao.prepareStatement(("SELECT * FROM produtos WHERE codigo = ?"),
                    ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

            Produto p = new Produto();
            ComandoSQL.setInt(1, cod);
            ResultSet rs = ComandoSQL.executeQuery();

            rs.first();
            p.setIdCod(rs.getString("codigo"));
            p.setNome(rs.getString("nome_produto"));
            p.setPcVenda(rs.getString("preco_venda"));

            return p;
        } catch (ClassNotFoundException | SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        }
        return null;
    }

    public Cliente PesquisarCliente(String cpf) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection Conexao = DriverManager.getConnection(URL, Login, Senha);

            PreparedStatement ComandoSQL = Conexao.prepareStatement(("SELECT * FROM clientes WHERE cpf = ?"),
                    ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            Cliente c = new Cliente();
            ComandoSQL.setString(1, cpf);
            ResultSet rs = ComandoSQL.executeQuery();

            rs.first();
            c.setCPF(rs.getString("cpf"));
            c.setNome(rs.getString("nome_cliente"));

            return c;

        } catch (ClassNotFoundException | SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        }
        return null;
    }
    
    

}

