package br.com.unicred.correntista.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.unicred.correntista.model.Cliente;
import br.com.unicred.correntista.util.ConectorSqlServer;
import br.com.unicred.correntista.util.ResultadoExecucao;

public class ClienteDAO {

    /**
     * inserir
     * @param cliente
     * @return
     */
    public ResultadoExecucao inserir(Cliente cliente) {
        
        ResultadoExecucao resultado = new ResultadoExecucao();
        
        String sql = "{call dbo.PR_INS_CLIENTE (?, ?, ?, ?)}";
        try {
            ConectorSqlServer conn = new ConectorSqlServer(sql);
            conn.adicionarParametro(1, cliente.getCdCliente());
            conn.adicionarParametro(2, cliente.getNome());
            conn.adicionarParametro(3, cliente.getEndereco());
            conn.adicionarParamentroOut(4);
            
            conn.executar();
            conn.close();
            
            resultado.sucesso();
            
            return resultado;
            
        } catch (SQLException eSQL) {
            
            resultado.erro("Erro de SQL", eSQL);
            return resultado;
            
        } catch(Exception e) {
            
            resultado.erro("Exceção geral", e);
            return resultado;
        }
    }
    
    /**
     * update
     * @param cliente
     * @return
     */
    public ResultadoExecucao alterar(Cliente cliente) {
        
        ResultadoExecucao resultado = new ResultadoExecucao();
        
        String sql = "{call DBO.PR_UPD_CLIENTE (?, ?, ?, ?)}";
        
        return resultado;
    }
    
    /**
     * consultar pelo id
     * @param id
     * @return
     */
    public List<Cliente> consultar(int id) {
        List<Cliente> lista = new ArrayList<>();
        
        
        
//        while(rs.next()) {
//            Cliente cliente = new Cliente();
//            cliente.setCdCliente(rs.getInt("cd_cliente"));
//            
//            lista.add(cliente);
//        }
        
        return lista;
    }
}
