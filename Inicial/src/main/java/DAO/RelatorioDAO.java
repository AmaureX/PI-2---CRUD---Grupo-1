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
import java.util.ArrayList;
import model.Relatorio;

public class RelatorioDAO {

    public static String url = "jdbc:mysql://localhost:3301/Perfumaria_encantus";
    public static String login = "root";
    public static String senha = "root";

    public static ArrayList<Relatorio> listar() {
        ArrayList<Relatorio> listaRetorno = new ArrayList<Relatorio>();

        Connection conexao = null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            conexao = DriverManager.getConnection(url, login, senha);

            PreparedStatement comandoSQL = conexao.prepareStatement("SELECT pagamentos.data_venda as Data,"
                    + " pagamentos.nome_cliente as Cliente,pagamentos.valor_final as Valor"
                    + " FROM pagamentos INNER JOIN clientes ON pagamentos.nome_clinte = clintes.nome_cliente"
                    + "GROUP BY Data, Cliente, Valor;");

            ResultSet rs = comandoSQL.executeQuery();

            if (rs != null) {

                while (rs.next()) {

                    Relatorio novoObjeto = new Relatorio();
                    novoObjeto.setData(rs.getDate("Data"));
                    novoObjeto.setCliente(rs.getString("Cliente"));
                    novoObjeto.setValor(rs.getDouble("Valor"));

                    listaRetorno.add(novoObjeto);

                }

            }

        } catch (ClassNotFoundException ex) {
            listaRetorno = null;
        } catch (SQLException ex) {
            listaRetorno = null;
        }

        return listaRetorno;
    }

}
