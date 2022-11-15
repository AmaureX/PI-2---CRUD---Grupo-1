/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import model.Pagamento;
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

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexao = DriverManager.getConnection(URL, login, senha);

            for (Vendas item : obj.getListaItens()) {
                PreparedStatement ComandoSQLItem = conexao.prepareStatement("INSERT INTO vendas (cod_produto,"
                        + "nome_produto, quantidade, valor_unitario, valor_total) VALUES (?,?,?,?,?)");
                ComandoSQLItem.setInt(1, item.getCodProduto());
                ComandoSQLItem.setString(2, item.getNomeProduto());
                ComandoSQLItem.setInt(3, item.getQuantidade());
                ComandoSQLItem.setDouble(4, item.getValorUnitario());
                ComandoSQLItem.setDouble(5, item.getValorTotal());

                int linhasAfetadasItem = ComandoSQLItem.executeUpdate();

                if (linhasAfetadasItem > 0) {

                    retorno = true;

                }
            }

        } catch (ClassNotFoundException | SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        }
        return retorno;
    }
}
