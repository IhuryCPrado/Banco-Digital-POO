
public class Main {

	public static void main(String[] args) {
		Cliente ihury = new Cliente();
		ihury.setNome("Ihury");
		
		
		Conta cc = new ContaCorrente(ihury);
		Conta poupanca = new ContaPoupança(ihury);
		
		cc.depositar(100);		
		cc.transferir(75, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
	
}
