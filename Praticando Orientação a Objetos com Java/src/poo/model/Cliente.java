package poo.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	public Integer codigo;
	public String nome;
	public String cpf;
	
	public static List<Endereco> enderecos;
	
	public void adicionaEndereco(Endereco endereco) {
		if(endereco == null) {
			throw new NullPointerException("Endereco nao pode ser nulo");
		}
		
		if (endereco.cep == null) {
			throw new NullPointerException("Cep nao pode ser nulo");
		}
		
		getEnderecos().add(endereco);
	}
	
	public static List<Endereco> getEnderecos() {
		if(enderecos == null) {
			enderecos = new ArrayList<Endereco>();
		}
		return enderecos;
	}
	
}
