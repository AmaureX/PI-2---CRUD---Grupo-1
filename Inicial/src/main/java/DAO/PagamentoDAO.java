/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import static DAO.ClienteDAO.Login;
import static DAO.ClienteDAO.Senha;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Cliente;
import model.Pagamento;
import model.Produto;

/**
 *
 * @author csnas
 */
public class PagamentoDAO {


    static String URL = "jdbc:mysql://localhost:3306/Perfumaria_encantus";

    static String login = "root";
    static String senha = "root";

    public static boolean Salvar(Pagamento obj) {
        boolean retorno = false;
        Integer generatedID = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexao = DriverManager.getConnection(URL, login, senha);

            PreparedStatement ComandoSQL = conexao.prepareStatement("INSERT INTO pagamentos (cod_pagamento, subtotal,"
                    + "desconto, juros, valor_final, tipo_pagamento, parcelamento, nome_cliente, cpf_cliente,"
                    + "data_venda) VALUES (?,?,?,?,?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
            ComandoSQL.setInt(1, obj.getCodPag());
            ComandoSQL.setDouble(2, obj.getSubtotal());
            ComandoSQL.setDouble(3, obj.getDesconto());
            ComandoSQL.setDouble(4, obj.getJuros());
            ComandoSQL.setDouble(5, obj.getValorFinal());
            ComandoSQL.setString(6, obj.getTipoPagamento());
            ComandoSQL.setString(7, obj.getParcelamento());
            ComandoSQL.setString(8, obj.getNomeCliente());
            ComandoSQL.setString(9, obj.getCpfCliente());
            ComandoSQL.setDate(10, new java.sql.Date(obj.getDataVenda().getTime()));


            int linhasAfetadas = ComandoSQL.executeUpdate();
            if (linhasAfetadas > 0) {

                ResultSet rs = ComandoSQL.getGeneratedKeys();
                if (rs.next()) {
                    generatedID = rs.getInt(1);
                }

            }
        } catch (ClassNotFoundException | SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        }
        return retorno;
    }

    
    Connection conexao;

    public List<Pagamento> getPagamento() {
           
        List<Pagamento> lista = new ArrayList<>();
        String sql = "SELECT data_venda, cpf_cliente, nome_cliente, valor_final FROM pagamento INNER JOIN clientes ON pagamento.cpf_cliente = cliente.cpf";
        try {
            PreparedStatement stmt = this.conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {

                Pagamento pagamento = new Pagamento();
                Cliente cliente = new Cliente();

                pagamento.setDataVenda(rs.getDate("data_venda"));
                pagamento.setCpfCliente(rs.getString("cpf_cliente"));
                cliente.setCPF(rs.getString("nome_cliente"));
                pagamento.setValorFinal(rs.getDouble("valor_final"));
                
                lista.add(pagamento);
            }
            return lista;
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return lista;
    }
    
    public Cliente PesquisarCPF(String cod) {
        
        try { Class.forName("com.mysql.cj.jdbc.Driver");
            Connection Conexao = DriverManager.getConnection(URL, login, senha);

            PreparedStatement ComandoSQL = Conexao.prepareStatement(("SELECT * FROM clientes WHERE cpf = ?"), 
                    ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            
            Cliente c = new Cliente();
            ComandoSQL.setString(1, cod);
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
