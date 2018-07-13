package br.com.unicred.correntista.util;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

public class ConectorSqlServer {

    private Connection conexao;
    private static final String connectionString = "jdbc:sqlserver://UBR3144\\SQLEXPRESS; databaseName=db_curso_unicred; user=sa;password=xongas_1234;";
    private CallableStatement comando;
    
    /**
     * inicialização
     * @param sql
     * @throws SQLException
     */
    public ConectorSqlServer(String sql) throws SQLException {
        this.conexao = DriverManager.getConnection(connectionString);
        this.comando = conexao.prepareCall(sql);
    }
    
    /**
     * fecha a conexão
     * @throws SQLException
     */
    public void close() throws SQLException {
        this.comando.close();
        this.conexao.close();
    }
    
    /**
     * executa a PROC
     * @throws SQLException
     */
    public void executar() throws SQLException {
        this.comando.executeUpdate();
    }
    
    /**
     * executa a consulta select
     * @return
     * @throws SQLException
     */
    public ResultSet obterLeitor() throws SQLException {
        return this.comando.executeQuery();
    }
    
    /**
     * adiciona parametro int
     * @param posicao
     * @param valor
     * @throws SQLException
     */
    public void adicionarParametro(int posicao, int valor) throws SQLException {
        this.comando.setInt(posicao, valor);
    }
    
    /**
     * adiciona parametro string
     * @param posicao
     * @param valor
     * @throws SQLException
     */
    public void adicionarParametro(int posicao, String valor) throws SQLException {
        this.comando.setString(posicao, valor);
    }
    
    /**
     * adiciona paramentro de output
     * @param posicao
     * @throws SQLException
     */
    public void adicionarParamentroOut(int posicao) throws SQLException{
        this.comando.registerOutParameter(posicao, Types.VARCHAR);
    }
}
