package br.com.unicred.correntista.aplicacao;

import java.io.Console;
import java.util.Scanner;

import javax.swing.JOptionPane;

import br.com.unicred.correntista.model.Cliente;
import br.com.unicred.correntista.service.ClienteService;
import br.com.unicred.correntista.util.ResultadoExecucao;

public class ProgramaConsole {

    public static void main(String[] args) {

        // ClienteService service = new ClienteService();
        //
        // Cliente cliente = new Cliente();
        // cliente.setCdCliente(2);
        // cliente.setNome("Marcia Brasil");
        // cliente.setEndereco("Cristóvão Comlombo");
        //
        // ResultadoExecucao resultado = service.inserir(cliente);
        //
        // if(resultado.isOk()) {
        // System.out.println("Sucesso");
        // System.out.println(resultado.getMensgemSucesso());
        // } else {
        // System.out.println("Ocorreu um erro.");
        // System.out.println(resultado.getMensagemErro());
        // System.out.println("Mensagem de excecao");
        // System.out.println(resultado.getExcecao().getMessage());
        // }

        Integer codigo = 0;
        String nome = "";
        String endereco = "";
        
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha a opção: \n "
                + "1 - Inserir \n "
                + "2 - alterar \n "
                + "3 - Consultar \n "
                + "0 - Sair"));
        switch (opcao) {
        case 1: // inserir
            codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o codigo:"));
            nome = JOptionPane.showInputDialog(null, "Informe o nome:");
            endereco = JOptionPane.showInputDialog(null, "Informe o endereco:");
            break;
        case 2: // alterar
            int i = Integer.parseInt(JOptionPane.showInputDialog(null, "Deseja alterar o codigo? \n"
                    + "1 - sim \n"
                    + "2 - não"));
            if(i == 1) {
                codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o codigo:"));
            }
            nome = JOptionPane.showInputDialog(null, "Informe o nome:");
            endereco = JOptionPane.showInputDialog(null, "Informe o endereco:");
            break;
        case 3: // Consultar
            break;
        case 0: // sair
            break;
        }
        
           
    }
}
