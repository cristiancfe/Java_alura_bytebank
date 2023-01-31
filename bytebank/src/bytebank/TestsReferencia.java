package bytebank;

public class TestsReferencia {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("saldo da primeira conta " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		
		System.out.println("saldo da segunda conta: " + segundaConta.saldo);
		
		segundaConta.saldo += 100;
		
		System.out.println("saldo da segunda conta: " + segundaConta.saldo );
		System.out.println("saldo da primeira conta " + primeiraConta.saldo);
		
		if(primeiraConta == segundaConta) {
			System.out.println("\r **** a mesma conta **** ");
		}else {
			System.out.println("\r **** Conta diferente **** ");
		}
		System.out.println("mostrando a referencia da conta primeiraConta - " + primeiraConta);
		System.out.println("mostrando a referencia da conta segundaConta - " + segundaConta);
	}

}
