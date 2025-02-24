package banco;

public class Main {
	
	public static void main(String[] args) {
		
		Cliente lucas = new Cliente();
		lucas.setNome("Lucas");
		
		Conta cc = new ContaCorrente(lucas);
		Conta poupanca = new ContaPoupanca(lucas);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
}
