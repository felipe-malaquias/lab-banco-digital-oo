package desafio_banco;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contas;
	
	
	public Banco() {
		this.contas = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	protected void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	
	public void adicionarConta(Conta conta) {
		contas.add(conta);
	}
	
	public void listaContas() {
		System.out.println("Contas do banco " + this.nome + ":");
        for (Conta conta : contas) {
            System.out.println("Número: " + conta.getNumero() + ", Saldo: R$" + conta.getSaldo());
        }
	}
	
	
}
