/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import static DAO.ClienteDAO.Login;
import static DAO.ClienteDAO.Senha;
import static DAO.PagamentoDAO.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import model.Pagamento;
import model.Produto;
import model.Vendas;

/**
 *
 * @author csnas
 */
public class VendasDAO {

    static String URL = "jdbc:mysql://localhost:3306/teste";
    static String login = "root";
    static String senha = "root";

    public static boolean Salvar(Pagamento obj) {
        boolean retorno = false;
        Integer generatedID = null;


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexao = DriverManager.getConnection(URL, login, senha);

            for (Vendas item : obj.getListaItens()) {
                
                PreparedStatement ComandoSQLItem;
                ComandoSQLItem = conexao.prepareStatement("INSERT INTO vendas (quantidade,"
                        + "cod_produto, nome_produto, valor_unitario, valor_total) VALUES (?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
                ComandoSQLItem.setInt(1, item.getQuantidade());
                 ComandoSQLItem.setInt(2, item.getCodProduto());
                ComandoSQLItem.setString(3, item.getNomeProduto());
                ComandoSQLItem.setDouble(4, item.getValorUnitario());
                ComandoSQLItem.setDouble(5, item.getValorTotal());

                int linhasAfetadasItem = ComandoSQLItem.executeUpdate();

                if (linhasAfetadasItem > 0) {
                     ResultSet rs = ComandoSQLItem.getGeneratedKeys();
                if (rs.next()) {
                    generatedID = rs.getInt(1);
                }

                    retorno = true;

                }
            }

        } catch (ClassNotFoundException | SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        }
        return retorno;
    }
    
    public Produto PesquisarProdutoCod(int cod) {
        
        try { Class.forName("com.mysql.cj.jdbc.Driver");
            Connection Conexao = DriverManager.getConnection(URL, Login, Senha);

            PreparedStatement ComandoSQL = Conexao.prepareStatement(("SELECT * FROM produtos WHERE codigo = ?"), 
                    ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            
            Produto p = new Produto();
            ComandoSQL.setInt(1, cod);
            ResultSet rs = ComandoSQL.executeQuery();
            
            rs.first();
            p.setIdCod(rs.getInt("codigo"));
            p.setNome(rs.getString("nome_produto"));
            p.setPcVenda(rs.getDouble("preco_venda"));
            
            return p;
        } catch (ClassNotFoundException | SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        }
return null;
    }
}
