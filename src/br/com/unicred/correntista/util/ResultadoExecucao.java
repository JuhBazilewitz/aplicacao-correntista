package br.com.unicred.correntista.util;

public class ResultadoExecucao {

    private boolean ok;
    private String mensgemSucesso;
    private String mensagemErro;
    private Exception excecao;
    
    public ResultadoExecucao() {
        this.ok = false;
        this.mensgemSucesso = "";
        this.mensagemErro = "Ocorreu um erro... Ainda indefinido.";
    }
    
    public void erro(String mensagem, Exception exececao) {
        this.ok = false;
        this.mensgemSucesso = "";
        this.mensagemErro = mensagem;
        this.excecao = exececao;
    }
    
    public void sucesso(String mensagem) {
        this.ok = true;
        this.mensgemSucesso = mensagem;
        this.mensagemErro = "";
    }
    
    public void sucesso() {
        this.ok = true;
        this.mensgemSucesso = "Executado com sucesso.";
        this.mensagemErro = "";
        this.excecao = null;
    }

    public boolean isOk() {
        return ok;
    }

    public String getMensgemSucesso() {
        return mensgemSucesso;
    }

    public String getMensagemErro() {
        return mensagemErro;
    }

    public Exception getExcecao() {
        return excecao;
    }
}
