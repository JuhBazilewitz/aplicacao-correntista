package br.com.unicred.correntista.model;

import java.util.Date;

public class ContaCorrente {

    private String nroContaCorrente;
    private Cliente cliente;
    private Date dtAbertura;
    private double saldo;
    
    public String getNroContaCorrente() {
        return nroContaCorrente;
    }
    
    public void setNroContaCorrente(String nroContaCorrente) {
        this.nroContaCorrente = nroContaCorrente;
    }
    
    public Cliente getCliente() {
        return cliente;
    }
    
    public void setCliente(Cliente cdCliente) {
        this.cliente = cdCliente;
    }
    
    public Date getDtAbertura() {
        return dtAbertura;
    }
    
    public void setDtAbertura(Date dtAbertura) {
        this.dtAbertura = dtAbertura;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
