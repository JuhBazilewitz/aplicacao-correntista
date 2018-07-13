package br.com.unicred.correntista.service;

import br.com.unicred.correntista.dao.ClienteDAO;
import br.com.unicred.correntista.model.Cliente;
import br.com.unicred.correntista.util.ResultadoExecucao;

public class ClienteService {
    
    private ResultadoExecucao resultado = new ResultadoExecucao();
    private Exception e = new Exception("Erro");

    /**
     * inserir
     * @param cliente
     * @return
     */
    public ResultadoExecucao inserir(Cliente cliente) {
        ClienteDAO dao = new ClienteDAO();
        resultado = validacao(cliente);
        if(resultado.isOk()) {
            return dao.inserir(cliente);
        } else {
            return resultado;
        }
    }
    
    /**
     * update
     * @param cliente
     * @return
     */
    public ResultadoExecucao alterar(Cliente cliente) {
        ClienteDAO dao = new ClienteDAO();
        
        return dao.alterar(cliente);
    }
    
    /**
     * validação
     * 
     * @param cliente
     * @return
     */
    private ResultadoExecucao validacao(Cliente cliente) {
        if(cliente.getCdCliente() <= 0) {
            resultado.erro("Código obrigatório.", e);
            return resultado;
        } else if(cliente.getNome() == null || cliente.getNome().isEmpty()) {
            resultado.erro("O nome é obrigatório.", e);
            return resultado;
        } else if(cliente.getNome().length() > 40) { 
            resultado.erro("Nome com mais de 40 caractéres não é permitido.", e);
            return resultado;
        } else if(cliente.getEndereco().length() > 80) {
            resultado.erro("Endereço com mais de 80 caractéres não é permitido.", e);
            return resultado;
        } else if(cliente.getNome().contains("Jr") || cliente.getNome().contains("Junior")) {
            resultado.erro("Nome com 'Jr' ou 'Junior' não é permitido", e);
            return resultado;
        } else {
            resultado.sucesso();
            return resultado;
        }
    }
}
