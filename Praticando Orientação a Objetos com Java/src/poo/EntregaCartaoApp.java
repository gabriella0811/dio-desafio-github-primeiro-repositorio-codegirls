package poo;

import java.util.ArrayList;

import poo.model.Cliente;
import poo.model.Endereco;

public class EntregaCartaoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Endereco endereco = new Endereco();
		endereco.cep = "000000";
		// dados do endeteço
		
		Cliente cliente = new Cliente();
		// dados do cliente
		
		if (cliente.getEnderecos() == null) {
			cliente.enderecos = new ArrayList<Endereco>();
		}
		
		cliente.adicionaEndereco(endereco);
		System.out.println("Endereço adicionado com sucesso!");
		

	}

}
