package desafio_banco;

public class Main {

	public static void main(String[] args) {
		Banco Caixa = new Banco();
		Caixa.setNome("Caixa");
		
		Cliente Felipe = new Cliente();
		Felipe.setNome("Felipe");
		
		Conta correnteFelipe = new ContaCorrente(Felipe);
		Conta poupancaFelipe = new ContaPoupanca(Felipe);
		
		Caixa.adicionarConta(correnteFelipe);
		Caixa.adicionarConta(poupancaFelipe);
		
		
		correnteFelipe.depositar(100);
		correnteFelipe.transferir(100, poupancaFelipe);
		
		correnteFelipe.imprimirExtrato();
		poupancaFelipe.imprimirExtrato();
		
		Caixa.listaContas();
	}

}
