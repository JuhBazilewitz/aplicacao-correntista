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
     * valida��o
     * 
     * @param cliente
     * @return
     */
    private ResultadoExecucao validacao(Cliente cliente) {
        if(cliente.getCdCliente() <= 0) {
            resultado.erro("C�digo obrigat�rio.", e);
            return resultado;
        } else if(cliente.getNome() == null || cliente.getNome().isEmpty()) {
            resultado.erro("O nome � obrigat�rio.", e);
            return resultado;
        } else if(cliente.getNome().length() > 40) { 
            resultado.erro("Nome com mais de 40 caract�res n�o � permitido.", e);
            return resultado;
        } else if(cliente.getEndereco().length() > 80) {
            resultado.erro("Endere�o com mais de 80 caract�res n�o � permitido.", e);
            return resultado;
        } else if(cliente.getNome().contains("Jr") || cliente.getNome().contains("Junior")) {
            resultado.erro("Nome com 'Jr' ou 'Junior' n�o � permitido", e);
            return resultado;
        } else {
            resultado.sucesso();
            return resultado;
        }
    }
}
