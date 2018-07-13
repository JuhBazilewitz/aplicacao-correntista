package br.com.unicred.correntista.model;

public class Cliente {

    private int cdCliente;
    private String nome;
    private String endereco;
    
    public Cliente() {
        
    }
    
    public int getCdCliente() {
        return cdCliente;
    }
    
    public void setCdCliente(int cdCliente) {
        this.cdCliente = cdCliente;
    }
    
    public String getEndereco() {
        return endereco;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
}
